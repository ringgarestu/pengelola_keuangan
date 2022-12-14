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
public class DialogSewaKios extends javax.swing.JDialog {

    /**
     * Creates new form DialogProduct
     */
    Connection conn = new connect_DB().db_connection();
    static String status_dialog = "";
    static String static_no_invoice_old;
    
    NumberFormat nf = NumberFormat.getInstance();
    
    public DialogSewaKios() {
        super(new Frame(), "Sewa Kios Detail", true);
        initComponents();
        nf.setMaximumFractionDigits(0);
        nf.setMinimumFractionDigits(0);
        if(status_dialog.equalsIgnoreCase("new")){
            createNoInvoice();
        }else if (status_dialog.equalsIgnoreCase("edit")){
            getDetailSewaKios();
        }
        getKios();
//        getCustomer();
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
        jLabel7 = new javax.swing.JLabel();
        No_Invoice = new javax.swing.JTextField();
        Kios = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Biaya = new javax.swing.JTextField();
        cbKios = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        buttonSave1 = new javax.swing.JButton();
        buttonClose1 = new javax.swing.JButton();
        jMulai = new com.toedter.calendar.JDateChooser();
        jSampai = new com.toedter.calendar.JDateChooser();
        cbStatus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detail Sewa Kios");

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("No Invoice");

        jLabel4.setText("Kode Kios");

        jLabel7.setText("Tanggal Mulai ");

        No_Invoice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                No_InvoiceKeyPressed(evt);
            }
        });

        Kios.setEditable(false);
        Kios.setBackground(new java.awt.Color(255, 255, 255));
        Kios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                KiosKeyPressed(evt);
            }
        });

        jLabel5.setText("Tanggal Sampai ");

        jLabel8.setText("Biaya ");

        jLabel10.setText("Status");

        Biaya.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Biaya.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BiayaKeyPressed(evt);
            }
        });

        cbKios.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbKiosItemStateChanged(evt);
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

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunas", "Belum Lunas" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4)
                                .addComponent(jLabel8))
                            .addGap(47, 47, 47)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(No_Invoice, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(cbKios, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Kios, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbStatus, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Biaya, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                            .addGap(4, 4, 4))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jMulai, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(23, 23, 23)
                        .addComponent(jSampai, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(No_Invoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbKios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Kios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jMulai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSampai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Biaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void No_InvoiceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_No_InvoiceKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            No_Invoice.selectAll();
            No_Invoice.requestFocus();
        }
    }//GEN-LAST:event_No_InvoiceKeyPressed

    private void KiosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KiosKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Kios.selectAll();
            Kios.requestFocus();
        }
    }//GEN-LAST:event_KiosKeyPressed

    private void cbKiosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbKiosItemStateChanged
        try {
            String sql = "select kios_name from kios where kios_code='"+cbKios.getSelectedItem().toString()+"'";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while(rs.next()){Kios.setText(rs.getString("kios_name"));}
        }catch(Exception e){e.printStackTrace();}
//        cbCustomer.requestFocus();
    }//GEN-LAST:event_cbKiosItemStateChanged

    private void BiayaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BiayaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Biaya.setText(nf.format(Double.parseDouble(Biaya.getText().replace(".", ""))));
            Biaya.selectAll();
            Biaya.requestFocus();
        }
    }//GEN-LAST:event_BiayaKeyPressed

    private void buttonSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSave1ActionPerformed
        if(status_dialog.equalsIgnoreCase("new")){
            try {
                SaveNewSewaKios();
            } catch (SQLException ex) {
                Logger.getLogger(DialogSewaKios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (status_dialog.equalsIgnoreCase("edit")){
            SaveEditSewaKios();
        }
        dispose();
    }//GEN-LAST:event_buttonSave1ActionPerformed

    private void buttonClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClose1ActionPerformed
        dispose();
    }//GEN-LAST:event_buttonClose1ActionPerformed

    public void getKios(){
        try {
            String sql = "select * from kios";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while(rs.next()){cbKios.addItem(rs.getString("kios_code"));}
        }catch(Exception e){e.printStackTrace();}
    }
    
//    public void getCustomer(){
//        try {
//            String sql = "select * from customer";
//            ResultSet rs = conn.createStatement().executeQuery(sql);
//            while(rs.next()){cbCustomer.addItem(rs.getString("cust_id"));}
//        }catch(Exception e){e.printStackTrace();}
//    }
    
    public void createNoInvoice(){
        try {
            String sql = "select coalesce(max(no_invoice)+1,3010001) as max_no_invoice from sewakios";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            if(rs.next()){
                No_Invoice.setText(rs.getString("max_no_invoice"));
            }
        }catch(Exception e){e.printStackTrace();}
    }
    
    public void SaveNewSewaKios() throws SQLException{
        if (!"".equals(No_Invoice.getText()) &&
            !"".equals(cbKios.getSelectedItem().toString()) &&
//            !"".equals(cbCustomer.getSelectedItem().toString()) &&
            jMulai.getDate() != null &&
            jSampai.getDate() != null &&
            !"".equals(Biaya.getText().replace(".", "")) &&
            !"".equals(cbStatus.getSelectedItem().toString()) 
                ) {
            String sql = "insert into sewakios values (?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            try {
                ps.setString(1, No_Invoice.getText());
                ps.setString(2, cbKios.getSelectedItem().toString());
//                ps.setString(3, cbCustomer.getSelectedItem().toString());
                String pattern="yyyy-MM-dd";
                SimpleDateFormat format=new SimpleDateFormat(pattern);
                String TanggalMulai,TanggalSampai;
                TanggalMulai=String.valueOf(format.format(jMulai.getDate()));
                TanggalSampai=String.valueOf(format.format(jSampai.getDate()));
                
                ps.setString(3, TanggalMulai);
                ps.setString(4, TanggalSampai);
                
                ps.setString(5, Biaya.getText().replace(",", ""));;
                ps.setString(6, cbStatus.getSelectedItem().toString());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Data Berhasil Disimpan");
            }catch(Exception e){e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Data ada yang salah, Data Gagal Disimpan");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Data Gagal Disimpan");
        }
    }
    
    public void SaveEditSewaKios(){
        try {
            String sql = "update sewakios set no_invoice=?,kios_code=?,tglmulai=?,tglsampai=?,biaya=?, "
                    + "status_bayar=? where no_invoice='"+static_no_invoice_old+"'";
            PreparedStatement ps = conn.prepareStatement(sql);
            try {
                ps.setString(1, No_Invoice.getText());
                ps.setString(2, cbKios.getSelectedItem().toString());
//                ps.setString(3, cbCustomer.getSelectedItem().toString());
                
                String pattern="yyyy-MM-dd";
                SimpleDateFormat format=new SimpleDateFormat(pattern);
                String TanggalMulai,TanggalSampai;
                TanggalMulai=String.valueOf(format.format(jMulai.getDate()));
                TanggalSampai=String.valueOf(format.format(jSampai.getDate()));
                
                ps.setString(3, TanggalMulai);
                ps.setString(4, TanggalSampai);
                
                ps.setString(5, Biaya.getText().replace(",", ""));;
                ps.setString(6, cbStatus.getSelectedItem().toString());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Data Berhasil Diedit");
            }catch(Exception e){e.printStackTrace();}
        }catch(Exception e){e.printStackTrace();}
    }
    
    public void getDetailSewaKios(){
        try{
            String sql = "select *from sewakios where no_invoice='"+static_no_invoice_old+"'";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while(rs.next()){
                No_Invoice.setText(rs.getString("no_invoice"));
                cbKios.setSelectedItem(rs.getString("kios_code"));
//                cbCustomer.setSelectedItem(rs.getString("cust_id"));
                jMulai.setDate(rs.getDate("tglmulai"));
                jSampai.setDate(rs.getDate("tglsampai"));
                Biaya.setText(nf.format(rs.getDouble("biaya")));
                cbStatus.setSelectedItem(rs.getString("status_bayar"));
            }
        }catch(Exception e){e.printStackTrace();}
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Biaya;
    private javax.swing.JTextField Kios;
    public static javax.swing.JTextField No_Invoice;
    private javax.swing.JButton buttonClose1;
    private javax.swing.JButton buttonSave1;
    private javax.swing.JComboBox<String> cbKios;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private com.toedter.calendar.JDateChooser jMulai;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private com.toedter.calendar.JDateChooser jSampai;
    // End of variables declaration//GEN-END:variables
}
