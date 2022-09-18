 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wawonpahlawan;

import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Aryaaazr_
 */
public class Transaksi extends javax.swing.JInternalFrame {

    /**
     * Creates new form Transaksi
     */
    public Transaksi() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPengeluaran = new javax.swing.JLabel();
        btnPembelian = new javax.swing.JLabel();
        btnPenjualan = new javax.swing.JLabel();
        labelPilihanTransaksi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPengeluaran.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPengeluaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Pengeluaran.png"))); // NOI18N
        btnPengeluaran.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPengeluaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPengeluaranMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPengeluaranMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPengeluaranMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPengeluaranMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPengeluaranMouseReleased(evt);
            }
        });
        getContentPane().add(btnPengeluaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 270, 190));

        btnPembelian.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPembelian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/button pembelian.png"))); // NOI18N
        btnPembelian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPembelianMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPembelianMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPembelianMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPembelianMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPembelianMouseReleased(evt);
            }
        });
        getContentPane().add(btnPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 270, 190));

        btnPenjualan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Penjualan.png"))); // NOI18N
        btnPenjualan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPenjualanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPenjualanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPenjualanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPenjualanMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPenjualanMouseReleased(evt);
            }
        });
        getContentPane().add(btnPenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 270, 190));

        labelPilihanTransaksi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPilihanTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Pilihan Transaksi.png"))); // NOI18N
        labelPilihanTransaksi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelPilihanTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 430, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Background Internal.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPenjualanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPenjualanMouseEntered
        btnPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Penjualan_Hover.png")));
    }//GEN-LAST:event_btnPenjualanMouseEntered

    private void btnPenjualanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPenjualanMouseExited
        btnPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Penjualan.png")));
    }//GEN-LAST:event_btnPenjualanMouseExited

    private void btnPembelianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPembelianMouseEntered
        btnPembelian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Pembelian_Hover.png")));
    }//GEN-LAST:event_btnPembelianMouseEntered

    private void btnPembelianMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPembelianMouseExited
        btnPembelian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Pembelian.png")));
    }//GEN-LAST:event_btnPembelianMouseExited

    private void btnPenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPenjualanMouseClicked
        Penjualan penjualan = new Penjualan(); // Instansiasi class penjualan
        Navbar.DesktopPane.removeAll(); // remove item pada desktop pane
        Navbar.DesktopPane.repaint(); // repaint item pada desktop pane
        Navbar.DesktopPane.add(penjualan).setVisible(true); // add item yang sudah di set pada desktop pane
    }//GEN-LAST:event_btnPenjualanMouseClicked

    private void btnPembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPembelianMouseClicked
        Pembelian pembelian = new Pembelian(); // Instansiasi class pembelian
        Navbar.DesktopPane.removeAll(); // remove item pada desktop pane
        Navbar.DesktopPane.repaint(); // repaint item pada desktop pane
        Navbar.DesktopPane.add(pembelian).setVisible(true); // add item yang sudah di set pada desktop pane
    }//GEN-LAST:event_btnPembelianMouseClicked

    private void btnPengeluaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPengeluaranMouseClicked
        Pengeluaran pengeluaran = new Pengeluaran(); // Instansiasi class pembelian
        Navbar.DesktopPane.removeAll(); // remove item pada desktop pane
        Navbar.DesktopPane.repaint(); // repaint item pada desktop pane
        Navbar.DesktopPane.add(pengeluaran).setVisible(true); // add item yang sudah di set pada desktop pane
    }//GEN-LAST:event_btnPengeluaranMouseClicked

    private void btnPengeluaranMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPengeluaranMouseEntered
        btnPengeluaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Pengeluaran_Hover.png")));
    }//GEN-LAST:event_btnPengeluaranMouseEntered

    private void btnPengeluaranMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPengeluaranMouseExited
        btnPengeluaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Pengeluaran.png")));
    }//GEN-LAST:event_btnPengeluaranMouseExited

    private void btnPenjualanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPenjualanMousePressed
        btnPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Penjualan_Press.png")));
    }//GEN-LAST:event_btnPenjualanMousePressed

    private void btnPenjualanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPenjualanMouseReleased
        btnPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Penjualan_Hover.png")));
    }//GEN-LAST:event_btnPenjualanMouseReleased

    private void btnPembelianMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPembelianMousePressed
        btnPembelian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Pembelian_Press.png")));
    }//GEN-LAST:event_btnPembelianMousePressed

    private void btnPembelianMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPembelianMouseReleased
        btnPembelian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Pembelian_Hover.png")));
    }//GEN-LAST:event_btnPembelianMouseReleased

    private void btnPengeluaranMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPengeluaranMousePressed
        btnPengeluaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Pengeluaran_Press.png")));
    }//GEN-LAST:event_btnPengeluaranMousePressed

    private void btnPengeluaranMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPengeluaranMouseReleased
        btnPengeluaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Pengeluaran_Hover.png")));
    }//GEN-LAST:event_btnPengeluaranMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnPembelian;
    private javax.swing.JLabel btnPengeluaran;
    private javax.swing.JLabel btnPenjualan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelPilihanTransaksi;
    // End of variables declaration//GEN-END:variables
}
