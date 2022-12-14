/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asrama.InternalFrame;

import com.sun.glass.events.KeyEvent;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import asrama.connect_DB;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * 
 */
public final class DialogKegiatan extends javax.swing.JDialog {

    Connection conn = new connect_DB().db_connection();
    static String status_dialog = "";
    static String static_kamar_id_old;
    
    public DialogKegiatan() {
        super(new Frame(),"Detail Kegiatan",true);
        initComponents();
        if(status_dialog.equalsIgnoreCase("new")){
            createIDKegiatan();
        }else if (status_dialog.equalsIgnoreCase("edit")){
            getDetailKegiatan();
        }
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
        jLabel2 = new javax.swing.JLabel();
        IDKegiatan = new javax.swing.JTextField();
        NamaKegiatan = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        buttonSave = new javax.swing.JButton();
        buttonClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detil Kegiatan");

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("ID Kegiatan ");

        jLabel2.setText("Nama Kegiatan ");

        IDKegiatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDKegiatanActionPerformed(evt);
            }
        });
        IDKegiatan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IDKegiatanKeyPressed(evt);
            }
        });

        NamaKegiatan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NamaKegiatanKeyPressed(evt);
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
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IDKegiatan)
                    .addComponent(NamaKegiatan, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IDKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NamaKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 50));

        buttonSave.setText("Save");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });
        jPanel3.add(buttonSave);

        buttonClose.setText("Close");
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });
        jPanel3.add(buttonClose);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IDKegiatanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDKegiatanKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            NamaKegiatan.selectAll();
            NamaKegiatan.requestFocus();
        }
    }//GEN-LAST:event_IDKegiatanKeyPressed

    private void NamaKegiatanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NamaKegiatanKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            NamaKegiatan.selectAll();
            NamaKegiatan.requestFocus();
        }
    }//GEN-LAST:event_NamaKegiatanKeyPressed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        if(status_dialog.equalsIgnoreCase("new")){
            try {
                SaveNewKegiatan();
            } catch (SQLException ex) {
                Logger.getLogger(DialogKegiatan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (status_dialog.equalsIgnoreCase("edit")){
            SaveEditKegiatan();
        }
        dispose();
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCloseActionPerformed

    private void IDKegiatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDKegiatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDKegiatanActionPerformed
    public void createIDKegiatan(){
        try {
            String sql = "select coalesce(max(id_kegiatan)+1,5010001) as max_kamar_id from kegiatan";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            if(rs.next()){
                IDKegiatan.setText(rs.getString("max_kamar_id"));
            }
        }catch(Exception e){e.printStackTrace();}
    }
    
    public void SaveNewKegiatan() throws SQLException{
        if (!"".equals(IDKegiatan.getText()) &&
            !"".equals(NamaKegiatan.getText())){
            String sql = "insert into kegiatan values (?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            try {
                ps.setString(1, IDKegiatan.getText());
                ps.setString(2, NamaKegiatan.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Data Berhasil Disimpan");
            }catch(Exception e){e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Data ada yang salah, Gagal Disimpan");}
        } else {
            JOptionPane.showMessageDialog(rootPane, "Data Gagal Disimpan");
        }
    }
    
    public void SaveEditKegiatan(){
        try {
            String sql = "update kegiatan set id_kegiatan=?,namakegiatan=?"
                    + "where id_kegiatan='"+static_kamar_id_old+"'";
            PreparedStatement ps = conn.prepareStatement(sql);
            try {
                ps.setString(1, IDKegiatan.getText());
                ps.setString(2, NamaKegiatan.getText());

                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Data Berhasil Diedit");
            }catch(Exception e){e.printStackTrace();}
        }catch(Exception e){e.printStackTrace();}
    }
    
    public void getDetailKegiatan(){
        try{
            String sql = "select *from kegiatan where id_kegiatan='"+static_kamar_id_old+"'";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while(rs.next()){
                IDKegiatan.setText(rs.getString("id_kegiatan"));
                NamaKegiatan.setText(rs.getString("namakegiatan"));
            }
        }catch(Exception e){e.printStackTrace();}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField IDKegiatan;
    private javax.swing.JTextField NamaKegiatan;
    private javax.swing.JButton buttonClose;
    private javax.swing.JButton buttonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
