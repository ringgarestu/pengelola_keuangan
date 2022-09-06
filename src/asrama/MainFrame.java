/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asrama;

import asrama.InternalFrame.DialogAnggota;
import asrama.InternalFrame.DialogCustomer;
import asrama.InternalFrame.DialogKamar;
import asrama.InternalFrame.InternalAnggota;
import asrama.InternalFrame.InternalBayarDenda;
import asrama.InternalFrame.InternalBayarKamar;
import asrama.InternalFrame.InternalBayarKamarTamu;
import asrama.InternalFrame.InternalBayarKios;
import asrama.InternalFrame.InternalCustomer;
import asrama.InternalFrame.InternalKamar;
import asrama.InternalFrame.InternalKegiatan;
import asrama.InternalFrame.InternalKelolaAkun;
import asrama.InternalFrame.InternalKios;
import asrama.InternalFrame.InternalLapKeuangan;
import asrama.InternalFrame.InternalLapPembayaran;
import asrama.InternalFrame.InternalLapPengeluaran;
import asrama.InternalFrame.InternalPelanggaran;
import asrama.InternalFrame.InternalPengeluaran;
import asrama.InternalFrame.InternalSewaKamar;
import asrama.InternalFrame.InternalSewaKamarTamu;
import asrama.InternalFrame.InternalSewaKios;
import asrama.InternalFrame.InternalTagihanBlmBayar;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 *
 */
public class MainFrame extends javax.swing.JFrame {

    Connection con = new connect_DB().db_connection();
    Cursor hourglassCursor = new Cursor(Cursor.WAIT_CURSOR);
    Cursor normalCursor = new Cursor(Cursor.DEFAULT_CURSOR);
    public MainFrame() {
        initComponents();
        connect_DB con_db = new connect_DB();
        con_db.load_DriverJDBC();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBG = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuFile = new javax.swing.JMenu();
        MenuLogout = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuMasterAnggota = new javax.swing.JMenuItem();
        MenuMasterCustomer = new javax.swing.JMenuItem();
        MenuMasterSupplier = new javax.swing.JMenuItem();
        MenuMasterStockTaking = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuSewaKamar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuPurchase = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        MenuSalesReturn = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        MenuSalesReport = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        MenuPurchaseReport = new javax.swing.JMenuItem();
        MenuProductReport = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        kelolaakun = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBG.add(jLabel3);

        getContentPane().add(panelBG, java.awt.BorderLayout.CENTER);

        MenuFile.setText("File");

        MenuLogout.setText("Logout/Keluar");
        MenuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuLogoutActionPerformed(evt);
            }
        });
        MenuFile.add(MenuLogout);

        jMenuBar1.add(MenuFile);

        jMenu2.setText("Master Of Data");

        MenuMasterAnggota.setText("Anggota");
        MenuMasterAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMasterAnggotaActionPerformed(evt);
            }
        });
        jMenu2.add(MenuMasterAnggota);

        MenuMasterCustomer.setText("Pelanggan");
        MenuMasterCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMasterCustomerActionPerformed(evt);
            }
        });
        jMenu2.add(MenuMasterCustomer);

        MenuMasterSupplier.setText("Kamar");
        MenuMasterSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMasterSupplierActionPerformed(evt);
            }
        });
        jMenu2.add(MenuMasterSupplier);

        MenuMasterStockTaking.setText("Kios");
        MenuMasterStockTaking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMasterStockTakingActionPerformed(evt);
            }
        });
        jMenu2.add(MenuMasterStockTaking);

        jMenuItem6.setText("Kegiatan");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Transaksi");

        MenuSewaKamar.setText("Sewa Kamar Anggota");
        MenuSewaKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSewaKamarActionPerformed(evt);
            }
        });
        jMenu3.add(MenuSewaKamar);

        jMenuItem1.setText("Sewa Kamar Tamu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        MenuPurchase.setText("Sewa Kios");
        MenuPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPurchaseActionPerformed(evt);
            }
        });
        jMenu3.add(MenuPurchase);

        jMenuItem7.setText("Pelanggaran");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        MenuSalesReturn.setText("Pembayaran Kamar Anggota");
        MenuSalesReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSalesReturnActionPerformed(evt);
            }
        });
        jMenu3.add(MenuSalesReturn);

        jMenuItem2.setText("Pembayaran Kamar Tamu");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Pembayaran Sewa Kios");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Pembayaran Denda Kegiatan");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Pengeluaran");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Laporan");

        MenuSalesReport.setText("Pembayaran");
        MenuSalesReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSalesReportActionPerformed(evt);
            }
        });
        jMenu4.add(MenuSalesReport);

        jMenuItem8.setText("Tagihan yang belum dibayar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        MenuPurchaseReport.setText("Laporan Pengeluaran");
        MenuPurchaseReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPurchaseReportActionPerformed(evt);
            }
        });
        jMenu4.add(MenuPurchaseReport);

        MenuProductReport.setText("Laporan Keuangan");
        MenuProductReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProductReportActionPerformed(evt);
            }
        });
        jMenu4.add(MenuProductReport);

        jMenuBar1.add(jMenu4);

        jMenu1.setText("Pengguna");

        kelolaakun.setText("Kelola Akun");
        kelolaakun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelolaakunActionPerformed(evt);
            }
        });
        jMenu1.add(kelolaakun);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuMasterCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMasterCustomerActionPerformed
        setCursor(hourglassCursor);
        panelBG.setLayout(new java.awt.BorderLayout());
        panelBG.removeAll();
        repaint();
        InternalCustomer ic = new InternalCustomer();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - ic.getSize().width)/2;
        int y = (screen.height - ic.getSize().height)/2;
        ic.setLocation(x, y);
        ic.show();
        panelBG.add(ic);
        try{
            ic.setSelected(true);
        }catch(java.beans.PropertyVetoException pv){pv.printStackTrace();}
        setCursor(normalCursor);
    }//GEN-LAST:event_MenuMasterCustomerActionPerformed

    private void MenuMasterSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMasterSupplierActionPerformed
        setCursor(hourglassCursor);
        panelBG.setLayout(new java.awt.BorderLayout());
        panelBG.removeAll();
        repaint();
        InternalKamar ic = new InternalKamar();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - ic.getSize().width)/2;
        int y = (screen.height - ic.getSize().height)/2;
        ic.setLocation(x, y);
        ic.show();
        panelBG.add(ic);
        try{
            ic.setSelected(true);
        }catch(java.beans.PropertyVetoException pv){pv.printStackTrace();}
        setCursor(normalCursor);        
    }//GEN-LAST:event_MenuMasterSupplierActionPerformed

    private void MenuMasterStockTakingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMasterStockTakingActionPerformed
        setCursor(hourglassCursor);
        panelBG.setLayout(new java.awt.BorderLayout());
        panelBG.removeAll();
        repaint();
        InternalKios ic = new InternalKios();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - ic.getSize().width)/2;
        int y = (screen.height - ic.getSize().height)/2;
        ic.setLocation(x, y);
        ic.show();
        panelBG.add(ic);
        try{
            ic.setSelected(true);
        }catch(java.beans.PropertyVetoException pv){pv.printStackTrace();}
        setCursor(normalCursor);          
    }//GEN-LAST:event_MenuMasterStockTakingActionPerformed

    private void MenuSewaKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSewaKamarActionPerformed
        setCursor(hourglassCursor);
        panelBG.setLayout(new java.awt.BorderLayout());
        panelBG.removeAll();
        repaint();
        InternalSewaKamar ic = new InternalSewaKamar();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - ic.getSize().width)/2;
        int y = (screen.height - ic.getSize().height)/2;
        ic.setLocation(x, y);
        ic.show();
        panelBG.add(ic);
        try{
            ic.setSelected(true);
        }catch(java.beans.PropertyVetoException pv){pv.printStackTrace();}
        setCursor(normalCursor);
        
    }//GEN-LAST:event_MenuSewaKamarActionPerformed

    private void MenuPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPurchaseActionPerformed
        setCursor(hourglassCursor);
        panelBG.setLayout(new java.awt.BorderLayout());
        panelBG.removeAll();
        repaint();
        InternalSewaKios ic = new InternalSewaKios();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - ic.getSize().width)/2;
        int y = (screen.height - ic.getSize().height)/2;
        ic.setLocation(x, y);
        ic.show();
        panelBG.add(ic);
        try{
            ic.setSelected(true);
        }catch(java.beans.PropertyVetoException pv){pv.printStackTrace();}
        setCursor(normalCursor);
        
        
    }//GEN-LAST:event_MenuPurchaseActionPerformed

    private void MenuSalesReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSalesReturnActionPerformed
       setCursor(hourglassCursor);
        panelBG.setLayout(new java.awt.BorderLayout());
        panelBG.removeAll();
        repaint();
        InternalBayarKamar ic = new InternalBayarKamar();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - ic.getSize().width)/2;
        int y = (screen.height - ic.getSize().height)/2;
        ic.setLocation(x, y);
        ic.show();
        panelBG.add(ic);
        try{
            ic.setSelected(true);
        }catch(java.beans.PropertyVetoException pv){pv.printStackTrace();}
        setCursor(normalCursor);        
    }//GEN-LAST:event_MenuSalesReturnActionPerformed

    private void MenuSalesReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSalesReportActionPerformed
       setCursor(hourglassCursor);
        panelBG.setLayout(new java.awt.BorderLayout());
        panelBG.removeAll();
        repaint();
        InternalLapPembayaran ic = new InternalLapPembayaran();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - ic.getSize().width)/2;
        int y = (screen.height - ic.getSize().height)/2;
        ic.setLocation(x, y);
        ic.show();
        panelBG.add(ic);
        try{
            ic.setSelected(true);
        }catch(java.beans.PropertyVetoException pv){pv.printStackTrace();}
        setCursor(normalCursor);        
        // TODO add your handling code here:
        // TODO add your handling code here:
        
    }//GEN-LAST:event_MenuSalesReportActionPerformed

    private void MenuPurchaseReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPurchaseReportActionPerformed
       setCursor(hourglassCursor);
        panelBG.setLayout(new java.awt.BorderLayout());
        panelBG.removeAll();
        repaint();
        InternalLapPengeluaran ic = new InternalLapPengeluaran();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - ic.getSize().width)/2;
        int y = (screen.height - ic.getSize().height)/2;
        ic.setLocation(x, y);
        ic.show();
        panelBG.add(ic);
        try{
            ic.setSelected(true);
        }catch(java.beans.PropertyVetoException pv){pv.printStackTrace();}
        setCursor(normalCursor);               
    }//GEN-LAST:event_MenuPurchaseReportActionPerformed

    private void MenuProductReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProductReportActionPerformed
       setCursor(hourglassCursor);
        panelBG.setLayout(new java.awt.BorderLayout());
        panelBG.removeAll();
        repaint();
        InternalLapKeuangan ic = new InternalLapKeuangan();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - ic.getSize().width)/2;
        int y = (screen.height - ic.getSize().height)/2;
        ic.setLocation(x, y);
        ic.show();
        panelBG.add(ic);
        try{
            ic.setSelected(true);
        }catch(java.beans.PropertyVetoException pv){pv.printStackTrace();}
        setCursor(normalCursor);               
       
    }//GEN-LAST:event_MenuProductReportActionPerformed

    private void MenuMasterAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMasterAnggotaActionPerformed
        setCursor(hourglassCursor);
        panelBG.setLayout(new java.awt.BorderLayout());
        panelBG.removeAll();
        repaint();
        InternalAnggota ia = new InternalAnggota();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - ia.getSize().width)/2;
        int y = (screen.height - ia.getSize().height)/2;
        ia.setLocation(x, y);
        ia.show();
        panelBG.add(ia);
        try{
            ia.setSelected(true);
        }catch(java.beans.PropertyVetoException pv){pv.printStackTrace();}
        setCursor(normalCursor);
        


        // TODO add your handling code here:
    }//GEN-LAST:event_MenuMasterAnggotaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        setCursor(hourglassCursor);
        panelBG.setLayout(new java.awt.BorderLayout());
        panelBG.removeAll();
        repaint();
        InternalSewaKamarTamu ic = new InternalSewaKamarTamu();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - ic.getSize().width)/2;
        int y = (screen.height - ic.getSize().height)/2;
        ic.setLocation(x, y);
        ic.show();
        panelBG.add(ic);
        try{
            ic.setSelected(true);
        }catch(java.beans.PropertyVetoException pv){pv.printStackTrace();}
        setCursor(normalCursor);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       setCursor(hourglassCursor);
        panelBG.setLayout(new java.awt.BorderLayout());
        panelBG.removeAll();
        repaint();
        InternalBayarKamarTamu ic = new InternalBayarKamarTamu();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - ic.getSize().width)/2;
        int y = (screen.height - ic.getSize().height)/2;
        ic.setLocation(x, y);
        ic.show();
        panelBG.add(ic);
        try{
            ic.setSelected(true);
        }catch(java.beans.PropertyVetoException pv){pv.printStackTrace();}
        setCursor(normalCursor);        
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       setCursor(hourglassCursor);
        panelBG.setLayout(new java.awt.BorderLayout());
        panelBG.removeAll();
        repaint();
        InternalBayarKios ic = new InternalBayarKios();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - ic.getSize().width)/2;
        int y = (screen.height - ic.getSize().height)/2;
        ic.setLocation(x, y);
        ic.show();
        panelBG.add(ic);
        try{
            ic.setSelected(true);
        }catch(java.beans.PropertyVetoException pv){pv.printStackTrace();}
        setCursor(normalCursor);            // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        setCursor(hourglassCursor);
        panelBG.setLayout(new java.awt.BorderLayout());
        panelBG.removeAll();
        repaint();
        InternalPelanggaran ic = new InternalPelanggaran();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - ic.getSize().width)/2;
        int y = (screen.height - ic.getSize().height)/2;
        ic.setLocation(x, y);
        ic.show();
        panelBG.add(ic);
        try{
            ic.setSelected(true);
        }catch(java.beans.PropertyVetoException pv){pv.printStackTrace();}
        setCursor(normalCursor);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        setCursor(hourglassCursor);
        panelBG.setLayout(new java.awt.BorderLayout());
        panelBG.removeAll();
        repaint();
        InternalKegiatan ic = new InternalKegiatan();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - ic.getSize().width)/2;
        int y = (screen.height - ic.getSize().height)/2;
        ic.setLocation(x, y);
        ic.show();
        panelBG.add(ic);
        try{
            ic.setSelected(true);
        }catch(java.beans.PropertyVetoException pv){pv.printStackTrace();}
        setCursor(normalCursor);          
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       setCursor(hourglassCursor);
        panelBG.setLayout(new java.awt.BorderLayout());
        panelBG.removeAll();
        repaint();
        InternalBayarDenda ic = new InternalBayarDenda();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - ic.getSize().width)/2;
        int y = (screen.height - ic.getSize().height)/2;
        ic.setLocation(x, y);
        ic.show();
        panelBG.add(ic);
        try{
            ic.setSelected(true);
        }catch(java.beans.PropertyVetoException pv){pv.printStackTrace();}
        setCursor(normalCursor);        
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       setCursor(hourglassCursor);
        panelBG.setLayout(new java.awt.BorderLayout());
        panelBG.removeAll();
        repaint();
        InternalPengeluaran ic = new InternalPengeluaran();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - ic.getSize().width)/2;
        int y = (screen.height - ic.getSize().height)/2;
        ic.setLocation(x, y);
        ic.show();
        panelBG.add(ic);
        try{
            ic.setSelected(true);
        }catch(java.beans.PropertyVetoException pv){pv.printStackTrace();}
        setCursor(normalCursor);        
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
       setCursor(hourglassCursor);
        panelBG.setLayout(new java.awt.BorderLayout());
        panelBG.removeAll();
        repaint();
        InternalTagihanBlmBayar ic = new InternalTagihanBlmBayar();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - ic.getSize().width)/2;
        int y = (screen.height - ic.getSize().height)/2;
        ic.setLocation(x, y);
        ic.show();
        panelBG.add(ic);
        try{
            ic.setSelected(true);
        }catch(java.beans.PropertyVetoException pv){pv.printStackTrace();}
        setCursor(normalCursor);        
        // TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void MenuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuLogoutActionPerformed
dispose();
    }//GEN-LAST:event_MenuLogoutActionPerformed

    private void kelolaakunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelolaakunActionPerformed
        setCursor(hourglassCursor);
        panelBG.setLayout(new java.awt.BorderLayout());
        panelBG.removeAll();
        repaint();
        InternalKelolaAkun ic = new InternalKelolaAkun();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - ic.getSize().width)/2;
        int y = (screen.height - ic.getSize().height)/2;
        ic.setLocation(x, y);
        ic.show();
        panelBG.add(ic);
        try {
            ic.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        setCursor(normalCursor);         
    }//GEN-LAST:event_kelolaakunActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                createDimension();
            }
        });
    }
    
    public static void createDimension(){
        MainFrame frame = new MainFrame();
        frame.login();
        frame.setVisible(true);
        frame.setExtendedState(MAXIMIZED_BOTH);
    }
    
    public void login(){
        Login log = new Login();
        log.setVisible(true);
        if(Login.status_app == 1){}
        else {
            dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuFile;
    private javax.swing.JMenuItem MenuLogout;
    private javax.swing.JMenuItem MenuMasterAnggota;
    private javax.swing.JMenuItem MenuMasterCustomer;
    private javax.swing.JMenuItem MenuMasterStockTaking;
    private javax.swing.JMenuItem MenuMasterSupplier;
    private javax.swing.JMenuItem MenuProductReport;
    private javax.swing.JMenuItem MenuPurchase;
    private javax.swing.JMenuItem MenuPurchaseReport;
    private javax.swing.JMenuItem MenuSalesReport;
    private javax.swing.JMenuItem MenuSalesReturn;
    private javax.swing.JMenuItem MenuSewaKamar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem kelolaakun;
    private javax.swing.JPanel panelBG;
    // End of variables declaration//GEN-END:variables
}
