/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wawonpahlawan;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Aryaaazr_
 */
public class Laporan extends javax.swing.JFrame {

    /**
     * Creates new form Laporan
     */
    public Laporan() {
        initComponents();
        setLocationRelativeTo(this);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tb_laporan.getTableHeader().setFont(new Font("Roboto", Font.BOLD, 12));
        tb_laporan.getTableHeader().setOpaque(false);
        tb_laporan.getTableHeader().setBackground(new Color(34, 48, 96));
        tb_laporan.getTableHeader().setForeground(new Color(255,255,255));
        tb_laporan.getRowHeight(25);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_laporan = new javax.swing.JTable();
        labelTahun = new javax.swing.JLabel();
        labelBulan = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnCetak = new javax.swing.JLabel();
        btnPilih = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_laporan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "No", "No", "No"
            }
        ));
        jScrollPane1.setViewportView(tb_laporan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 680, 250));

        labelTahun.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelTahun.setForeground(new java.awt.Color(34, 48, 96));
        labelTahun.setText("Tahun");
        getContentPane().add(labelTahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 80, 30));

        labelBulan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelBulan.setForeground(new java.awt.Color(34, 48, 96));
        labelBulan.setText("Bulan");
        getContentPane().add(labelBulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 80, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 210, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 210, 30));

        btnCetak.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Cetak.png"))); // NOI18N
        btnCetak.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCetak.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCetak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCetakMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCetakMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCetakMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCetakMouseReleased(evt);
            }
        });
        getContentPane().add(btnCetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 90, 50));

        btnPilih.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPilih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Pilih.png"))); // NOI18N
        btnPilih.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPilih.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPilih.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPilihMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPilihMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPilihMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPilihMouseReleased(evt);
            }
        });
        getContentPane().add(btnPilih, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 90, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Background Laporan.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPilihMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihMouseEntered
        btnPilih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Pilih_Hover.png")));
    }//GEN-LAST:event_btnPilihMouseEntered

    private void btnPilihMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihMouseExited
        btnPilih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Pilih.png")));
    }//GEN-LAST:event_btnPilihMouseExited

    private void btnPilihMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihMousePressed
        btnPilih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Pilih_Press.png")));
    }//GEN-LAST:event_btnPilihMousePressed

    private void btnPilihMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihMouseReleased
        btnPilih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Pilih_Hover.png")));
    }//GEN-LAST:event_btnPilihMouseReleased

    private void btnCetakMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCetakMouseEntered
        btnCetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Cetak_Hover.png")));
    }//GEN-LAST:event_btnCetakMouseEntered

    private void btnCetakMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCetakMouseExited
        btnCetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Cetak.png")));
    }//GEN-LAST:event_btnCetakMouseExited

    private void btnCetakMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCetakMousePressed
        btnCetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Cetak_Press.png")));
    }//GEN-LAST:event_btnCetakMousePressed

    private void btnCetakMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCetakMouseReleased
        btnCetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Cetak_Hover.png")));
    }//GEN-LAST:event_btnCetakMouseReleased

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Laporan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel btnCetak;
    private javax.swing.JLabel btnPilih;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBulan;
    private javax.swing.JLabel labelTahun;
    private javax.swing.JTable tb_laporan;
    // End of variables declaration//GEN-END:variables
}