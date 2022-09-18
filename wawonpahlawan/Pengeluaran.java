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
public class Pengeluaran extends javax.swing.JInternalFrame {

    /**
     * Creates new form Pengeluaran
     */
    public Pengeluaran() {
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

        cmb_pengeluaran = new javax.swing.JComboBox<>();
        txt_namabarang = new javax.swing.JTextField();
        ImageTxtNamaBarang = new javax.swing.JLabel();
        labelIdTransaksi1 = new javax.swing.JLabel();
        labelIdTransaksi = new javax.swing.JLabel();
        LabelPengeluaran = new javax.swing.JLabel();
        labelHarga = new javax.swing.JLabel();
        txt_harga = new javax.swing.JTextField();
        ImageTxtHarga = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_penjualan = new javax.swing.JTable();
        btnTambah = new javax.swing.JLabel();
        btnEdit = new javax.swing.JLabel();
        btnHapus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1037, 557));
        setPreferredSize(new java.awt.Dimension(1037, 557));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmb_pengeluaran.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cmb_pengeluaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis Pengeluaran" }));
        cmb_pengeluaran.setOpaque(false);
        cmb_pengeluaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_pengeluaranActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_pengeluaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 300, 30));

        txt_namabarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_namabarang.setBorder(null);
        txt_namabarang.setEnabled(false);
        txt_namabarang.setOpaque(false);
        getContentPane().add(txt_namabarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 280, 30));

        ImageTxtNamaBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(ImageTxtNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, 30));

        labelIdTransaksi1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelIdTransaksi1.setForeground(new java.awt.Color(34, 48, 96));
        labelIdTransaksi1.setText("Nama ");
        getContentPane().add(labelIdTransaksi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 140, 30));

        labelIdTransaksi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelIdTransaksi.setForeground(new java.awt.Color(34, 48, 96));
        labelIdTransaksi.setText("Jenis Pengeluaran");
        getContentPane().add(labelIdTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 140, 30));

        LabelPengeluaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Icon Pengeluaran.png"))); // NOI18N
        getContentPane().add(LabelPengeluaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        labelHarga.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelHarga.setForeground(new java.awt.Color(34, 48, 96));
        labelHarga.setText("Harga");
        getContentPane().add(labelHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 100, 30));

        txt_harga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_harga.setText("0");
        txt_harga.setBorder(null);
        txt_harga.setEnabled(false);
        txt_harga.setOpaque(false);
        txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 280, 30));

        ImageTxtHarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(ImageTxtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, 30));

        tb_penjualan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tb_penjualan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb_penjualan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb_penjualan.setFocusable(false);
        tb_penjualan.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tb_penjualan.setRowHeight(25);
        tb_penjualan.setSelectionBackground(new java.awt.Color(101, 113, 156));
        tb_penjualan.setShowGrid(true);
        tb_penjualan.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tb_penjualan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 920, 340));

        btnTambah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/add (4) 1.png"))); // NOI18N
        btnTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambah.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTambahMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTambahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTambahMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTambahMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnTambahMouseReleased(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, 60, 60));

        btnEdit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/edit-text 1.png"))); // NOI18N
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEditMouseReleased(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 270, 60, 60));

        btnHapus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/delete (2) 1.png"))); // NOI18N
        btnHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHapusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHapusMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHapusMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnHapusMouseReleased(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 270, 60, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Background Penjualan.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_pengeluaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_pengeluaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_pengeluaranActionPerformed

    private void txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaActionPerformed

    private void btnTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseClicked
//        try{
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos","root","");
//            String idbarang=txt_idbarang.getText();
//            String kodebatang=this.kodebatang.getText();
//            String nama=namabarang.getText();
//            String kategori=cmb_kategori.getSelectedItem().toString();
//            String id_kategori="";
//            String sql = "SELECT id_kategori FROM tb_kategori WHERE nama_kategori = '"+kategori+"'";
//            ResultSet rs = con.createStatement().executeQuery(sql);
//            while(rs.next()){
//                id_kategori = rs.getString("id_kategori");
//            }
//            try{
//                Long.parseLong(txt_jumlah.getText());
//            } catch(Exception e){
//                JOptionPane.showMessageDialog(null,"Masukkan nomor HP dengan benar" );
//            }
//            try{
//                Long.parseLong(txt_hargajual.getText());
//                Long.parseLong(txt_hargabeli.getText());
//            } catch(Exception e){
//                JOptionPane.showMessageDialog(null,"Masukkan harga dengan benar" );
//            }
//            String stok=txt_jumlah.getText();
//            String hargabeli=txt_hargabeli.getText();
//            String hargajual=txt_hargajual.getText();
//            if(Integer.parseInt(txt_hargajual.getText())<Integer.parseInt(txt_hargabeli.getText())){
//                JOptionPane.showMessageDialog(null, "Masukkan Harga Jual dengan Benar");
//            } else {
//                PreparedStatement ps = con.prepareStatement("INSERT INTO tb_barang VALUES('"+idbarang+"','"+kodebatang+"', '" + nama + "','"+id_kategori+"','"+stok+"','"+Long.parseLong(hargabeli)+"','"+Long.parseLong(hargajual)+"')");
//                ps.execute();
//                JOptionPane.showMessageDialog(null,"Data barang berhasil ditambahkan");
//                //            System.out.println(tgllahir);
//                idbarang("");
//                tampilkan();
//                reset();
//            }
//        }
//        catch (SQLException ex){
//            JOptionPane.showMessageDialog(null,"Pilih kategori terlebih dahulu");
//            Logger.getLogger(Barang.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btnTambahMouseClicked

    private void btnTambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseEntered
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Tambah_Hover.png")));
    }//GEN-LAST:event_btnTambahMouseEntered

    private void btnTambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseExited
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Tambah.png")));
    }//GEN-LAST:event_btnTambahMouseExited

    private void btnTambahMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMousePressed
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Tambah_Press.png")));
    }//GEN-LAST:event_btnTambahMousePressed

    private void btnTambahMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseReleased
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Tambah_Hover.png")));
    }//GEN-LAST:event_btnTambahMouseReleased

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
//        try{
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos","root","");
//            String idbarang=txt_idbarang.getText();
//            String kodebatang=this.kodebatang.getText();
//            String nama=namabarang.getText();
//            String kategori=cmb_kategori.getSelectedItem().toString();
//            String id_kategori="";
//            String sql = "SELECT id_kategori FROM tb_kategori WHERE nama_kategori = '"+kategori+"'";
//            ResultSet rs = con.createStatement().executeQuery(sql);
//            while(rs.next()){
//                id_kategori = rs.getString("id_kategori");
//            }
//            String sql2 = "SELECT id_barang FROM tb_barang WHERE kode_batang = '"+kodebatang+"' AND nama_barang = '"+nama+"'";
//            ResultSet rs2 = con.createStatement().executeQuery(sql2);
//            while(rs2.next()){
//                idbarang = rs2.getString("id_barang");
//            }
//            try{
//                Long.parseLong(txt_jumlah.getText());
//            }
//            catch(Exception e){
//                JOptionPane.showMessageDialog(null,"Masukkan jumlah barang dengan benar" );
//            }
//            try{
//                Long.parseLong(txt_hargajual.getText());
//                Long.parseLong(txt_hargabeli.getText());
//            }
//            catch(Exception e){
//                JOptionPane.showMessageDialog(null,"Masukkan harga dengan benar" );
//            }
//            String stok=txt_jumlah.getText();
//            String hargabeli=txt_hargabeli.getText();
//            String hargajual=txt_hargajual.getText();
//            if(Integer.parseInt(txt_hargajual.getText())<Integer.parseInt(txt_hargabeli.getText())){
//                JOptionPane.showMessageDialog(null, "Masukkan Harga Jual dengan Benar");
//            } else {
//                PreparedStatement ps = con.prepareStatement("UPDATE tb_barang SET id_barang = '"+idbarang+"', kode_batang = '"+kodebatang+"', nama_barang ='"+nama+"', id_kategori = '"+id_kategori+"', stok = '"+stok+"', harga_beli='"+hargabeli+"', harga_jual='"+hargajual+"'WHERE id_barang = '"+this.selectedBarangID+"'");
//                ps.execute();
//                JOptionPane.showMessageDialog(null,"Data barang berhasil diedit");
//                tampilkan();
//                reset();
//            }
//        }
//        catch (SQLException ex){
//            Logger.getLogger(Barang.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btnEditMouseClicked

    private void btnEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseEntered
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Edit_Hover.png")));
    }//GEN-LAST:event_btnEditMouseEntered

    private void btnEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseExited
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Edit.png")));
    }//GEN-LAST:event_btnEditMouseExited

    private void btnEditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMousePressed
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Edit_Press.png")));
    }//GEN-LAST:event_btnEditMousePressed

    private void btnEditMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseReleased
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Edit_Hover.png")));
    }//GEN-LAST:event_btnEditMouseReleased

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
//        try{
//            int hapus = JOptionPane.showOptionDialog(null, "Anda yakin ingin menghapus data barang?", "Hapus", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
//            if (hapus == JOptionPane.YES_OPTION) {
//                if(this.selectedBarangID==null){
//                    JOptionPane.showMessageDialog(null,"Pilih barang yang ingin dihapus");
//                } else {
//                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos","root","");
//                    PreparedStatement ps = con.prepareStatement("DELETE FROM tb_barang WHERE id_barang = '"+this.selectedBarangID+"'");
//                    ps.execute();
//                    JOptionPane.showMessageDialog(null,"data barang berhasil dihapus");
//                    tampilkan();}
//            }
//        }
//        catch (SQLException ex){
//            JOptionPane.showMessageDialog(null,"Tidak bisa dihapus karena terdapat data barang di transaksi");
//            Logger.getLogger(Barang.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btnHapusMouseClicked

    private void btnHapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseEntered
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Hapus_Hover.png")));
    }//GEN-LAST:event_btnHapusMouseEntered

    private void btnHapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseExited
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Hapus.png")));
    }//GEN-LAST:event_btnHapusMouseExited

    private void btnHapusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMousePressed
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Hapus_Press.png")));
    }//GEN-LAST:event_btnHapusMousePressed

    private void btnHapusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseReleased
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Hapus_Hover.png")));
    }//GEN-LAST:event_btnHapusMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageTxtHarga;
    private javax.swing.JLabel ImageTxtNamaBarang;
    private javax.swing.JLabel LabelPengeluaran;
    private javax.swing.JLabel btnEdit;
    private javax.swing.JLabel btnHapus;
    private javax.swing.JLabel btnTambah;
    private static javax.swing.JComboBox<String> cmb_pengeluaran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelHarga;
    private javax.swing.JLabel labelIdTransaksi;
    private javax.swing.JLabel labelIdTransaksi1;
    private javax.swing.JTable tb_penjualan;
    public static javax.swing.JTextField txt_harga;
    public static javax.swing.JTextField txt_namabarang;
    // End of variables declaration//GEN-END:variables
}
