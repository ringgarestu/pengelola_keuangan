/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asrama.InternalFrame;

import asrama.connect_DB;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 *
 */
public class DialogBayarKamar extends javax.swing.JDialog {

    /**
     * Creates new form DialogProduct
     */
    Connection conn = new connect_DB().db_connection();
    static String status_dialog = "";
    static String static_id_bayar_kamar_old;
    
    NumberFormat nf = NumberFormat.getInstance();
    
    public DialogBayarKamar() {
        super(new Frame(), "Bayar Kamar Detail", true);
        initComponents();
        nf.setMaximumFractionDigits(0);
        nf.setMinimumFractionDigits(0);
        Date ya=new Date();
        jCalender.setDate(ya);
        if(status_dialog.equalsIgnoreCase("new")){
            createIdBayarKamar();
        }else if (status_dialog.equalsIgnoreCase("edit")){
            getDetailBayarKamar();
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
        jLabel7 = new javax.swing.JLabel();
        Kamar = new javax.swing.JTextField();
        anggota = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Biaya = new javax.swing.JTextField();
        Denda = new javax.swing.JTextField();
        cbInvoice = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        buttonSave1 = new javax.swing.JButton();
        buttonClose1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Jumlah = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        IdBayarKamar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Keterangan = new javax.swing.JTextField();
        jCalender = new com.toedter.calendar.JDateChooser();
        jMulai = new com.toedter.calendar.JDateChooser();
        jSampai = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detail Bayar Kamar");

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("No Invoice");

        jLabel4.setText("Kamar ");

        jLabel6.setText("Anggota  ");

        jLabel7.setText("Tanggl Mulai ");

        Kamar.setEditable(false);
        Kamar.setBackground(new java.awt.Color(255, 255, 255));
        Kamar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                KamarKeyPressed(evt);
            }
        });

        anggota.setEditable(false);
        anggota.setBackground(new java.awt.Color(255, 255, 255));
        anggota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                anggotaKeyPressed(evt);
            }
        });

        jLabel5.setText("Tanggal Sampai ");

        jLabel8.setText("Biaya ");

        jLabel10.setText("Tanggal Bayar");

        Biaya.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Biaya.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BiayaKeyPressed(evt);
            }
        });

        Denda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Denda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DendaKeyPressed(evt);
            }
        });

        cbInvoice.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbInvoiceItemStateChanged(evt);
            }
        });
        cbInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbInvoiceActionPerformed(evt);
            }
        });

        jLabel12.setText("Denda");

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

        jCalender.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalenderPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSampai, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbInvoice, 0, 185, Short.MAX_VALUE)
                        .addComponent(Kamar, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                        .addComponent(anggota, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                        .addComponent(IdBayarKamar)
                        .addComponent(Jumlah)
                        .addComponent(Denda)
                        .addComponent(jCalender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Biaya))
                    .addComponent(Keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMulai, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdBayarKamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jMulai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jSampai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Biaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCalender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Denda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void KamarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KamarKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Kamar.selectAll();
            Kamar.requestFocus();
        }
    }//GEN-LAST:event_KamarKeyPressed

    private void anggotaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_anggotaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            anggota.selectAll();
            anggota.requestFocus();        }
    }//GEN-LAST:event_anggotaKeyPressed

    private void cbInvoiceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbInvoiceItemStateChanged
        try {
            //sewakamar.*,customer.nama_cust from sewakamar,customer where sewakamar.cust_id=customer.cust_id and sewakamar.status_bayar='0'
            //String sql = "select kamar_name from kamar where kamar_code='"+cbInvoice.getSelectedItem().toString()+"'";
            String sql = "SELECT sewakamar.*,anggota.nama FROM sewakamar,anggota WHERE sewakamar.kodeanggota=anggota.kode AND no_invoice='"+cbInvoice.getSelectedItem().toString()+"'";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while(rs.next()){
                Kamar.setText(rs.getString("kamar_code"));
                anggota.setText(rs.getString("kodeanggota"));
                jMulai.setDate(rs.getDate("tglmulai"));
                jSampai.setDate(rs.getDate("tglsampai"));
                Biaya.setText(rs.getString("biaya"));
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
                SaveNewBayarKamar();
            } catch (SQLException ex) {
                Logger.getLogger(DialogBayarKamar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (status_dialog.equalsIgnoreCase("edit")){
            SaveEditBayarKamar();
        }
        dispose();
    }//GEN-LAST:event_buttonSave1ActionPerformed

    private void buttonClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClose1ActionPerformed
        dispose();
    }//GEN-LAST:event_buttonClose1ActionPerformed

    private void DendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DendaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Denda.selectAll();
            Denda.requestFocus();
        }
    }//GEN-LAST:event_DendaKeyPressed

    private void JumlahKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JumlahKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Jumlah.setText(nf.format(Double.parseDouble(Biaya.getText().replace(".", ""))));
            Jumlah.selectAll();
            Jumlah.requestFocus();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JumlahKeyPressed

    private void jCalenderPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalenderPropertyChange
        // TODO add your handling code here:
        
                try {
                String pattern="yyyy-MM-dd";
                SimpleDateFormat format=new SimpleDateFormat(pattern);
                Date JatuhTempo=jMulai.getDate();
                //Date JatuhTempo=format.parse(TanggalMulai.getText());
                
                String pattern2="yyyy-MM-10";
                SimpleDateFormat format2=new SimpleDateFormat(pattern2);
                String Tempo=String.valueOf(format2.format(JatuhTempo));
                JatuhTempo=format.parse(Tempo);
                long mulai =JatuhTempo.getTime();
                long bayar=jCalender.getDate().getTime();
                long diff=bayar-mulai;
                long lama=diff/(24*60*60*1000);
                if(lama>=0) {
                Denda.setText(Long.toString(lama * 10000));
                }
               // Period dif=Period.between(JatuhTempo, jCalender.getDate());
 //               Denda.setText(Tempo);
                } catch (Exception ex)
                        { System.out.println(ex);
                        }
    }//GEN-LAST:event_jCalenderPropertyChange

    private void cbInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbInvoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbInvoiceActionPerformed

    public void getInvoice(){
        try {
            String sql = "SELECT sewakamar.*,anggota.nama FROM sewakamar,anggota WHERE sewakamar.kodeanggota=anggota.kode AND sewakamar.status_bayar=''";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while(rs.next()){
                cbInvoice.addItem(rs.getString("no_invoice"));
            }
            
        }catch(Exception e){e.printStackTrace();}
    }
    
    
    public void createIdBayarKamar(){
        try {
            String sql = "select coalesce(max(no_invoice)+1,5010001) as max_id_bayar_kamar from bayarkamar";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            if(rs.next()){
                IdBayarKamar.setText(rs.getString("max_id_bayar_kamar"));
            }
        }catch(Exception e){e.printStackTrace();}
    }
    
    public void SaveNewBayarKamar() throws SQLException{
        if (!"".equals(IdBayarKamar.getText()) &&
            !"".equals(cbInvoice.getSelectedItem().toString()) &&
            jCalender.getDate() != null &&
            !"".equals(Denda.getText().replace(".", "")) &&
            !"".equals(Jumlah.getText().replace(".", "")) &&
            !"".equals(Keterangan.getText())
                ) {
            String sql = "insert into bayarkamar values (?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            try {
                ps.setString(1, IdBayarKamar.getText());
                ps.setString(2, cbInvoice.getSelectedItem().toString());
                
                String pattern="yyyy-MM-yy";
                SimpleDateFormat format=new SimpleDateFormat(pattern);
                String TanggalBayar;
                TanggalBayar=String.valueOf(format.format(jCalender.getDate()));
                
                ps.setString(3, TanggalBayar);
                ps.setString(4, Denda.getText().replace(".", ""));
                ps.setString(5, Jumlah.getText().replace(".", ""));
                ps.setString(6, Keterangan.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Data Berhasil Disimpan");
            }catch(Exception e){e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Data ada yang salah, Gagal Disimpan");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Data Gagal Disimpan");
        }
        
    }
    
    public void SaveEditBayarKamar(){
        try {
            String sql = "UPDATE bayarkamar SET idbayarkamar=?, no_invoice=?,tanggalbayar=?,denda=?,jumlah=?, "
                    + "keterangan=? WHERE idbayarkamar='"+static_id_bayar_kamar_old+"'";
            PreparedStatement ps = conn.prepareStatement(sql);
            try {
                ps.setString(1, IdBayarKamar.getText());
                ps.setString(2, cbInvoice.getSelectedItem().toString());
                 String pattern="yyyy-MM-yy";
                SimpleDateFormat format=new SimpleDateFormat(pattern);
                String TanggalBayar;
                TanggalBayar=String.valueOf(format.format(jCalender.getDate()));                
                ps.setString(3, TanggalBayar);
                ps.setString(4, Denda.getText().replace(".", ""));
                ps.setString(5, Jumlah.getText().replace(".", ""));
                ps.setString(6, Keterangan.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Data Berhasil Diedit");
            }catch(Exception e){e.printStackTrace();}
        }catch(Exception e){e.printStackTrace();}
    }
    
    public void getDetailBayarKamar(){
        try{
            String sql = "SELECT *FROM bayarkamar WHERE idbayarkamar='"+static_id_bayar_kamar_old+"'";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while(rs.next()){
                IdBayarKamar.setText(rs.getString("idbayarkamar"));
                cbInvoice.setSelectedItem(rs.getString("no_invoice"));
                jCalender.setDate(rs.getDate("tanggalbayar"));
                Denda.setText(nf.format(rs.getDouble("denda")));
                Jumlah.setText(nf.format(rs.getDouble("jumlah")));
                Keterangan.setText(rs.getString("keterangan"));
            }
        }catch(Exception e){e.printStackTrace();}
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Biaya;
    private javax.swing.JTextField Denda;
    private javax.swing.JTextField IdBayarKamar;
    private javax.swing.JTextField Jumlah;
    private javax.swing.JTextField Kamar;
    private javax.swing.JTextField Keterangan;
    private javax.swing.JTextField anggota;
    private javax.swing.JButton buttonClose1;
    private javax.swing.JButton buttonSave1;
    private javax.swing.JComboBox<String> cbInvoice;
    private com.toedter.calendar.JDateChooser jCalender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JDateChooser jMulai;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private com.toedter.calendar.JDateChooser jSampai;
    // End of variables declaration//GEN-END:variables
}
