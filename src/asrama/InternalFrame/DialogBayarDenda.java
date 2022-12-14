/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asrama.InternalFrame;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import asrama.connect_DB;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * 
 */
public class DialogBayarDenda extends javax.swing.JDialog {

    /**
     * Creates new form DialogProduct
     */
    Connection conn = new connect_DB().db_connection();
    static String status_dialog = "";
    static String static_id_bayar_kamar_old;
    
    NumberFormat nf = NumberFormat.getInstance();
    
    public DialogBayarDenda() {
        super(new Frame(), "Bayar Detil Detail", true);
        initComponents();
        nf.setMaximumFractionDigits(0);
        nf.setMinimumFractionDigits(0);
        if(status_dialog.equalsIgnoreCase("new")){
            createIdBayarDenda();
        }else if (status_dialog.equalsIgnoreCase("edit")){
            getDetailBayarDenda();
        }
        getInvoice();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Kegiatan = new javax.swing.JTextField();
        Customer = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Biaya = new javax.swing.JTextField();
        cbInvoice = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        buttonSave1 = new javax.swing.JButton();
        buttonClose1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Jumlah = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        IdBayarDenda = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Keterangan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTanggal = new com.toedter.calendar.JDateChooser();
        jTglBayar = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detail Bayar Denda");

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("No Invoice ");

        jLabel4.setText("Kegiatan ");

        jLabel6.setText("Anggota  ");

        Kegiatan.setEditable(false);
        Kegiatan.setBackground(new java.awt.Color(255, 255, 255));
        Kegiatan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                KegiatanKeyPressed(evt);
            }
        });

        Customer.setEditable(false);
        Customer.setBackground(new java.awt.Color(255, 255, 255));
        Customer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CustomerKeyPressed(evt);
            }
        });

        jLabel8.setText("Biaya ");

        jLabel10.setText("Tanggal Bayar ");

        Biaya.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Biaya.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BiayaKeyPressed(evt);
            }
        });

        cbInvoice.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbInvoiceItemStateChanged(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 50));

        buttonSave1.setText("Save");
        buttonSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSave1ActionPerformed(evt);
            }
        });
        jPanel4.add(buttonSave1);

        buttonClose1.setText("Close");
        buttonClose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClose1ActionPerformed(evt);
            }
        });
        jPanel4.add(buttonClose1);

        jLabel2.setText("Jumlah");

        Jumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JumlahKeyPressed(evt);
            }
        });

        jLabel3.setText("ID Pembayaran");

        jLabel9.setText("Keterangan");

        jLabel5.setText("Tanggal ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Jumlah, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTglBayar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Biaya, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTanggal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Customer, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Kegiatan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbInvoice, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IdBayarDenda, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Keterangan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(IdBayarDenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Biaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jTglBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(Keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void KegiatanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KegiatanKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Kegiatan.selectAll();
            Kegiatan.requestFocus();
        }
    }//GEN-LAST:event_KegiatanKeyPressed

    private void CustomerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CustomerKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Customer.selectAll();
            Customer.requestFocus();        }
    }//GEN-LAST:event_CustomerKeyPressed

    private void cbInvoiceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbInvoiceItemStateChanged
        try {
            //sewakamar.*,customer.nama_cust from sewakamar,customer where sewakamar.cust_id=customer.cust_id and sewakamar.status_bayar='0'
            //String sql = "select kamar_name from kamar where kamar_code='"+cbInvoice.getSelectedItem().toString()+"'";
            String sql = "select pelanggaran.*,anggota.nama from pelanggaran,anggota where pelanggaran.kodeanggota=anggota.kode and no_invoice='"+cbInvoice.getSelectedItem().toString()+"'";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while(rs.next()){
                Kegiatan.setText(rs.getString("id_kegiatan"));
                Customer.setText(rs.getString("kodeanggota"));
                Biaya.setText(rs.getString("jumlah"));
                jTanggal.setDate(rs.getDate("tanggal"));
                //   Customer.setText(rs.getString(""));
            
            }
        }catch(Exception e){e.printStackTrace();}
        cbInvoice.requestFocus();
    }//GEN-LAST:event_cbInvoiceItemStateChanged

    private void BiayaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BiayaKeyPressed
 
    }//GEN-LAST:event_BiayaKeyPressed

    private void buttonSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSave1ActionPerformed
        if(status_dialog.equalsIgnoreCase("new")){
            try {
                SaveNewBayarDenda();
            } catch (SQLException ex) {
                Logger.getLogger(DialogBayarDenda.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (status_dialog.equalsIgnoreCase("edit")){
            SaveEditBayarDenda();
        }
        dispose();
    }//GEN-LAST:event_buttonSave1ActionPerformed

    private void buttonClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClose1ActionPerformed
        dispose();
    }//GEN-LAST:event_buttonClose1ActionPerformed

    private void JumlahKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JumlahKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Jumlah.setText(nf.format(Double.parseDouble(Biaya.getText().replace(".", ""))));
            Jumlah.selectAll();
            Jumlah.requestFocus();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JumlahKeyPressed

    public void getInvoice(){
        try {
            String sql = "select pelanggaran.*,anggota.nama from pelanggaran,anggota where pelanggaran.kodeanggota=anggota.kode AND pelanggaran.statusbayar='Lunas'";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while(rs.next()){
                cbInvoice.addItem(rs.getString("no_invoice"));
            }
            
        }catch(Exception e){e.printStackTrace();}
    }
    
    
    public void createIdBayarDenda(){
        try {
            String sql = "select coalesce(max(no_invoice)+1,8010001) as max_id_bayar_kamar from bayardenda";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            if(rs.next()){
                IdBayarDenda.setText(rs.getString("max_id_bayar_kamar"));
            }
        }catch(Exception e){e.printStackTrace();}
    }
    
    public void SaveNewBayarDenda() throws SQLException{
        if(!"".equals(Jumlah.getText().replace(".", "")) &&
           !"".equals(IdBayarDenda.getText()) &&
           !"".equals(cbInvoice.getSelectedItem().toString()) &&
           jTglBayar.getDate() != null &&
           !"".equals(Biaya.getText().replace(".", ""))&&
           !"".equals(Keterangan.getText())
                ) {
            String sql = "insert into bayardenda values (?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            try {
                ps.setString(1, IdBayarDenda.getText());
                ps.setString(2, cbInvoice.getSelectedItem().toString());
                
                String pattern="yyyy-MM-dd";
                SimpleDateFormat format=new SimpleDateFormat(pattern);
                String TglBayar;
                TglBayar=String.valueOf(format.format(jTglBayar.getDate()));
                ps.setString(3, TglBayar);
                ps.setString(4, Biaya.getText().replace(".", ""));
                ps.setString(5, Jumlah.getText().replace(".", ""));
                ps.setString(6, Keterangan.getText());
     
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Data Berhasil Disimpan");
            }catch(Exception e){e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Data ada yang salah, Gagal Disimpan");
            }
        }else{
                JOptionPane.showMessageDialog(rootPane, "Data Gagal Disimpan");
                }
        
    }
    
    public void SaveEditBayarDenda(){
        try {
            String sql = "update bayardenda set idbayardenda=?, no_invoice=?,tanggalbayar=?,biaya=?, jumlah=?, "
                    + "keterangan=? where idbayardenda='"+static_id_bayar_kamar_old+"'";
            PreparedStatement ps = conn.prepareStatement(sql);
            try {
                ps.setString(1, IdBayarDenda.getText());
                ps.setString(2, cbInvoice.getSelectedItem().toString());

                String pattern="yyyy-MM-dd";
                SimpleDateFormat format=new SimpleDateFormat(pattern);
                String TglBayar;
                TglBayar=String.valueOf(format.format(jTglBayar.getDate()));
                ps.setString(3, TglBayar);
                ps.setString(4, Biaya.getText().replace(".", ""));
                ps.setString(5, Jumlah.getText().replace(".", ""));
                ps.setString(6, Keterangan.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Data Berhasil Diedit");
            }catch(Exception e){e.printStackTrace();}
        }catch(Exception e){e.printStackTrace();}
    }
    
    public void getDetailBayarDenda(){
        try{
            String sql = "select *from bayardenda where idbayardenda='"+static_id_bayar_kamar_old+"'";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while(rs.next()){
                IdBayarDenda.setText(rs.getString("idbayardenda"));
                cbInvoice.setSelectedItem(rs.getString("no_invoice"));
                jTglBayar.setDate(rs.getDate("tanggalbayar"));
                Jumlah.setText(nf.format(rs.getDouble("jumlah")));
                Keterangan.setText(rs.getString("keterangan"));
            }
        }catch(Exception e){e.printStackTrace();}
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Biaya;
    private javax.swing.JTextField Customer;
    private javax.swing.JTextField IdBayarDenda;
    private javax.swing.JTextField Jumlah;
    private javax.swing.JTextField Kegiatan;
    private javax.swing.JTextField Keterangan;
    private javax.swing.JButton buttonClose1;
    private javax.swing.JButton buttonSave1;
    private javax.swing.JComboBox<String> cbInvoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private com.toedter.calendar.JDateChooser jTanggal;
    private com.toedter.calendar.JDateChooser jTglBayar;
    // End of variables declaration//GEN-END:variables
}
