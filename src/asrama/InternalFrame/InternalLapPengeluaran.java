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
import javax.swing.table.TableCellRenderer;
import asrama.RenderingCenter;
import asrama.RenderingRight;
import asrama.connect_DB;
import java.text.SimpleDateFormat;

/**
 *
 *
 */
public class InternalLapPengeluaran extends javax.swing.JInternalFrame {

    JScrollPane scroll = new JScrollPane();
    JTable table = new JTable();
    static DefaultTableModel tabMode;
    
    Connection conn = new connect_DB().db_connection();
    NumberFormat nf = NumberFormat.getInstance();
    String select_id_bayar_kamar;
    String addQuery = "";
    
    public TableCellRenderer right_ = new RenderingRight();
    public TableCellRenderer center_ = new RenderingCenter();
    
    public InternalLapPengeluaran() {
        initComponents();
        nf.setMaximumFractionDigits(0);
        nf.setMinimumFractionDigits(0);
        createTablePengeluaran();
        // getDataBayarKamar("");
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
        buttonFilter = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TglMulai = new com.toedter.calendar.JDateChooser();
        TglSampai = new com.toedter.calendar.JDateChooser();
        buttonClose = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setTitle("Laporang Pengeluaran");
        setFrameIcon(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 829, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(677, 100));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(324, 50));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonFilter.setText("OK");
        buttonFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFilterActionPerformed(evt);
            }
        });
        jPanel4.add(buttonFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 60, -1));

        jLabel2.setText("Periode Laporan");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel4.add(TglMulai, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));
        jPanel4.add(TglSampai, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        buttonClose.setText("Close");
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });
        jPanel4.add(buttonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jPanel2.add(jPanel4);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 829, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFilterActionPerformed
                String pattern="yyyy-MM-dd";
                SimpleDateFormat format=new SimpleDateFormat(pattern);
                String TanggalMulai=String.valueOf(format.format(TglMulai.getDate()));
                String TanggalSampai=String.valueOf(format.format(TglSampai.getDate()));

                addQuery = " where tanggalbayar >=('"+TanggalMulai+"') and tanggalbayar <=('"+TanggalSampai+"')";
                clearTable();
                createTablePengeluaran();
                getDataPengeluaran(addQuery);
 
 //       addQuery = "and (idbayarkamar like ('%"+filterName.getText()+"%') or no_invoice like ('%"+filterName.getText()+"%'))";
 //       getDataBayarKamar(addQuery);
    }//GEN-LAST:event_buttonFilterActionPerformed

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
    dispose();        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCloseActionPerformed

    public void createTablePengeluaran(){
        jPanel1.setLayout(new java.awt.BorderLayout());
        scroll.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        Object[] row = {"id Pengeluaran","Keterangan","tanggalbayar","jumlah"};
        tabMode = new DefaultTableModel(null,row);
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table.setModel(tabMode);
        table.getColumnModel().getColumn(0).setPreferredWidth(100);
        table.getColumnModel().getColumn(1).setPreferredWidth(350);
        table.getColumnModel().getColumn(2).setPreferredWidth(200);
        table.getColumnModel().getColumn(3).setPreferredWidth(200);
        table.getTableHeader().setFont(new Font("Dialog",Font.BOLD,15));
        table.setFont(new java.awt.Font("Dialog",0,12));
        scroll.getViewport().add(table);
        jPanel1.add(scroll,java.awt.BorderLayout.CENTER);
    }
    
    public void getDataPengeluaran(String addQuery){
        clearTable();
        try {
            String sql = "select * from pengeluaran" +addQuery;
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while(rs.next()){
                String idpengeluaran = rs.getString("idpengeluaran");
                String keterangan = rs.getString("keterangan");
                String tanggalbayar = rs.getString("tanggalbayar");
                String biaya = nf.format(rs.getDouble("jumlah"));
                String [] in_table = {idpengeluaran,keterangan,tanggalbayar,biaya};
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
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser TglMulai;
    private com.toedter.calendar.JDateChooser TglSampai;
    private javax.swing.JButton buttonClose;
    private javax.swing.JButton buttonFilter;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
