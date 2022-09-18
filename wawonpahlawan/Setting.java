/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wawonpahlawan;

import java.awt.Insets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Aryaaazr_
 */
public class Setting extends javax.swing.JInternalFrame {

    /**
     * Creates new form Setting
     */
    public Setting() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        tampilkan();
//        txt_id.setBackground(new java.awt.Color(0,0,0,1));
JTextField textField = new JTextField("txt_namakaryawa");
textField.setMargin(new Insets(10, 10, 10, 10));
//        txt_namakaryawan.setBackground(new java.awt.Color(0,0,0,1));
//        txt_nohp.setBackground(new java.awt.Color(0,0,0,1));
//        txt_alamat.setBackground(new java.awt.Color(0,0,0,1));
    }
    public static void tampilkan() {
        
            try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos","root","");
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM tb_kasir WHERE nama_pengguna ='"+Login.namapengguna+"'");
            while(rs.next()){
                txt_idkaryawan.setText(rs.getString("id_kasir"));
                txt_namakaryawan.setText(rs.getString("nama_kasir"));
                txt_nohp.setText(rs.getString("nohp_kasir"));
                txt_alamat.setText(rs.getString("alamat_kasir"));
            }
        }
        catch (SQLException ex){
            Logger.getLogger(Setting.class.getName()).log(Level.SEVERE, null, ex);
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

        txt_namakaryawan = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JTextField();
        txt_nohp = new javax.swing.JTextField();
        txt_idkaryawan = new javax.swing.JTextField();
        btnKeluar = new javax.swing.JLabel();
        btnUbahNamaPengguna = new javax.swing.JLabel();
        btnUbahKataSandi = new javax.swing.JLabel();
        labelPilihanTransaksi = new javax.swing.JLabel();
        fieldIdSupplier = new javax.swing.JLabel();
        labelKategori = new javax.swing.JLabel();
        labelKategori1 = new javax.swing.JLabel();
        fieldIdSupplier1 = new javax.swing.JLabel();
        labelKategori2 = new javax.swing.JLabel();
        labelKategori3 = new javax.swing.JLabel();
        fieldIdSupplier2 = new javax.swing.JLabel();
        fieldIdSupplier3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1036, 784));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_namakaryawan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_namakaryawan.setAlignmentX(10.0F);
        txt_namakaryawan.setBorder(null);
        txt_namakaryawan.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_namakaryawan.setEnabled(false);
        txt_namakaryawan.setOpaque(false);
        txt_namakaryawan.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(txt_namakaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 280, 30));

        txt_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_id.setAlignmentX(10.0F);
        txt_id.setBorder(null);
        txt_id.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_id.setEnabled(false);
        txt_id.setMargin(new java.awt.Insets(2, 5, 2, 2));
        txt_id.setOpaque(false);
        txt_id.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 350, 30));

        txt_alamat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_alamat.setBorder(null);
        txt_alamat.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_alamat.setEnabled(false);
        txt_alamat.setOpaque(false);
        getContentPane().add(txt_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 280, 30));

        txt_nohp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nohp.setBorder(null);
        txt_nohp.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_nohp.setEnabled(false);
        txt_nohp.setOpaque(false);
        getContentPane().add(txt_nohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 280, 30));

        txt_idkaryawan.setBorder(null);
        txt_idkaryawan.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_idkaryawan.setEnabled(false);
        txt_idkaryawan.setOpaque(false);
        getContentPane().add(txt_idkaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 280, 30));

        btnKeluar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Keluar.png"))); // NOI18N
        btnKeluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKeluar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKeluarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnKeluarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnKeluarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnKeluarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnKeluarMouseReleased(evt);
            }
        });
        btnKeluar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnKeluarKeyPressed(evt);
            }
        });
        getContentPane().add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, 140, 60));

        btnUbahNamaPengguna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUbahNamaPengguna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Ubah Nama Pengguna.png"))); // NOI18N
        btnUbahNamaPengguna.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUbahNamaPengguna.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUbahNamaPengguna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUbahNamaPenggunaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUbahNamaPenggunaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUbahNamaPenggunaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUbahNamaPenggunaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUbahNamaPenggunaMouseReleased(evt);
            }
        });
        getContentPane().add(btnUbahNamaPengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 200, 60));

        btnUbahKataSandi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUbahKataSandi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Ubah Kata Sandi.png"))); // NOI18N
        btnUbahKataSandi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUbahKataSandi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUbahKataSandi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUbahKataSandiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUbahKataSandiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUbahKataSandiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUbahKataSandiMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUbahKataSandiMouseReleased(evt);
            }
        });
        getContentPane().add(btnUbahKataSandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 200, 60));

        labelPilihanTransaksi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPilihanTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/biodata.png"))); // NOI18N
        labelPilihanTransaksi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelPilihanTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 430, 120));

        fieldIdSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldIdSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, -1, 30));

        labelKategori.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelKategori.setForeground(new java.awt.Color(34, 48, 96));
        labelKategori.setText("No. Handphone");
        getContentPane().add(labelKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, -1, 30));

        labelKategori1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelKategori1.setForeground(new java.awt.Color(34, 48, 96));
        labelKategori1.setText("ID Karyawan");
        getContentPane().add(labelKategori1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, 30));

        fieldIdSupplier1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldIdSupplier1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, 30));

        labelKategori2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelKategori2.setForeground(new java.awt.Color(34, 48, 96));
        labelKategori2.setText("Nama Karyawan");
        getContentPane().add(labelKategori2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, 30));

        labelKategori3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelKategori3.setForeground(new java.awt.Color(34, 48, 96));
        labelKategori3.setText("Alamat");
        getContentPane().add(labelKategori3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, 30));

        fieldIdSupplier2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldIdSupplier2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, -1, 30));

        fieldIdSupplier3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldIdSupplier3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Background Internal.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUbahNamaPenggunaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahNamaPenggunaMouseClicked
        UbahUsername a = new UbahUsername();
        a.setVisible(true);
    }//GEN-LAST:event_btnUbahNamaPenggunaMouseClicked

    private void btnUbahKataSandiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahKataSandiMouseClicked
        UbahPassword a = new UbahPassword();
        a.setVisible(true);
    }//GEN-LAST:event_btnUbahKataSandiMouseClicked

    private void btnKeluarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnKeluarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKeluarKeyPressed

    private void btnKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeluarMouseClicked
        Login.nama="";
        Login.namapengguna="";
        Login.katasandi="";
        Login.status="";
        Login login = new Login(); // Instansiasi class penjualan
        
        int logout = JOptionPane.showOptionDialog(this, "Anda yakin ingin keluar?", "Keluar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (logout == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            new Login().setVisible(true);
        }
//        dispose();
//        login.setVisible(true);
    }//GEN-LAST:event_btnKeluarMouseClicked

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void btnUbahNamaPenggunaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahNamaPenggunaMouseEntered
        btnUbahNamaPengguna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Ubah Nama Pengguna_Hover.png")));
    }//GEN-LAST:event_btnUbahNamaPenggunaMouseEntered

    private void btnUbahNamaPenggunaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahNamaPenggunaMouseExited
        btnUbahNamaPengguna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Ubah Nama Pengguna.png")));
    }//GEN-LAST:event_btnUbahNamaPenggunaMouseExited

    private void btnUbahNamaPenggunaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahNamaPenggunaMousePressed
        btnUbahNamaPengguna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Ubah Nama Pengguna_Press.png")));
    }//GEN-LAST:event_btnUbahNamaPenggunaMousePressed

    private void btnUbahNamaPenggunaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahNamaPenggunaMouseReleased
        btnUbahNamaPengguna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Ubah Nama Pengguna_Hover.png")));
    }//GEN-LAST:event_btnUbahNamaPenggunaMouseReleased

    private void btnUbahKataSandiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahKataSandiMouseEntered
        btnUbahKataSandi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Ubah Kata Sandi_Hover.png")));
    }//GEN-LAST:event_btnUbahKataSandiMouseEntered

    private void btnUbahKataSandiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahKataSandiMouseExited
        btnUbahKataSandi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Ubah Kata Sandi.png")));
    }//GEN-LAST:event_btnUbahKataSandiMouseExited

    private void btnUbahKataSandiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahKataSandiMousePressed
        btnUbahKataSandi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Ubah Kata Sandi_Press.png")));
    }//GEN-LAST:event_btnUbahKataSandiMousePressed

    private void btnUbahKataSandiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahKataSandiMouseReleased
        btnUbahKataSandi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Ubah Kata Sandi_Hover.png")));
    }//GEN-LAST:event_btnUbahKataSandiMouseReleased

    private void btnKeluarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeluarMouseEntered
        btnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Keluar_Hover.png")));
    }//GEN-LAST:event_btnKeluarMouseEntered

    private void btnKeluarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeluarMouseExited
        btnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Keluar.png")));
    }//GEN-LAST:event_btnKeluarMouseExited

    private void btnKeluarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeluarMousePressed
        btnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Keluar_Press.png")));
    }//GEN-LAST:event_btnKeluarMousePressed

    private void btnKeluarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeluarMouseReleased
        btnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Keluar_Hover.png")));
    }//GEN-LAST:event_btnKeluarMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnKeluar;
    private javax.swing.JLabel btnUbahKataSandi;
    private javax.swing.JLabel btnUbahNamaPengguna;
    private javax.swing.JLabel fieldIdSupplier;
    private javax.swing.JLabel fieldIdSupplier1;
    private javax.swing.JLabel fieldIdSupplier2;
    private javax.swing.JLabel fieldIdSupplier3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelKategori;
    private javax.swing.JLabel labelKategori1;
    private javax.swing.JLabel labelKategori2;
    private javax.swing.JLabel labelKategori3;
    private javax.swing.JLabel labelPilihanTransaksi;
    private static javax.swing.JTextField txt_alamat;
    private static javax.swing.JTextField txt_id;
    private static javax.swing.JTextField txt_idkaryawan;
    private static javax.swing.JTextField txt_namakaryawan;
    private static javax.swing.JTextField txt_nohp;
    // End of variables declaration//GEN-END:variables
}