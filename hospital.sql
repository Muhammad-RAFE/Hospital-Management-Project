-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 14, 2020 at 03:18 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital`
--

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `ID` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Specilist` varchar(20) NOT NULL,
  `Qualification` varchar(20) NOT NULL,
  `Room No` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`ID`, `Name`, `Specilist`, `Qualification`, `Room No`) VALUES
(101, 'Dr.Rahat Hasan', 'Eye', 'Mbbs,Ms', 308),
(102, 'Prof.Dr kabir Ahmed', 'Cancer Specialist', 'Mbbs,Mphil', 310),
(103, 'Prof.Dr Mohammad You', 'Urology', 'Mbbs,Mmsc', 311),
(104, 'Dr Hassan Karim', 'Dental', 'Mbbs,Mmsc,', 402),
(106, 'Prof Dr Jamal Uddin', 'Medicine', 'Mbbs,Fcps', 403),
(107, 'Dr Sumon Hossain', 'Cardiology', 'Mbbs,Mphil,Fcps', 407),
(108, 'Prof Dr Mohammad Hos', 'Eye', 'Mbbs,Ms,Frcps', 409),
(109, 'Dr Omar Faruk', 'Cancer', 'Mbbs,MM', 409),
(110, 'Dr Jannat Parvin', 'children Specialist', 'Mbbs,Ms,Dcm', 411);

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `ID` int(11) NOT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Disease` varchar(20) DEFAULT NULL,
  `Gender` varchar(10) DEFAULT NULL,
  `Admit` varchar(10) DEFAULT NULL,
  `Age` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`ID`, `Name`, `Disease`, `Gender`, `Admit`, `Age`) VALUES
(11001, 'Md kabir', 'Cancer', 'Male', 'Yes', 43),
(11002, 'Aklima Aktar', 'Head pain', 'Female', 'No', 32),
(11003, 'Billal Sheikh', 'Autoimmune Diseases', 'Female', 'Yes', 24),
(11007, 'Easin Mia', 'Liver Disease', 'Male', 'Yes', 56),
(11008, 'Rased Ali', 'Cancer', 'Male', 'Yes', 55),
(11011, 'kamrul Bepari', 'Allergies & Asthma.', 'Male', 'No', 44),
(11012, 'Miss Runa Aktar', 'Chronic lower respir', 'Female', 'Yes', 53),
(11013, 'Basar khan', 'Malaria', 'Male', 'No', 22),
(11014, 'Jorona begum ', 'infectious diseases', 'Female', 'No', 56),
(11015, 'Azad', 'Blood clot in Uv', 'Male', 'Yes', 78),
(11016, 'Zaman', 'Pregnency', 'Female', 'Yes', 29),
(11018, 'Morjina', 'Allergies & Asthma.', 'Female', 'No', 45),
(11019, 'Abdul Baten', 'Heart block', 'Male', 'Yes', 76),
(11020, 'Oyndrila', 'Head pain', 'Female', 'No', 22);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
