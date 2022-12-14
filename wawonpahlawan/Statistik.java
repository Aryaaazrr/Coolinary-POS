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
public class Statistik extends javax.swing.JInternalFrame {

    /**
     * Creates new form Statistik
     */
    public Statistik() {
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

        labelPilihanTransaksi = new javax.swing.JLabel();
        btnLaporan = new javax.swing.JLabel();
        btnRiwayat = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1036, 784));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPilihanTransaksi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPilihanTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Diagram Penghasilan.png"))); // NOI18N
        labelPilihanTransaksi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelPilihanTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 430, 120));

        btnLaporan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Laporan.png"))); // NOI18N
        btnLaporan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLaporan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLaporanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLaporanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLaporanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLaporanMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLaporanMouseReleased(evt);
            }
        });
        getContentPane().add(btnLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 570, 200, 60));

        btnRiwayat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRiwayat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Riwayat.png"))); // NOI18N
        btnRiwayat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRiwayat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRiwayat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRiwayatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRiwayatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRiwayatMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRiwayatMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnRiwayatMouseReleased(evt);
            }
        });
        getContentPane().add(btnRiwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 570, 200, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Background Internal.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRiwayatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRiwayatMouseEntered
        btnRiwayat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Riwayat_Hover.png")));
    }//GEN-LAST:event_btnRiwayatMouseEntered

    private void btnRiwayatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRiwayatMouseExited
        btnRiwayat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Riwayat.png")));
    }//GEN-LAST:event_btnRiwayatMouseExited

    private void btnRiwayatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRiwayatMousePressed
        btnRiwayat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Riwayat_Press.png")));
    }//GEN-LAST:event_btnRiwayatMousePressed

    private void btnRiwayatMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRiwayatMouseReleased
        btnRiwayat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Riwayat_Hover.png")));
    }//GEN-LAST:event_btnRiwayatMouseReleased

    private void btnLaporanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLaporanMouseEntered
        btnLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Laporan_Hover.png")));
    }//GEN-LAST:event_btnLaporanMouseEntered

    private void btnLaporanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLaporanMouseExited
        btnLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Laporan.png")));
    }//GEN-LAST:event_btnLaporanMouseExited

    private void btnLaporanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLaporanMousePressed
        btnLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Laporan_Press.png")));
    }//GEN-LAST:event_btnLaporanMousePressed

    private void btnLaporanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLaporanMouseReleased
        btnLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Laporan_Hover.png")));
    }//GEN-LAST:event_btnLaporanMouseReleased

    private void btnLaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLaporanMouseClicked
        Laporan a = new Laporan();
        a.setVisible(true);
    }//GEN-LAST:event_btnLaporanMouseClicked

    private void btnRiwayatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRiwayatMouseClicked
        Riwayat a = new Riwayat();
        a.setVisible(true);
    }//GEN-LAST:event_btnRiwayatMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnLaporan;
    private javax.swing.JLabel btnRiwayat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelPilihanTransaksi;
    // End of variables declaration//GEN-END:variables
}
