/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asrama.InternalFrame;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import asrama.connect_DB;

/**
 *
 *
 */
public class InternalCustomer extends javax.swing.JInternalFrame {

    JScrollPane scroll = new JScrollPane();
    JTable table = new JTable();
    static DefaultTableModel tabMode;
    
    Connection conn = new connect_DB().db_connection();
    NumberFormat nf = NumberFormat.getInstance();
    String select_cust_id;
    String addQuery = "";
    /**
     * Creates new form InternalCustomer
     */
    public InternalCustomer() {
        initComponents();
        createTableCustomer();
        addListener();
        getDataCustomer("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        filterName = new javax.swing.JTextField();
        buttonFilter = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        buttonAdd = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonClose = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setTitle("Master of Customer");
        setFrameIcon(null);
        getContentPane().setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 673, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 309, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(677, 50));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.FlowLayout(0));

        jLabel1.setText("Search By Name / ID :");
        jPanel4.add(jLabel1);

        filterName.setPreferredSize(new java.awt.Dimension(120, 20));
        filterName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                filterNameKeyPressed(evt);
            }
        });
        jPanel4.add(filterName);

        buttonFilter.setText("Filter");
        buttonFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFilterActionPerformed(evt);
            }
        });
        jPanel4.add(buttonFilter);

        jPanel2.add(jPanel4);

        jPanel5.setOpaque(false);

        buttonAdd.setText("Add");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });
        jPanel5.add(buttonAdd);

        buttonEdit.setText("Edit");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });
        jPanel5.add(buttonEdit);

        buttonDelete.setText("Delete");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });
        jPanel5.add(buttonDelete);

        buttonClose.setText("Close");
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });
        jPanel5.add(buttonClose);

        jPanel2.add(jPanel5);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 673, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        DialogCustomer.status_dialog = "new";
        DialogCustomer dc = new DialogCustomer();
        dc.setVisible(true);
        addQuery = "where (cust_id like ('%"+filterName.getText()+"%') or nama_cust like ('%"+filterName.getText()+"%'))";
        getDataCustomer(addQuery);
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        DialogCustomer.status_dialog = "edit";
        DialogCustomer dc = new DialogCustomer();
        dc.setVisible(true);
        addQuery = "where (cust_id like ('%"+filterName.getText()+"%') or nama_cust like ('%"+filterName.getText()+"%'))";
        getDataCustomer(addQuery);
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        try {
            String sql = "delete from customer where cust_id='"+select_cust_id+"'";
            PreparedStatement ps = conn.prepareStatement(sql);
            try {
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Data Berhasil Dihapus");
            }catch(Exception e){e.printStackTrace();}
        }catch(Exception e){e.printStackTrace();}
        getDataCustomer("");
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFilterActionPerformed
        addQuery = "where (cust_id like ('%"+filterName.getText()+"%') or nama_cust like ('%"+filterName.getText()+"%'))";
        getDataCustomer(addQuery);
    }//GEN-LAST:event_buttonFilterActionPerformed

    private void filterNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filterNameKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            addQuery = "where (cust_id like ('%"+filterName.getText()+"%') or nama_cust like ('%"+filterName.getText()+"%'))";
            getDataCustomer(addQuery);
        }
    }//GEN-LAST:event_filterNameKeyPressed

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
    dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCloseActionPerformed

    public void createTableCustomer(){
        jPanel1.setLayout(new java.awt.BorderLayout());
        scroll.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        Object[] row = {"ID Pelanggan","Nama Pelanggan","Alamat","Kota","NIK","Kode POS","Nomor Hp"};
        tabMode = new DefaultTableModel(null,row);
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table.setModel(tabMode);
        table.getColumnModel().getColumn(0).setPreferredWidth(100);
        table.getColumnModel().getColumn(1).setPreferredWidth(150);
        table.getColumnModel().getColumn(2).setPreferredWidth(200);
        table.getColumnModel().getColumn(3).setPreferredWidth(50);
        table.getColumnModel().getColumn(4).setPreferredWidth(50);
        table.getColumnModel().getColumn(5).setPreferredWidth(100);
        table.getColumnModel().getColumn(6).setPreferredWidth(100);
        table.getTableHeader().setFont(new Font("Dialog",Font.BOLD,15));
        table.setFont(new java.awt.Font("Dialog",0,12));
        scroll.getViewport().add(table);
        jPanel1.add(scroll,java.awt.BorderLayout.CENTER);
    }
    
    public void getDataCustomer(String addQuery){
        clearTable();
        try {
            String sql = "select *from customer "+addQuery+" order by cust_id";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while(rs.next()){
                String cust_id = rs.getString("cust_id");
                String nama_cust = rs.getString("nama_cust");
                String address = rs.getString("address");
                String city = rs.getString("city");
                String id_number = rs.getString("id_number");
                String postal_code = rs.getString("postal_code");
                String phone_number=rs.getString("phone_number");
                String [] in_table = {cust_id,nama_cust,address,city,id_number,postal_code,phone_number};
                tabMode.addRow(in_table);
            }
        }catch(Exception e){e.printStackTrace();}
    }
    
    public void clearTable(){
        int row = table.getRowCount();
        for(int i = 0; i < row ; i++){
            tabMode.removeRow(0);
        }
    }
    
    public void addListener(){
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(table.isEditing()){
                    table.getCellEditor().stopCellEditing();
                }
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                int row = table.getSelectedRow();
                select_cust_id = tabMode.getValueAt(row, 0).toString();
                if(e.getClickCount()==2){
                    DialogCustomer.static_cust_id_old = select_cust_id;
                    DialogCustomer.status_dialog = "edit";
                    DialogCustomer dc = new DialogCustomer();
                    dc.setVisible(true);
                    addQuery = "where (cust_id like ('%"+filterName.getText()+"%') or nama_cust like ('%"+filterName.getText()+"%'))";
                    getDataCustomer(addQuery);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonClose;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonFilter;
    private javax.swing.JTextField filterName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
