-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 26, 2022 at 03:24 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_coolinarypos`
--

-- --------------------------------------------------------

--
-- Table structure for table `log_akun`
--

CREATE TABLE `log_akun` (
  `namapengguna_lama` varchar(18) NOT NULL,
  `namapengguna_baru` varchar(18) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `log_akun`
--

INSERT INTO `log_akun` (`namapengguna_lama`, `namapengguna_baru`, `tanggal`) VALUES
('rina', 'rina', '2022-06-15'),
('diann', 'diann', '2022-06-15'),
('hannan', 'hannan', '2022-06-15'),
('rinass', 'rinass', '2022-06-15'),
('admin', 'admin1', '2022-06-15'),
('admin1', 'admin1', '2022-06-15'),
('admin1', 'admin1', '2022-06-14'),
('admin1', 'admin', '2022-06-14');

-- --------------------------------------------------------

--
-- Table structure for table `tb_barang`
--

CREATE TABLE `tb_barang` (
  `id_barang` char(12) NOT NULL,
  `kode_batang` char(13) NOT NULL,
  `nama_barang` varchar(30) NOT NULL,
  `id_kategori` char(4) NOT NULL,
  `jumlah` int(3) NOT NULL,
  `harga_beli` int(5) NOT NULL,
  `harga_jual` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_barang`
--

INSERT INTO `tb_barang` (`id_barang`, `kode_batang`, `nama_barang`, `id_kategori`, `jumlah`, `harga_beli`, `harga_jual`) VALUES
('MK02', '-', 'Kerupuk Bawang Besar', 'MK', 26, 3500, 4000),
('MK03', '-', 'Rambak', 'MK', 1, 3000, 4000),
('MK04', '-', 'Teri Crispy', 'MK', 10, 7500, 9000),
('MN06', '-', 'Kripik Tempe', 'MN', 8, 12500, 14000),
('MN07', '-', 'Kerupuk Udang', 'MN', 15, 9500, 11000),
('MN10', '', 'Roti', 'MN', 2, 3000, 4000),
('NK01', '8992761002022', 'Sprite 390 ml Botol', 'NK', 20, 5900, 6500),
('NK04', '8997035563544', 'Pocari 350 ml ', 'NK', 3, 5800, 7000),
('NK05', '8992761002015', 'Coca Cola 390 ml', 'NK', 25, 6100, 7000),
('NK06', '', 'Indomilk', 'NK', 200, 3500, 5000),
('NN04', '', 'Kopi', 'NN', 20, 1500, 3000),
('TB01', '899898930039', 'Surya Pro Mild', 'TB', 5, 23200, 25000),
('TB02', '000087656765', 'Surya 12', 'TB', 0, 22500, 24500),
('TB05', '', 'Korek', 'TB', 7, 1250, 2500);

-- --------------------------------------------------------

--
-- Table structure for table `tb_detail_pembelian`
--

CREATE TABLE `tb_detail_pembelian` (
  `id_pembelian` char(13) NOT NULL,
  `id_barang` char(12) NOT NULL,
  `jumlah` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_detail_pembelian`
--

INSERT INTO `tb_detail_pembelian` (`id_pembelian`, `id_barang`, `jumlah`) VALUES
('TB1206220002', 'NK05', 2),
('TB1406220001', 'MK04', 2),
('TB1406220001', 'NK01', 2),
('TB1506220001', 'NK05', 10),
('TB1506220002', 'NK05', 100),
('TB1506220004', 'MK02', 10),
('TB1706220001', 'MK03', 10),
('TB1806220001', 'NK04', 3);

-- --------------------------------------------------------

--
-- Table structure for table `tb_detail_penjualan`
--

CREATE TABLE `tb_detail_penjualan` (
  `id_penjualan` char(13) NOT NULL,
  `id_barang` char(12) NOT NULL,
  `jumlah` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_detail_penjualan`
--

INSERT INTO `tb_detail_penjualan` (`id_penjualan`, `id_barang`, `jumlah`) VALUES
('TJ0102220001', 'NK05', 50),
('TJ0206220008', 'NK01', 2),
('TJ1206220009', 'NK04', 1),
('TJ1406220001', 'MN06', 10),
('TJ1406220007', 'NK01', 3),
('TJ1506220001', 'NK05', 2),
('TJ1506220001', 'NN04', 2),
('TJ1506220002', 'NK05', 2),
('TJ1506220002', 'MN07', 2),
('TJ1506220004', 'MK03', 2),
('TJ0104220003', 'MN07', 100),
('TJ0105220004', 'MN06', 1),
('TJ1706220001', 'MN06', 2),
('TJ1706220002', 'MK03', 17),
('TJ1706220003', 'TB02', 5),
('TJ1706220004', 'TB02', 5),
('TJ1706220005', 'NK04', 3),
('TJ1801220001', 'NK05', 10),
('TJ1802220002', 'NK05', 6),
('TJ1803220003', 'NK05', 3),
('TJ1804220004', 'NK05', 4),
('TJ1805220005', 'NK05', 20),
('TJ1806220006', 'NK05', 8);

-- --------------------------------------------------------

--
-- Table structure for table `tb_karyawan`
--

CREATE TABLE `tb_karyawan` (
  `id_karyawan` char(4) NOT NULL,
  `nama_karyawan` varchar(30) NOT NULL,
  `jenis_kelamin` enum('Pria','Wanita') NOT NULL,
  `alamat_karyawan` varchar(200) NOT NULL,
  `nohp_karyawan` char(13) NOT NULL,
  `nama_pengguna` varchar(8) NOT NULL,
  `kata_sandi` varchar(16) NOT NULL,
  `status` enum('admin','kasir') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_karyawan`
--

INSERT INTO `tb_karyawan` (`id_karyawan`, `nama_karyawan`, `jenis_kelamin`, `alamat_karyawan`, `nohp_karyawan`, `nama_pengguna`, `kata_sandi`, `status`) VALUES
('AD01', 'Admin', 'Wanita', '-', '082332443433', 'admin', 'admin', 'admin'),
('KR01', 'Dian Kristin', 'Wanita', 'Jl Batu Gilang', '082432112345', 'diann', 'diann', 'kasir'),
('KR02', 'Aisyah', 'Wanita', 'Jl Talkandang No 11', '082767665456', 'iis123', '123456789', 'kasir'),
('KR03', 'Hannan', 'Pria', 'Jl Curah Jeru Barat', '082143443256', 'hannan', 'hannan123', 'kasir');

--
-- Triggers `tb_karyawan`
--
DELIMITER $$
CREATE TRIGGER `ubah_namapengguna` AFTER UPDATE ON `tb_karyawan` FOR EACH ROW BEGIN
INSERT INTO log_akun
 SET namapengguna_lama = OLD.nama_pengguna,
 namapengguna_baru = NEW.nama_pengguna,
 tanggal = NOW();
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `tb_kategori`
--

CREATE TABLE `tb_kategori` (
  `id_kategori` char(4) NOT NULL,
  `nama_kategori` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_kategori`
--

INSERT INTO `tb_kategori` (`id_kategori`, `nama_kategori`) VALUES
('MK', 'Makanan Kemasan'),
('MN', 'Makanan Non Kemasan'),
('NK', 'Minuman Kemasan'),
('NN', 'Minuman Non Kemasan'),
('TB', 'Tambahan');

-- --------------------------------------------------------

--
-- Table structure for table `tb_pembelian`
--

CREATE TABLE `tb_pembelian` (
  `id_pembelian` char(13) NOT NULL,
  `tgl_pembelian` datetime NOT NULL,
  `total_harga` int(7) NOT NULL,
  `id_supplier` char(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_pembelian`
--

INSERT INTO `tb_pembelian` (`id_pembelian`, `tgl_pembelian`, `total_harga`, `id_supplier`) VALUES
('TB1106220001', '2022-06-11 06:29:40', 150000, 'SP01'),
('TB1206220002', '2022-06-12 01:33:51', 6000, 'SP03'),
('TB1406220001', '2022-06-14 22:43:32', 25000, 'SP01'),
('TB1406220002', '2022-06-14 23:06:29', 1600000, 'SP01'),
('TB1506220001', '2022-06-15 07:46:24', 61000, 'SP01'),
('TB1506220002', '2022-06-15 08:17:59', 610000, 'SP01'),
('TB1506220003', '2022-06-15 08:44:18', 25000, 'SP02'),
('TB1506220004', '2022-06-15 09:45:11', 40000, 'SP02'),
('TB1706220001', '2022-06-17 15:02:36', 40000, 'SP01'),
('TB1806220001', '2022-06-18 00:41:33', 21000, 'SP01');

-- --------------------------------------------------------

--
-- Table structure for table `tb_pengeluaran`
--

CREATE TABLE `tb_pengeluaran` (
  `id_pengeluaran` char(13) NOT NULL,
  `tgl_pengeluaran` datetime NOT NULL,
  `nama_pengeluaran` varchar(50) NOT NULL,
  `harga_pengeluaran` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_pengeluaran`
--

INSERT INTO `tb_pengeluaran` (`id_pengeluaran`, `tgl_pengeluaran`, `nama_pengeluaran`, `harga_pengeluaran`) VALUES
('TL1106220005', '2022-06-11 11:22:27', 'Gaji Bulan Juni', 200000),
('TL1506220001', '2022-06-15 07:47:18', 'PDAM Juni', 17000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_penjualan`
--

CREATE TABLE `tb_penjualan` (
  `id_penjualan` char(13) NOT NULL,
  `tgl_penjualan` datetime NOT NULL,
  `total_harga` int(7) NOT NULL,
  `id_karyawan` char(4) NOT NULL,
  `tunai` int(11) NOT NULL,
  `kembalian` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_penjualan`
--

INSERT INTO `tb_penjualan` (`id_penjualan`, `tgl_penjualan`, `total_harga`, `id_karyawan`, `tunai`, `kembalian`) VALUES
('TJ0101220006', '2022-01-01 00:16:45', 8000, 'AD01', 10000, 2000),
('TJ0102220001', '2022-02-01 06:25:05', 150000, 'AD01', 200000, 50000),
('TJ0104220003', '2022-04-01 17:44:34', 1100000, 'AD01', 1100000, 0),
('TJ0105220004', '2022-05-01 17:45:10', 104000, 'AD01', 105000, 1000),
('TJ0106220005', '2022-06-01 17:45:53', 12000, 'AD01', 15000, 3000),
('TJ0206220008', '2022-06-02 01:28:32', 82000, 'AD01', 90000, 8000),
('TJ1206220009', '2022-06-12 01:32:22', 7000, 'AD01', 10000, 3000),
('TJ1406220001', '2022-06-14 11:11:10', 140000, 'AD01', 150000, 10000),
('TJ1406220002', '2022-06-14 14:49:46', 4000, 'AD01', 5000, 1000),
('TJ1406220003', '2022-06-14 17:32:07', 16500, 'KR01', 17000, 500),
('TJ1406220004', '2022-06-14 18:17:48', 11000, 'KR01', 15000, 4000),
('TJ1406220005', '2022-06-14 22:42:53', 121000, 'AD01', 130000, 9000),
('TJ1406220006', '2022-06-14 22:57:31', 100500, 'KR01', 150000, 49500),
('TJ1406220007', '2022-06-14 23:05:03', 86000, 'AD01', 100000, 14000),
('TJ1506220001', '2022-06-15 07:45:43', 20000, 'AD01', 20000, 0),
('TJ1506220002', '2022-06-15 08:16:22', 36000, 'AD01', 40000, 4000),
('TJ1506220003', '2022-06-15 08:28:39', 15000, 'AD01', 20000, 5000),
('TJ1506220004', '2022-06-15 09:43:18', 8000, 'AD01', 10000, 2000),
('TJ1706220001', '2022-06-17 15:01:58', 37000, 'AD01', 40000, 3000),
('TJ1706220002', '2022-06-17 20:03:50', 68000, 'AD01', 70000, 2000),
('TJ1706220003', '2022-06-17 22:25:43', 122500, 'AD01', 150000, 27500),
('TJ1706220004', '2022-06-17 22:26:38', 122500, 'AD01', 150000, 27500),
('TJ1706220005', '2022-06-17 23:51:08', 21000, 'AD01', 22000, 1000),
('TJ1801220001', '2022-01-18 00:08:24', 70000, 'AD01', 80000, 10000),
('TJ1802220002', '2022-02-18 00:08:46', 42000, 'AD01', 50000, 8000),
('TJ1803220003', '2022-03-18 00:09:02', 21000, 'AD01', 22000, 1000),
('TJ1804220004', '2022-04-18 00:09:22', 28000, 'AD01', 30000, 2000),
('TJ1805220005', '2022-05-18 00:09:39', 140000, 'AD01', 150000, 10000),
('TJ1806220006', '2022-06-18 00:10:09', 56000, 'AD01', 60000, 4000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_supplier`
--

CREATE TABLE `tb_supplier` (
  `id_supplier` char(4) NOT NULL,
  `nama_supplier` varchar(30) NOT NULL,
  `alamat_supplier` varchar(30) NOT NULL,
  `nohp_supplier` char(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_supplier`
--

INSERT INTO `tb_supplier` (`id_supplier`, `nama_supplier`, `alamat_supplier`, `nohp_supplier`) VALUES
('SP01', 'Toko Biru Daun', 'Jl Cempaka No 121', '082332113246'),
('SP02', 'Toko Umbul Jaya', 'Jl Pandeglang No 12', '082132344567'),
('SP03', 'Toko Maju Jaya', 'Jl Jawa', '082332112345'),
('SP04', 'Toko Senayan', 'Jl Pemuda No 100', '82354665786');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_barang`
--
ALTER TABLE `tb_barang`
  ADD PRIMARY KEY (`id_barang`),
  ADD KEY `jenis` (`id_kategori`);

--
-- Indexes for table `tb_detail_pembelian`
--
ALTER TABLE `tb_detail_pembelian`
  ADD KEY `id_pembelian` (`id_pembelian`),
  ADD KEY `tb_detail_pembelian_ibfk_1` (`id_barang`);

--
-- Indexes for table `tb_detail_penjualan`
--
ALTER TABLE `tb_detail_penjualan`
  ADD KEY `id_transaksi` (`id_penjualan`,`id_barang`),
  ADD KEY `tb_detail_penjualan_ibfk_1` (`id_barang`);

--
-- Indexes for table `tb_karyawan`
--
ALTER TABLE `tb_karyawan`
  ADD PRIMARY KEY (`id_karyawan`),
  ADD UNIQUE KEY `nama_pengguna` (`nama_pengguna`);

--
-- Indexes for table `tb_kategori`
--
ALTER TABLE `tb_kategori`
  ADD PRIMARY KEY (`id_kategori`);

--
-- Indexes for table `tb_pembelian`
--
ALTER TABLE `tb_pembelian`
  ADD PRIMARY KEY (`id_pembelian`),
  ADD KEY `id_supplier` (`id_supplier`);

--
-- Indexes for table `tb_pengeluaran`
--
ALTER TABLE `tb_pengeluaran`
  ADD PRIMARY KEY (`id_pengeluaran`);

--
-- Indexes for table `tb_penjualan`
--
ALTER TABLE `tb_penjualan`
  ADD PRIMARY KEY (`id_penjualan`),
  ADD KEY `id_kasir` (`id_karyawan`);

--
-- Indexes for table `tb_supplier`
--
ALTER TABLE `tb_supplier`
  ADD PRIMARY KEY (`id_supplier`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tb_barang`
--
ALTER TABLE `tb_barang`
  ADD CONSTRAINT `tb_barang_ibfk_1` FOREIGN KEY (`id_kategori`) REFERENCES `tb_kategori` (`id_kategori`) ON UPDATE CASCADE;

--
-- Constraints for table `tb_detail_pembelian`
--
ALTER TABLE `tb_detail_pembelian`
  ADD CONSTRAINT `tb_detail_pembelian_ibfk_1` FOREIGN KEY (`id_barang`) REFERENCES `tb_barang` (`id_barang`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tb_detail_pembelian_ibfk_2` FOREIGN KEY (`id_pembelian`) REFERENCES `tb_pembelian` (`id_pembelian`);

--
-- Constraints for table `tb_detail_penjualan`
--
ALTER TABLE `tb_detail_penjualan`
  ADD CONSTRAINT `tb_detail_penjualan_ibfk_1` FOREIGN KEY (`id_barang`) REFERENCES `tb_barang` (`id_barang`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tb_detail_penjualan_ibfk_2` FOREIGN KEY (`id_penjualan`) REFERENCES `tb_penjualan` (`id_penjualan`) ON UPDATE CASCADE;

--
-- Constraints for table `tb_pembelian`
--
ALTER TABLE `tb_pembelian`
  ADD CONSTRAINT `tb_pembelian_ibfk_1` FOREIGN KEY (`id_supplier`) REFERENCES `tb_supplier` (`id_supplier`) ON UPDATE CASCADE;

--
-- Constraints for table `tb_penjualan`
--
ALTER TABLE `tb_penjualan`
  ADD CONSTRAINT `tb_penjualan_ibfk_1` FOREIGN KEY (`id_karyawan`) REFERENCES `tb_karyawan` (`id_karyawan`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
