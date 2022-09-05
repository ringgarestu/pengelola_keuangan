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
public class InternalKegiatan extends javax.swing.JInternalFrame {

    JScrollPane scroll = new JScrollPane();
    JTable table = new JTable();
    static DefaultTableModel tabMode;
    
    Connection conn = new connect_DB().db_connection();
    NumberFormat nf = NumberFormat.getInstance();
    String select_kamar_id;
    String addQuery = "";
    /**
     * Creates new form InternalCustomer
     */
    public InternalKegiatan() {
        initComponents();
        createTableKegiatan();
        addListener();
        getDataKegiatan("");
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

        setTitle("Master of Kegiatan");
        setFrameIcon(null);

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
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

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
        DialogKegiatan.status_dialog = "new";
        DialogKegiatan dc = new DialogKegiatan();
        dc.setVisible(true);
        addQuery = "where (id_kegiatan like ('%"+filterName.getText()+"%') or namakegiatan like ('%"+filterName.getText()+"%'))";
        getDataKegiatan(addQuery);
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        DialogKegiatan.status_dialog = "edit";
        DialogKegiatan dc = new DialogKegiatan();
        dc.setVisible(true);
        addQuery = "where (id_kegiatan like ('%"+filterName.getText()+"%') or namakegiatan like ('%"+filterName.getText()+"%'))";
        getDataKegiatan(addQuery);
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        try {
            String sql = "delete from kegiatan where id_kegiatan='"+select_kamar_id+"'";
            PreparedStatement ps = conn.prepareStatement(sql);
            try {
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Data Berhasil Dihapus");
            }catch(Exception e){e.printStackTrace();}
        }catch(Exception e){e.printStackTrace();}
        getDataKegiatan("");
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFilterActionPerformed
        addQuery = "where (id_kegiatan like ('%"+filterName.getText()+"%') or namakegiatan like ('%"+filterName.getText()+"%'))";
        getDataKegiatan(addQuery);
    }//GEN-LAST:event_buttonFilterActionPerformed

    private void filterNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filterNameKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            addQuery = "where (id_kegiatan like ('%"+filterName.getText()+"%') or nemakegiatan like ('%"+filterName.getText()+"%'))";
            getDataKegiatan(addQuery);
        }
    }//GEN-LAST:event_filterNameKeyPressed

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
    dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCloseActionPerformed

    public void createTableKegiatan(){
        jPanel1.setLayout(new java.awt.BorderLayout());
        scroll.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        Object[] row = {"ID Kegiatan","Nama Kegiatan"};
        tabMode = new DefaultTableModel(null,row);
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table.setModel(tabMode);
        table.getColumnModel().getColumn(0).setPreferredWidth(100);
        table.getColumnModel().getColumn(1).setPreferredWidth(300);
        table.getTableHeader().setFont(new Font("Dialog",Font.BOLD,15));
        table.setFont(new java.awt.Font("Dialog",0,12));
        scroll.getViewport().add(table);
        jPanel1.add(scroll,java.awt.BorderLayout.CENTER);
    }
    
    public void getDataKegiatan(String addQuery){
        clearTable();
        try {
            String sql = "select *from kegiatan "+addQuery+" order by id_kegiatan";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while(rs.next()){
                String id_kegiatan = rs.getString("id_kegiatan");
                String namakegiatan = rs.getString("namakegiatan");
                String [] in_table = {id_kegiatan,namakegiatan};
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
                select_kamar_id = tabMode.getValueAt(row, 0).toString();
                if(e.getClickCount()==2){
                    DialogKegiatan.static_kamar_id_old = select_kamar_id;
                    DialogKegiatan.status_dialog = "edit";
                    DialogKegiatan dc = new DialogKegiatan();
                    dc.setVisible(true);
                    addQuery = "where (id_kegiatan like ('%"+filterName.getText()+"%') or namakegiatan like ('%"+filterName.getText()+"%'))";
                    getDataKegiatan(addQuery);
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
