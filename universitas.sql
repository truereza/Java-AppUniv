-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 20, 2018 at 07:52 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 5.6.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `universitas`
--

-- --------------------------------------------------------

--
-- Table structure for table `detail_pengajar`
--

CREATE TABLE `detail_pengajar` (
  `id_pengajar` varchar(20) NOT NULL,
  `status` varchar(15) NOT NULL,
  `jurusan` varchar(50) NOT NULL,
  `mata_kuliah` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `detail_ruangan`
--

CREATE TABLE `detail_ruangan` (
  `kode_ruangan` varchar(10) NOT NULL,
  `nama_ruangan` varchar(100) NOT NULL,
  `lantai` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `head_pekerja`
--

CREATE TABLE `head_pekerja` (
  `id_pekerja` int(10) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `gaji` int(10) NOT NULL,
  `bagian` varchar(25) NOT NULL,
  `detail_umum` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `head_ruangan`
--

CREATE TABLE `head_ruangan` (
  `kode_gedung` varchar(10) NOT NULL,
  `nama_ruangan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `head_universitas`
--

CREATE TABLE `head_universitas` (
  `id_universitas` varchar(15) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `no_telepon` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `jurusan`
--

CREATE TABLE `jurusan` (
  `kode_jurusan` varchar(10) NOT NULL,
  `nama_jurusan` varchar(50) NOT NULL,
  `nama_matkul` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `detail_pengajar`
--
ALTER TABLE `detail_pengajar`
  ADD PRIMARY KEY (`id_pengajar`);

--
-- Indexes for table `detail_ruangan`
--
ALTER TABLE `detail_ruangan`
  ADD PRIMARY KEY (`kode_ruangan`);

--
-- Indexes for table `head_pekerja`
--
ALTER TABLE `head_pekerja`
  ADD PRIMARY KEY (`id_pekerja`);

--
-- Indexes for table `head_ruangan`
--
ALTER TABLE `head_ruangan`
  ADD PRIMARY KEY (`kode_gedung`);

--
-- Indexes for table `head_universitas`
--
ALTER TABLE `head_universitas`
  ADD PRIMARY KEY (`id_universitas`);

--
-- Indexes for table `jurusan`
--
ALTER TABLE `jurusan`
  ADD PRIMARY KEY (`kode_jurusan`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `detail_ruangan`
--
ALTER TABLE `detail_ruangan`
  ADD CONSTRAINT `detail_ruangan_ibfk_1` FOREIGN KEY (`kode_ruangan`) REFERENCES `head_ruangan` (`kode_gedung`);

--
-- Constraints for table `head_ruangan`
--
ALTER TABLE `head_ruangan`
  ADD CONSTRAINT `head_ruangan_ibfk_1` FOREIGN KEY (`kode_gedung`) REFERENCES `head_universitas` (`id_universitas`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
