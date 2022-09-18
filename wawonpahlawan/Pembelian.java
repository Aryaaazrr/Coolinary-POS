/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wawonpahlawan;

import config.Config;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelListener;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import static wawonpahlawan.Supplier.model;

/**
 *
 * @author Aryaaazr_
 */
public class Pembelian extends javax.swing.JInternalFrame {

    /**
     * Creates new form Penjualan
     */
    Connection con;
    ResultSet rs;
    int total_bayar;
    String idpembelian;
    DefaultTableModel modelpb;
    TableModelListener tbmodel;
    static String selectedBarangID;
    boolean result;
    int row;
    int[] rows;
    ArrayList<String> idlist = new ArrayList<String>();
    public Pembelian() {
        initComponents();
        tb_pembelian.getTableHeader().setFont(new Font("Roboto", Font.BOLD, 12));
        tb_pembelian.getTableHeader().setOpaque(false);
        tb_pembelian.getTableHeader().setBackground(new Color(34, 48, 96));
        tb_pembelian.getTableHeader().setForeground(new Color(255,255,255));
        tb_pembelian.getRowHeight(25);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        idTransaksi();
        tampilCombo();
        txt_total.setText("0");
//        loadTable();
        tampilkanpembelian();
    }
    
    public void idTransaksi() {
        try {
            java.util.Date tgl = new java.util.Date();  
            java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("ddMMyy");  
            java.text.SimpleDateFormat tanggal = new java.text.SimpleDateFormat("ddMMyyyy");  
            con=(Connection)Config.configDB();
            String sql = "SELECT MAX(id_pembelian)as max FROM tb_pembelian";
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                String NoJual = rs.getString("max").substring(8);
                String AN = "" + (Integer.valueOf(NoJual) + 1);
//                String AN = "" + (Integer.parseInt(txt_idsupplier.getText()) + 1);
                String Nol = "";
                
                if(AN.length()==1){
                    Nol = "000";
                }else if(AN.length()==2){
                    Nol = "00";
                }else if(AN.length()==3){
                    Nol = "0";
                }else if(AN.length()==4){
                    Nol = "";
                }
                txt_idtransaksi.setText("TR" + kal.format(tgl) + Nol + AN);//sesuaikan dengan variable namenya
            } else {
                txt_idtransaksi.setText("TR0000000001");//sesuaikan dengan variable namenya
            }
            rs.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();//penanganan masalah
        }
    }
    public static void tampilCombo(){
        try{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinaryPOS","root","");
        PreparedStatement ps = con.prepareStatement("SELECT * FROM tb_supplier");
        ResultSet rs = ps.executeQuery();
        
            while(rs.next()){
                cmb_supplier.addItem(rs.getString("nama_supplier"));
            }
        
        rs.last();
        int jumlahdata = rs.getRow();
        rs.first();
        } catch(Exception e){
        }
    }
    private void _settotal() {
        int row = tb_pembelian.getRowCount();
        int total = 0;
        for (int i = 0; i < row; i++) {
            int harga_barang = Integer.parseInt(tb_pembelian.getValueAt(i, 2).toString()); //22000
            int jumlah = Integer.parseInt(tb_pembelian.getValueAt(i, 3).toString()); //11
            total = total + (harga_barang * jumlah);
        }
        this.total_bayar = total;
        txt_total.setText(String.valueOf(this.total_bayar));
    }
    public void tampilkanpembelian() {

        String[] judul = {"ID", "Nama Barang", "Harga", "Jumlah"};
        modelpb = new DefaultTableModel(judul, 0);
        tb_pembelian.setModel(modelpb);

    }
//    private void loadTable() {
//        String value = txt_cari.getText();
//        // membuat tampilan table
//        DefaultTableModel model = new DefaultTableModel();
//        model.addColumn("No");
//        model.addColumn("ID Barang");
//        model.addColumn("Nama Barang");
//        model.addColumn("Harga");
//        model.addColumn("Jumlah");
//        // memanggil data di SQL
//        try {
//            int no = 1;
//            String SQL = "SELECT * FROM tb_detail_penjualan WHERE id_penjualan = '"+this.idpenjualan+"'";
//            java.sql.Connection conn = (Connection)config.Config.configDB();
//            java.sql.Statement stm = conn.createStatement();
//            java.sql.ResultSet res = stm.executeQuery(SQL);
//            while (res.next()) {
//                model.addRow(new Object[] {
//                no++,res.getString(1),
//                    res.getString(2),
//                    res.getString(3),
//                    txt_jumlah.getText()
//                });    
//            }
//            tb_penjualan.setModel(model);
//        } catch (Exception e) {
// }
//    }
    public void reset(){
        txt_idbarang.setText("");
        txt_jumlah.setText("0");
        txt_namabarang.setText("");
        txt_harga.setText("0");
//        cmb_supplier.setSelectedItem("Pilih Supplier");
        txt_kodebatang.setText("");
//        txt_tunai.setText("0");
//        txt_kembalian.setText("0");
//        txt_total.setText("0");
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
        tb_pembelian = new javax.swing.JTable();
        LabelPenjualan = new javax.swing.JLabel();
        btnTambah = new javax.swing.JLabel();
        btnBayar = new javax.swing.JLabel();
        btnHapus = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        txt_kodebatang = new javax.swing.JTextField();
        ImageTxtTotal = new javax.swing.JLabel();
        labelTunai = new javax.swing.JLabel();
        txt_harga = new javax.swing.JTextField();
        ImageTxtHarga = new javax.swing.JLabel();
        ImageTxtKembalian1 = new javax.swing.JLabel();
        cmb_supplier = new javax.swing.JComboBox<>();
        txt_namabarang = new javax.swing.JTextField();
        ImageTxtNamaBarang = new javax.swing.JLabel();
        txt_jumlah = new javax.swing.JTextField();
        ImageTxtJumlah = new javax.swing.JLabel();
        txt_idbarang = new javax.swing.JTextField();
        ImageTxtIdBarang = new javax.swing.JLabel();
        txt_idtransaksi = new javax.swing.JTextField();
        ImageTxtIdTransaksi = new javax.swing.JLabel();
        labelHarga = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        labelNamaBarang = new javax.swing.JLabel();
        labelJumlah = new javax.swing.JLabel();
        labelIdBarang = new javax.swing.JLabel();
        labelKodeBatang = new javax.swing.JLabel();
        labelIdTransaksi = new javax.swing.JLabel();
        btn_daftarbarang = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_pembelian.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tb_pembelian.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb_pembelian.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_pembelian.setFocusable(false);
        tb_pembelian.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tb_pembelian.setRowHeight(25);
        tb_pembelian.setSelectionBackground(new java.awt.Color(101, 113, 156));
        tb_pembelian.setShowGrid(true);
        tb_pembelian.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tb_pembelian);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 920, 280));

        LabelPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/label pembelian.png"))); // NOI18N
        getContentPane().add(LabelPenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        btnTambah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Tambah.png"))); // NOI18N
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
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, 60, 60));

        btnBayar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Checkout.png"))); // NOI18N
        btnBayar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBayar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBayarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBayarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBayarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBayarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnBayarMouseReleased(evt);
            }
        });
        getContentPane().add(btnBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 330, 60, 60));

        btnHapus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Hapus.png"))); // NOI18N
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
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 330, 60, 60));

        txt_total.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txt_total.setText("0");
        txt_total.setBorder(null);
        txt_total.setEnabled(false);
        txt_total.setOpaque(false);
        getContentPane().add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 280, 80));

        txt_kodebatang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_kodebatang.setBorder(null);
        txt_kodebatang.setOpaque(false);
        txt_kodebatang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kodebatangActionPerformed(evt);
            }
        });
        txt_kodebatang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_kodebatangKeyReleased(evt);
            }
        });
        getContentPane().add(txt_kodebatang, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 280, 30));

        ImageTxtTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field total.png"))); // NOI18N
        getContentPane().add(ImageTxtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, -1, 80));

        labelTunai.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelTunai.setForeground(new java.awt.Color(34, 48, 96));
        labelTunai.setText("Supplier");
        getContentPane().add(labelTunai, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 100, 30));

        txt_harga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_harga.setText("0");
        txt_harga.setBorder(null);
        txt_harga.setEnabled(false);
        txt_harga.setOpaque(false);
        getContentPane().add(txt_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 280, 30));

        ImageTxtHarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(ImageTxtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 310, 30));

        ImageTxtKembalian1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(ImageTxtKembalian1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 300, 30));

        cmb_supplier.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cmb_supplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Supplier" }));
        cmb_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_supplierActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 300, 30));

        txt_namabarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_namabarang.setBorder(null);
        txt_namabarang.setEnabled(false);
        txt_namabarang.setOpaque(false);
        getContentPane().add(txt_namabarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 280, 30));

        ImageTxtNamaBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(ImageTxtNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, -1, 30));

        txt_jumlah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_jumlah.setText("0");
        txt_jumlah.setBorder(null);
        txt_jumlah.setOpaque(false);
        getContentPane().add(txt_jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 50, 30));

        ImageTxtJumlah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field jumlah.png"))); // NOI18N
        getContentPane().add(ImageTxtJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 70, 30));

        txt_idbarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_idbarang.setBorder(null);
        txt_idbarang.setEnabled(false);
        txt_idbarang.setOpaque(false);
        getContentPane().add(txt_idbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 130, 30));

        ImageTxtIdBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text fielld id barang.png"))); // NOI18N
        ImageTxtIdBarang.setText("jLabel10");
        getContentPane().add(ImageTxtIdBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 150, 30));

        txt_idtransaksi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_idtransaksi.setBorder(null);
        txt_idtransaksi.setEnabled(false);
        txt_idtransaksi.setOpaque(false);
        getContentPane().add(txt_idtransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 280, 30));

        ImageTxtIdTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(ImageTxtIdTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, 30));

        labelHarga.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelHarga.setForeground(new java.awt.Color(34, 48, 96));
        labelHarga.setText("Harga");
        getContentPane().add(labelHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 100, 30));

        labelTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(34, 48, 96));
        labelTotal.setText("Total");
        getContentPane().add(labelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 100, 40));

        labelNamaBarang.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelNamaBarang.setForeground(new java.awt.Color(34, 48, 96));
        labelNamaBarang.setText("Nama Barang");
        getContentPane().add(labelNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 100, 30));

        labelJumlah.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelJumlah.setForeground(new java.awt.Color(34, 48, 96));
        labelJumlah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelJumlah.setText("Jumlah");
        labelJumlah.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 60, 30));

        labelIdBarang.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelIdBarang.setForeground(new java.awt.Color(34, 48, 96));
        labelIdBarang.setText("ID Barang");
        getContentPane().add(labelIdBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 90, 30));

        labelKodeBatang.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelKodeBatang.setForeground(new java.awt.Color(34, 48, 96));
        labelKodeBatang.setText("Kode Batang");
        getContentPane().add(labelKodeBatang, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 100, 30));

        labelIdTransaksi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelIdTransaksi.setForeground(new java.awt.Color(34, 48, 96));
        labelIdTransaksi.setText("ID Transaksi");
        getContentPane().add(labelIdTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 90, 30));

        btn_daftarbarang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_daftarbarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Daftar Barang.png"))); // NOI18N
        btn_daftarbarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_daftarbarang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_daftarbarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_daftarbarangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_daftarbarangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_daftarbarangMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_daftarbarangMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_daftarbarangMouseReleased(evt);
            }
        });
        getContentPane().add(btn_daftarbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 160, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Background Penjualan.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseClicked
    
        try {
            Integer.parseInt(txt_jumlah.getText());
            this.idpembelian=txt_idtransaksi.getText();
            String idbarang = txt_idbarang.getText();
            String namabarang = txt_namabarang.getText();
            String harga = txt_harga.getText();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos", "root", "");
            String query = "SELECT stok FROM tb_barang WHERE id_barang= '"+idbarang+"'" ;
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                if (txt_jumlah.getText().equals("")||txt_jumlah.getText().equals("0")) {
                    JOptionPane.showMessageDialog(null, "Masukkan jumlah barang");
                } else {
                    result=idlist.contains(idbarang);
                         if(result==false){
                            idlist.add(idbarang);
                            String data[] = {idbarang, namabarang, harga, txt_jumlah.getText()};
                            modelpb.addRow(data);
                            _settotal();
                            reset();
                         } else{
                            JOptionPane.showMessageDialog(null, "Data barang sudah terinput");
                        }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Masukkan jumlah dengan benar");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnTambahMouseClicked

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        int row = tb_pembelian.getSelectedRow();//0
                idlist.remove(row);
                modelpb.removeRow(row);
                _settotal();
                reset();
    }//GEN-LAST:event_btnHapusMouseClicked

    private void btnBayarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBayarMouseClicked
        int rows = tb_pembelian.getRowCount();
       String supplier = String.valueOf(cmb_supplier.getSelectedItem());
       String query;
       PreparedStatement ps;
        try{
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos","root","");
          String id_supplier="";
            String sql = "SELECT id_supplier FROM tb_supplier WHERE nama_supplier = '"+supplier+"'";
            ResultSet rs = con.createStatement().executeQuery(sql);
            while(rs.next()){
            id_supplier = rs.getString("id_supplier");
            }
          try {
              con.setAutoCommit(false);
                query = "INSERT INTO tb_pembelian VALUES ('"+idpembelian+"', now(),'"+this.total_bayar+"','"+id_supplier+"')";
                ps = con.prepareStatement(query);     
                ps.execute();
                    for (int i = 0; i < rows; i++) {
                        query = "INSERT INTO tb_detail_pembelian VALUES ('"+idpembelian+"','"+tb_pembelian.getValueAt(i, 0).toString()+"','"+tb_pembelian.getValueAt(i, 3).toString()+"')";
                        ps = con.prepareStatement(query);
                        ps.execute();
                        System.out.println(Integer.parseInt(tb_pembelian.getValueAt(i, 3).toString()));
                        query = "UPDATE tb_barang SET stok = stok + "+(Integer.parseInt(tb_pembelian.getValueAt(i, 3).toString()))+" WHERE id_barang = '"+tb_pembelian.getValueAt(i,0).toString()+"'";
                        ps = con.prepareStatement(query);
                        ps.execute();
                    }
                    con.commit();
                    JOptionPane.showMessageDialog(null,"Data pembelian berhasil ditambahkan");
                    idlist.clear();
                    reset();
                    cmb_supplier.setSelectedItem("Pilih Supplier");
                    txt_total.setText("0");
                    modelpb.setRowCount(0);
                    idTransaksi();
           } catch (Exception e) {
               con.rollback();
               System.out.println(e.getMessage());
           }
       } 
       catch(Exception e){
       }
    }//GEN-LAST:event_btnBayarMouseClicked

    private void cmb_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_supplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_supplierActionPerformed

    private void txt_kodebatangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kodebatangActionPerformed

    }//GEN-LAST:event_txt_kodebatangActionPerformed

    private void txt_kodebatangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_kodebatangKeyReleased
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos","root","");
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM tb_barang WHERE kode_batang ='"+txt_kodebatang.getText()+"'");
            while(rs.next()){
                txt_idbarang.setText(rs.getString("id_barang"));
                txt_namabarang.setText(rs.getString("nama_barang"));
                txt_harga.setText(rs.getString("harga_beli"));
            }
        }
        catch (SQLException ex){
            Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_kodebatangKeyReleased

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

    private void btnBayarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBayarMouseEntered
        btnBayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Checkout_Hover.png")));
    }//GEN-LAST:event_btnBayarMouseEntered

    private void btnBayarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBayarMouseExited
        btnBayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Checkout.png")));
    }//GEN-LAST:event_btnBayarMouseExited

    private void btnBayarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBayarMousePressed
        btnBayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Checkout_Press.png")));
    }//GEN-LAST:event_btnBayarMousePressed

    private void btnBayarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBayarMouseReleased
        btnBayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Checkout_Hover.png")));
    }//GEN-LAST:event_btnBayarMouseReleased

    private void btn_daftarbarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_daftarbarangMouseClicked
        DaftarBarang a = new DaftarBarang();
        a.setVisible(true);
    }//GEN-LAST:event_btn_daftarbarangMouseClicked

    private void btn_daftarbarangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_daftarbarangMouseEntered
        btn_daftarbarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Daftar Barang_Hover.png")));
    }//GEN-LAST:event_btn_daftarbarangMouseEntered

    private void btn_daftarbarangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_daftarbarangMouseExited
        btn_daftarbarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Daftar Barang.png")));
    }//GEN-LAST:event_btn_daftarbarangMouseExited

    private void btn_daftarbarangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_daftarbarangMousePressed
        btn_daftarbarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Daftar Barang_Press.png")));
    }//GEN-LAST:event_btn_daftarbarangMousePressed

    private void btn_daftarbarangMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_daftarbarangMouseReleased
        btn_daftarbarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Daftar Barang_Hover.png")));
    }//GEN-LAST:event_btn_daftarbarangMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageTxtHarga;
    private javax.swing.JLabel ImageTxtIdBarang;
    private javax.swing.JLabel ImageTxtIdTransaksi;
    private javax.swing.JLabel ImageTxtJumlah;
    private javax.swing.JLabel ImageTxtKembalian1;
    private javax.swing.JLabel ImageTxtNamaBarang;
    private javax.swing.JLabel ImageTxtTotal;
    private javax.swing.JLabel LabelPenjualan;
    private javax.swing.JLabel btnBayar;
    private javax.swing.JLabel btnHapus;
    private javax.swing.JLabel btnTambah;
    private javax.swing.JLabel btn_daftarbarang;
    private static javax.swing.JComboBox<String> cmb_supplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelHarga;
    private javax.swing.JLabel labelIdBarang;
    private javax.swing.JLabel labelIdTransaksi;
    private javax.swing.JLabel labelJumlah;
    private javax.swing.JLabel labelKodeBatang;
    private javax.swing.JLabel labelNamaBarang;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelTunai;
    private javax.swing.JTable tb_pembelian;
    public static javax.swing.JTextField txt_harga;
    public static javax.swing.JTextField txt_idbarang;
    public javax.swing.JTextField txt_idtransaksi;
    public javax.swing.JTextField txt_jumlah;
    private javax.swing.JTextField txt_kodebatang;
    public static javax.swing.JTextField txt_namabarang;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
