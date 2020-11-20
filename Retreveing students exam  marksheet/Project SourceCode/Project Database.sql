-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Oct 19, 2019 at 07:15 AM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `admin`
--

-- --------------------------------------------------------

--
-- Table structure for table `1civil`
--

CREATE TABLE IF NOT EXISTS `1civil` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Myanmar` int(3) NOT NULL,
  `English` int(3) NOT NULL,
  `Engineering Mathematics` int(3) NOT NULL,
  `Engineering Chemistry` int(3) NOT NULL,
  `Engineering Physics` int(3) NOT NULL,
  `Building Materials and Construction` int(3) NOT NULL,
  `Basic Engineering Drawing` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `1civil`
--

INSERT INTO `1civil` (`Roll Number`, `Name`, `Myanmar`, `English`, `Engineering Mathematics`, `Engineering Chemistry`, `Engineering Physics`, `Building Materials and Construction`, `Basic Engineering Drawing`) VALUES
(1, 'Mg Kaung Htet', 85, 90, 80, 85, 80, 75, 90),
(2, 'Mg Wai Phyo Tun', 69, 75, 75, 69, 80, 70, 80),
(3, 'Ma Moh Moh ', 60, 79, 56, 69, 65, 50, 75),
(4, 'Mg Arkar', 85, 70, 85, 56, 68, 80, 75),
(5, 'Ma Su Yati', 56, 68, 75, 68, 90, 88, 70);

-- --------------------------------------------------------

--
-- Table structure for table `1ec`
--

CREATE TABLE IF NOT EXISTS `1ec` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Myanmar` int(3) NOT NULL,
  `English` int(3) NOT NULL,
  `Engineering Mathematics` int(3) NOT NULL,
  `Engineering Chemistry` int(3) NOT NULL,
  `Engineering Physics` int(3) NOT NULL,
  `Fundamental of Electronic Circuits` int(3) NOT NULL,
  `Basic Engineering Drawing` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `1ec`
--

INSERT INTO `1ec` (`Roll Number`, `Name`, `Myanmar`, `English`, `Engineering Mathematics`, `Engineering Chemistry`, `Engineering Physics`, `Fundamental of Electronic Circuits`, `Basic Engineering Drawing`) VALUES
(1, 'Ma Thiri Aung ', 70, 85, 80, 76, 89, 75, 90),
(2, 'Ma Khant Yati Oo', 69, 80, 75, 69, 80, 70, 85),
(3, 'Mg La MIn', 60, 79, 60, 70, 65, 50, 70),
(4, 'Mg Htet Yan', 68, 75, 88, 89, 68, 70, 86),
(5, 'Ma Ei Mon', 77, 85, 68, 80, 78, 86, 80);

-- --------------------------------------------------------

--
-- Table structure for table `1ep`
--

CREATE TABLE IF NOT EXISTS `1ep` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Myanmar` int(3) NOT NULL,
  `English` int(3) NOT NULL,
  `Engineering Mathematics` int(3) NOT NULL,
  `Engineering Chemistry` int(3) NOT NULL,
  `Engineering Physics` int(3) NOT NULL,
  `Basic Engineering Drawing` int(3) NOT NULL,
  `Principle of Electrical Engineering` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `1ep`
--

INSERT INTO `1ep` (`Roll Number`, `Name`, `Myanmar`, `English`, `Engineering Mathematics`, `Engineering Chemistry`, `Engineering Physics`, `Basic Engineering Drawing`, `Principle of Electrical Engineering`) VALUES
(1, 'Ma Wai Zin Phyo', 90, 90, 90, 85, 90, 80, 95),
(2, 'Ma Khin Phone', 69, 80, 80, 69, 80, 70, 90),
(3, 'Mg Hein Si Thu', 60, 60, 60, 70, 65, 75, 85),
(4, 'Ma Kay Kay', 68, 70, 85, 56, 68, 70, 88),
(5, 'Mg Oasix', 77, 68, 68, 80, 78, 70, 82);

-- --------------------------------------------------------

--
-- Table structure for table `1it`
--

CREATE TABLE IF NOT EXISTS `1it` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Myanmar` int(3) NOT NULL,
  `English` int(3) NOT NULL,
  `Engineering Mathematics` int(3) NOT NULL,
  `Engineering Chemistry` int(3) NOT NULL,
  `Engineering Physics` int(3) NOT NULL,
  `Basic Engineering Drawing` int(3) NOT NULL,
  `Introduction to Computer Systems` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `1it`
--

INSERT INTO `1it` (`Roll Number`, `Name`, `Myanmar`, `English`, `Engineering Mathematics`, `Engineering Chemistry`, `Engineering Physics`, `Basic Engineering Drawing`, `Introduction to Computer Systems`) VALUES
(1, 'Ma Naw Phaw Eh ', 70, 85, 90, 95, 89, 85, 98),
(2, 'Mg La Yaung', 69, 80, 89, 90, 85, 80, 90),
(3, 'Ma Pann Yaung Chal', 70, 80, 80, 75, 85, 75, 90),
(4, 'Ma Su Su', 85, 75, 88, 56, 68, 70, 85),
(5, 'Mg Tun Yaung', 77, 55, 88, 75, 89, 56, 68);

-- --------------------------------------------------------

--
-- Table structure for table `1mech`
--

CREATE TABLE IF NOT EXISTS `1mech` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Myanmar` int(3) NOT NULL,
  `English` int(3) NOT NULL,
  `Engineering Mathematics` int(3) NOT NULL,
  `Engineering Chemistry` int(3) NOT NULL,
  `Engineering Physics` int(3) NOT NULL,
  `Basic Engineering Drawing` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `1mech`
--

INSERT INTO `1mech` (`Roll Number`, `Name`, `Myanmar`, `English`, `Engineering Mathematics`, `Engineering Chemistry`, `Engineering Physics`, `Basic Engineering Drawing`) VALUES
(1, 'Mg Chit Phoo Ngone', 85, 85, 90, 85, 90, 80),
(2, 'Mg La MIn', 69, 75, 80, 69, 80, 70),
(3, 'Ma Thet Hmuu', 60, 60, 60, 70, 65, 75),
(4, 'Mg Wai Yan', 65, 74, 40, 58, 88, 60),
(5, 'Ma Myo Myo', 56, 58, 60, 88, 56, 48);

-- --------------------------------------------------------

--
-- Table structure for table `2civil`
--

CREATE TABLE IF NOT EXISTS `2civil` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `English` int(3) NOT NULL,
  `Engineering Mathematics` int(3) NOT NULL,
  `Engineering Mechanics` int(3) NOT NULL,
  `Applied Electrical Engineering` int(3) NOT NULL,
  `Surveying` int(3) NOT NULL,
  `Civil Engineering Drawing` int(3) NOT NULL,
  `Workshop Technologies & Pratices` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `2civil`
--

INSERT INTO `2civil` (`Roll Number`, `Name`, `English`, `Engineering Mathematics`, `Engineering Mechanics`, `Applied Electrical Engineering`, `Surveying`, `Civil Engineering Drawing`, `Workshop Technologies & Pratices`) VALUES
(1, 'Ma Thiri San', 90, 90, 98, 85, 95, 85, 80),
(2, 'Ma Shin Thant Phyu', 75, 75, 85, 85, 80, 80, 75),
(3, 'Mg Aung Thu Phyo', 60, 56, 70, 85, 80, 75, 60),
(4, 'Ma Wah Wah', 70, 88, 58, 85, 56, 67, 77),
(5, 'Mg Tin Tun', 55, 75, 48, 58, 68, 85, 78);

-- --------------------------------------------------------

--
-- Table structure for table `2ec`
--

CREATE TABLE IF NOT EXISTS `2ec` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `English` int(3) NOT NULL,
  `Engineering Mathematics` int(3) NOT NULL,
  `Electronic Engineering Circuit` int(3) NOT NULL,
  `Communication Principles` int(3) NOT NULL,
  `Microelectronics` int(3) NOT NULL,
  `Technical Programming` int(3) NOT NULL,
  `Digital Electronics` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `2ec`
--

INSERT INTO `2ec` (`Roll Number`, `Name`, `English`, `Engineering Mathematics`, `Electronic Engineering Circuit`, `Communication Principles`, `Microelectronics`, `Technical Programming`, `Digital Electronics`) VALUES
(1, 'Mg Shwe Htoo', 80, 80, 95, 90, 85, 90, 80),
(2, 'Ma Shwe Hmone Yati', 80, 75, 80, 85, 90, 80, 90),
(3, 'Ma Yamin Oo', 79, 60, 75, 60, 65, 50, 70),
(4, 'Mg Tun Tun', 75, 48, 85, 87, 68, 65, 50),
(5, 'Mg Htay Min Paing', 68, 88, 58, 75, 65, 42, 84);

-- --------------------------------------------------------

--
-- Table structure for table `2ep`
--

CREATE TABLE IF NOT EXISTS `2ep` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `English` int(3) NOT NULL,
  `Engineering Mathematics` int(3) NOT NULL,
  `Electrical Engineering Circuit Analysis` int(3) NOT NULL,
  `Basic Electronics` int(3) NOT NULL,
  `Electromechanics` int(3) NOT NULL,
  `Generation,Transmission and Distribution` int(3) NOT NULL,
  `Engineering Mechanics` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `2ep`
--

INSERT INTO `2ep` (`Roll Number`, `Name`, `English`, `Engineering Mathematics`, `Electrical Engineering Circuit Analysis`, `Basic Electronics`, `Electromechanics`, `Generation,Transmission and Distribution`, `Engineering Mechanics`) VALUES
(1, 'Mg Ye Min Aung', 85, 80, 95, 85, 90, 80, 98),
(2, 'Mg Wai Htet Lin', 75, 75, 80, 85, 80, 90, 85),
(3, 'Ma Wai Wai Tun', 60, 80, 75, 75, 80, 65, 70),
(4, 'Mg Naing Naing', 75, 48, 58, 75, 80, 85, 98),
(5, 'Ma Win Win', 58, 88, 70, 65, 81, 80, 60);

-- --------------------------------------------------------

--
-- Table structure for table `2it`
--

CREATE TABLE IF NOT EXISTS `2it` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `English` int(3) NOT NULL,
  `Engineering Mathematics` int(3) NOT NULL,
  `Basic Electricity and Electronics` int(3) NOT NULL,
  `Digital Logic Disign` int(3) NOT NULL,
  `Data Communicaytions` int(3) NOT NULL,
  `Programming Language in C++` int(3) NOT NULL,
  `Web Development Technologies I` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `2it`
--

INSERT INTO `2it` (`Roll Number`, `Name`, `English`, `Engineering Mathematics`, `Basic Electricity and Electronics`, `Digital Logic Disign`, `Data Communicaytions`, `Programming Language in C++`, `Web Development Technologies I`) VALUES
(1, 'Mg Myat Bhone San', 85, 95, 96, 89, 90, 90, 92),
(2, 'Mg Hein Zayar Lynn', 80, 90, 89, 85, 80, 75, 85),
(3, 'Ma Aye Thaung', 80, 75, 80, 90, 65, 75, 80),
(4, 'Ma Myat Myat', 70, 85, 65, 75, 85, 65, 68),
(5, 'Ma Mon Mon', 58, 68, 75, 45, 65, 85, 68);

-- --------------------------------------------------------

--
-- Table structure for table `2mech`
--

CREATE TABLE IF NOT EXISTS `2mech` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `English` int(3) NOT NULL,
  `Engineering Mathematics` int(3) NOT NULL,
  `Workshop Technology` int(3) NOT NULL,
  `Engineering Mechanics` int(3) NOT NULL,
  `Machine Drawing` int(3) NOT NULL,
  `Engineering Materials` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `2mech`
--

INSERT INTO `2mech` (`Roll Number`, `Name`, `English`, `Engineering Mathematics`, `Workshop Technology`, `Engineering Mechanics`, `Machine Drawing`, `Engineering Materials`) VALUES
(1, 'Ma Khaning Zin Ko Ko', 85, 90, 95, 85, 90, 85),
(2, 'Mg Wathan Kyaw', 75, 80, 85, 80, 75, 70),
(3, 'Mg Chan Myae Aung', 60, 60, 80, 85, 70, 75),
(4, 'Mg Win Tin', 58, 85, 76, 67, 43, 34),
(5, 'Ma Pa Pa', 55, 88, 65, 56, 74, 47);

-- --------------------------------------------------------

--
-- Table structure for table `3civil`
--

CREATE TABLE IF NOT EXISTS `3civil` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `English` int(3) NOT NULL,
  `Engineering Mathematics` int(3) NOT NULL,
  `Surveying` int(3) NOT NULL,
  `Mechanics of Materials` int(3) NOT NULL,
  `Fluid Mechanics` int(3) NOT NULL,
  `Transportation Engineering` int(3) NOT NULL,
  `Geotechnical Engineering` int(3) NOT NULL,
  `Civil Engineering Geology` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `3civil`
--

INSERT INTO `3civil` (`Roll Number`, `Name`, `English`, `Engineering Mathematics`, `Surveying`, `Mechanics of Materials`, `Fluid Mechanics`, `Transportation Engineering`, `Geotechnical Engineering`, `Civil Engineering Geology`) VALUES
(1, 'Mg Wai Phone Pyae', 85, 80, 95, 85, 80, 95, 90, 80),
(2, 'Mg Myo Min Khant', 75, 75, 80, 80, 75, 70, 75, 60),
(3, 'Ma Hay Mann Thwin', 60, 56, 80, 75, 70, 65, 60, 70),
(4, 'Mg Kaung Myat', 75, 88, 56, 58, 56, 75, 68, 80),
(5, 'Mg Zayar', 85, 88, 68, 75, 68, 56, 68, 70);

-- --------------------------------------------------------

--
-- Table structure for table `3ec`
--

CREATE TABLE IF NOT EXISTS `3ec` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `English` int(3) NOT NULL,
  `Engineering Mathematics` int(3) NOT NULL,
  `Engineering Circuit Analysis` int(3) NOT NULL,
  `Digital Communication` int(3) NOT NULL,
  `Engineering Electromagnetics` int(3) NOT NULL,
  `Integrated Electronics` int(3) NOT NULL,
  `Modeling and Control` int(3) NOT NULL,
  `Analogue and Digital Electronics` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `3ec`
--

INSERT INTO `3ec` (`Roll Number`, `Name`, `English`, `Engineering Mathematics`, `Engineering Circuit Analysis`, `Digital Communication`, `Engineering Electromagnetics`, `Integrated Electronics`, `Modeling and Control`, `Analogue and Digital Electronics`) VALUES
(1, 'Mg Wai Luu Kyaw', 80, 90, 90, 95, 85, 80, 90, 95),
(2, 'Ma Thin Thin', 80, 75, 50, 70, 80, 68, 85, 90),
(3, 'Mg Bo Bo', 60, 56, 75, 60, 56, 50, 75, 80),
(4, 'Mg Kyaw Kyaw', 70, 88, 45, 58, 86, 70, 50, 54),
(5, 'Ma Ktt Kit', 68, 68, 50, 70, 50, 80, 85, 78);

-- --------------------------------------------------------

--
-- Table structure for table `3ep`
--

CREATE TABLE IF NOT EXISTS `3ep` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `English` int(3) NOT NULL,
  `Engineering Mathematics` int(3) NOT NULL,
  `Mechanical Engineering Fundamental` int(3) NOT NULL,
  `Electrical Engineering Circuit Analysis` int(3) NOT NULL,
  `Power Electronics` int(3) NOT NULL,
  `Electrical Machine and Operation` int(3) NOT NULL,
  `Electromagnetic Field` int(3) NOT NULL,
  `Electrical Measurement Instrumentation` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `3ep`
--

INSERT INTO `3ep` (`Roll Number`, `Name`, `English`, `Engineering Mathematics`, `Mechanical Engineering Fundamental`, `Electrical Engineering Circuit Analysis`, `Power Electronics`, `Electrical Machine and Operation`, `Electromagnetic Field`, `Electrical Measurement Instrumentation`) VALUES
(1, 'Mg Aung Zayar Phyo', 85, 90, 80, 85, 90, 95, 85, 90),
(2, 'Ma Su Yi Phyo', 75, 75, 70, 80, 85, 80, 70, 75),
(3, 'Mg Min Khant Kyaw', 79, 60, 60, 75, 70, 79, 60, 65),
(4, 'Ma Hla Hla', 75, 48, 57, 96, 88, 45, 78, 50),
(5, 'Mg Myo Myo', 58, 68, 85, 70, 78, 65, 88, 78);

-- --------------------------------------------------------

--
-- Table structure for table `3it`
--

CREATE TABLE IF NOT EXISTS `3it` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `English` int(3) NOT NULL,
  `Engineering Mathematics` int(3) NOT NULL,
  `Computer Networks` int(3) NOT NULL,
  `Web Development Technologies II` int(3) NOT NULL,
  `Programming Language in Java` int(3) NOT NULL,
  `Data Structure` int(3) NOT NULL,
  `Database Management System` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `3it`
--

INSERT INTO `3it` (`Roll Number`, `Name`, `English`, `Engineering Mathematics`, `Computer Networks`, `Web Development Technologies II`, `Programming Language in Java`, `Data Structure`, `Database Management System`) VALUES
(1, 'Ma Aye Aye Soe', 85, 90, 90, 85, 90, 85, 89),
(2, 'Mg Yupar Myo Thant', 80, 85, 75, 80, 90, 80, 85),
(3, 'Ma Tint Nadi', 85, 80, 70, 79, 80, 79, 85),
(4, 'Mg Min Aung', 70, 88, 75, 68, 70, 68, 58),
(5, 'Ma Swe Swe', 68, 88, 58, 75, 68, 75, 65);

-- --------------------------------------------------------

--
-- Table structure for table `3mech`
--

CREATE TABLE IF NOT EXISTS `3mech` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `English` int(3) NOT NULL,
  `Engineering Mathematics` int(3) NOT NULL,
  `Strength of Matherials I` int(3) NOT NULL,
  `Theory of Mechanics I` int(3) NOT NULL,
  `Engineering Matherials` int(3) NOT NULL,
  `Production Technology` int(3) NOT NULL,
  `Engineering Thermodynamics I` int(3) NOT NULL,
  `Mechanical Engineering Fundamental` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `3mech`
--

INSERT INTO `3mech` (`Roll Number`, `Name`, `English`, `Engineering Mathematics`, `Strength of Matherials I`, `Theory of Mechanics I`, `Engineering Matherials`, `Production Technology`, `Engineering Thermodynamics I`, `Mechanical Engineering Fundamental`) VALUES
(1, 'Mg  Kaung Si Thu', 80, 80, 90, 85, 80, 90, 78, 80),
(2, 'Mg Swan Pyae Hmuu', 75, 75, 80, 70, 85, 60, 85, 50),
(3, 'Ma Win Pa Pa Taw Tar', 60, 56, 65, 60, 75, 70, 65, 60),
(4, 'Mg MIn Min', 75, 48, 54, 68, 66, 80, 50, 60),
(5, 'Ma Thiri', 68, 68, 58, 70, 65, 85, 56, 85);

-- --------------------------------------------------------

--
-- Table structure for table `4civil`
--

CREATE TABLE IF NOT EXISTS `4civil` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `English` int(3) NOT NULL,
  `Engineering Mathematics` int(3) NOT NULL,
  `Theory of Structures` int(3) NOT NULL,
  `Design of Timber Structures` int(3) NOT NULL,
  `Foundation Engineering` int(3) NOT NULL,
  `Hydraulic Engineering & Applied Hydraulic` int(3) NOT NULL,
  `Transportation Engineering` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `4civil`
--

INSERT INTO `4civil` (`Roll Number`, `Name`, `English`, `Engineering Mathematics`, `Theory of Structures`, `Design of Timber Structures`, `Foundation Engineering`, `Hydraulic Engineering & Applied Hydraulic`, `Transportation Engineering`) VALUES
(1, 'Mg Phone Khant Paing', 90, 90, 95, 85, 90, 80, 90),
(2, 'Mg Myo Khant Naung', 75, 75, 80, 75, 75, 85, 80),
(3, 'Ma Ei Sandar', 60, 60, 85, 60, 65, 75, 70),
(4, 'Ma Aung Aung', 75, 88, 45, 58, 68, 87, 75),
(5, 'Ma Thu Thu', 68, 75, 58, 68, 78, 80, 56);

-- --------------------------------------------------------

--
-- Table structure for table `4ec`
--

CREATE TABLE IF NOT EXISTS `4ec` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `English` int(3) NOT NULL,
  `Engineering Mathematics` int(3) NOT NULL,
  `Computer Communication` int(3) NOT NULL,
  `Digital Design with HDL` int(3) NOT NULL,
  `Modern Control System` int(3) NOT NULL,
  `Industrial Electronics & Control` int(3) NOT NULL,
  `Computer Science` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `4ec`
--

INSERT INTO `4ec` (`Roll Number`, `Name`, `English`, `Engineering Mathematics`, `Computer Communication`, `Digital Design with HDL`, `Modern Control System`, `Industrial Electronics & Control`, `Computer Science`) VALUES
(1, 'Ma Moe Moe Theint', 85, 90, 95, 80, 79, 82, 95),
(2, 'Ma Ni Ni Aye', 80, 80, 78, 79, 80, 85, 75),
(3, 'Mg Aung Ko Min', 60, 60, 70, 70, 65, 80, 75),
(4, 'Ma Lin Lin', 75, 88, 85, 58, 50, 56, 60),
(5, 'Ma Joeset', 68, 68, 58, 60, 56, 80, 58);

-- --------------------------------------------------------

--
-- Table structure for table `4ep`
--

CREATE TABLE IF NOT EXISTS `4ep` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `English` int(3) NOT NULL,
  `Engineering Mathematics` int(3) NOT NULL,
  `Linear Control System` int(3) NOT NULL,
  `Programmable Logic Control` int(3) NOT NULL,
  `Electrical Machine Design` int(3) NOT NULL,
  `Design & Layout of Power System` int(3) NOT NULL,
  `Power System Analysis` int(3) NOT NULL,
  `Microprocessor System` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `4ep`
--

INSERT INTO `4ep` (`Roll Number`, `Name`, `English`, `Engineering Mathematics`, `Linear Control System`, `Programmable Logic Control`, `Electrical Machine Design`, `Design & Layout of Power System`, `Power System Analysis`, `Microprocessor System`) VALUES
(1, 'Ma Ei Zin Myo', 85, 90, 85, 90, 85, 90, 75, 70),
(2, 'Mg Thet Paing Oo', 80, 80, 80, 75, 90, 80, 75, 80),
(3, 'Mg Nyi Nyi Naing', 79, 80, 75, 70, 65, 80, 70, 75),
(4, 'Ma Nwe Nwe', 70, 85, 58, 60, 85, 75, 68, 85),
(5, 'Mg Htike Htike', 85, 88, 58, 70, 90, 85, 60, 68);

-- --------------------------------------------------------

--
-- Table structure for table `4it`
--

CREATE TABLE IF NOT EXISTS `4it` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `English` int(3) NOT NULL,
  `Engineering Mathematics` int(3) NOT NULL,
  `Advanced Computer Networks` int(3) NOT NULL,
  `Computer Architecture and Organization` int(3) NOT NULL,
  `Operations System` int(3) NOT NULL,
  `Adbvanced Data Management Techniques` int(3) NOT NULL,
  `Modern Control Systems` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `4it`
--

INSERT INTO `4it` (`Roll Number`, `Name`, `English`, `Engineering Mathematics`, `Advanced Computer Networks`, `Computer Architecture and Organization`, `Operations System`, `Adbvanced Data Management Techniques`, `Modern Control Systems`) VALUES
(1, 'Mg Khant Nyar', 85, 90, 95, 90, 85, 85, 90),
(2, 'Ma Sandi Cho', 80, 85, 90, 86, 80, 85, 89),
(3, 'Ma Sandar', 79, 90, 85, 80, 80, 75, 82),
(4, 'Ma Nwe Nwe Win', 70, 85, 58, 68, 75, 60, 88),
(5, 'Mg Zaw Min Htike', 85, 68, 58, 78, 58, 68, 60);

-- --------------------------------------------------------

--
-- Table structure for table `4mech`
--

CREATE TABLE IF NOT EXISTS `4mech` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `English` int(3) NOT NULL,
  `Engineering Mathematics` int(3) NOT NULL,
  `Design of Machine Element` int(3) NOT NULL,
  `Strength of Materials II` int(3) NOT NULL,
  `Fluid Machanics I` int(3) NOT NULL,
  `Manufacturing System & Automatics` int(3) NOT NULL,
  `Theory of Mechanics II` int(3) NOT NULL,
  `Heat & Mass Transfer` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `4mech`
--

INSERT INTO `4mech` (`Roll Number`, `Name`, `English`, `Engineering Mathematics`, `Design of Machine Element`, `Strength of Materials II`, `Fluid Machanics I`, `Manufacturing System & Automatics`, `Theory of Mechanics II`, `Heat & Mass Transfer`) VALUES
(1, 'Mg Aung Bo Bo Tun', 85, 90, 90, 85, 95, 80, 95, 90),
(2, 'Mg Nan Htike Kyaw', 80, 80, 85, 75, 80, 70, 90, 85),
(3, 'Mg Chit Loon Shin Mo', 60, 60, 80, 75, 70, 80, 75, 60),
(4, 'Ma Soe Soe', 74, 48, 58, 85, 68, 86, 60, 80),
(5, 'Ma Aye Soe', 85, 68, 58, 78, 68, 58, 56, 86);

-- --------------------------------------------------------

--
-- Table structure for table `5civil`
--

CREATE TABLE IF NOT EXISTS `5civil` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Theory of Structures` int(3) NOT NULL,
  `Design of Reinforced Concrete Structures` int(3) NOT NULL,
  `Construction Engineering Management` int(3) NOT NULL,
  `Design of Hydraulic Structures` int(3) NOT NULL,
  `Design of Steel Structures` int(3) NOT NULL,
  `Environmental Engineering` int(3) NOT NULL,
  `Estamating and Specifications` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `5civil`
--

INSERT INTO `5civil` (`Roll Number`, `Name`, `Theory of Structures`, `Design of Reinforced Concrete Structures`, `Construction Engineering Management`, `Design of Hydraulic Structures`, `Design of Steel Structures`, `Environmental Engineering`, `Estamating and Specifications`) VALUES
(1, 'Mg Phyo Zayar Htike', 95, 85, 80, 85, 90, 85, 80),
(2, 'Ma May Mi Kyaw', 80, 75, 71, 75, 70, 80, 85),
(3, 'Ma Zaw Min Htike', 85, 75, 70, 65, 75, 70, 60),
(4, 'Ma Aye Aye', 45, 58, 85, 68, 90, 88, 85),
(5, 'Mg Than Than', 58, 85, 76, 68, 86, 82, 50);

-- --------------------------------------------------------

--
-- Table structure for table `5ec`
--

CREATE TABLE IF NOT EXISTS `5ec` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Advanced Electronics` int(3) NOT NULL,
  `Digital Control System` int(3) NOT NULL,
  `Digital Signal Processing` int(3) NOT NULL,
  `Industrial Management` int(3) NOT NULL,
  `Modern Electronic Communication System` int(3) NOT NULL,
  `Microwave Engineering` int(3) NOT NULL,
  `PLC Programming Methods and Techniques` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `5ec`
--

INSERT INTO `5ec` (`Roll Number`, `Name`, `Advanced Electronics`, `Digital Control System`, `Digital Signal Processing`, `Industrial Management`, `Modern Electronic Communication System`, `Microwave Engineering`, `PLC Programming Methods and Techniques`) VALUES
(1, 'Mg Myo Zin', 95, 90, 80, 85, 80, 90, 89),
(2, 'Ma Zar Chi Lwin', 80, 85, 90, 80, 80, 75, 90),
(3, 'Mg Chan Myae Ko', 80, 75, 60, 70, 65, 80, 85),
(4, 'Ma Kyu Kyu', 85, 68, 80, 58, 85, 50, 80),
(5, 'Mg Myint Myint', 65, 75, 87, 68, 82, 27, 85);

-- --------------------------------------------------------

--
-- Table structure for table `5ep`
--

CREATE TABLE IF NOT EXISTS `5ep` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Modern Control System` int(3) NOT NULL,
  `Electrical Machine and Control` int(3) NOT NULL,
  `Power System Protection` int(3) NOT NULL,
  `Economic Operation of Power System` int(3) NOT NULL,
  `Electromechanical Energy Conversion` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `5ep`
--

INSERT INTO `5ep` (`Roll Number`, `Name`, `Modern Control System`, `Electrical Machine and Control`, `Power System Protection`, `Economic Operation of Power System`, `Electromechanical Energy Conversion`) VALUES
(1, 'Ma Khin Htar Wai', 90, 85, 95, 80, 90),
(2, 'Mg Thiha Zaw', 80, 85, 70, 75, 80),
(3, 'Ma Mon Mon Myint', 65, 70, 65, 75, 60),
(4, 'Mg Aung Aung', 50, 55, 60, 65, 80),
(5, 'Mg Khant Khant', 56, 58, 68, 70, 88);

-- --------------------------------------------------------

--
-- Table structure for table `5it`
--

CREATE TABLE IF NOT EXISTS `5it` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Embedded Systems` int(3) NOT NULL,
  `Cloud Computing` int(3) NOT NULL,
  `Software Engineering` int(3) NOT NULL,
  `Digital Signal Processing` int(3) NOT NULL,
  `Digital Image Processing` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `5it`
--

INSERT INTO `5it` (`Roll Number`, `Name`, `Embedded Systems`, `Cloud Computing`, `Software Engineering`, `Digital Signal Processing`, `Digital Image Processing`) VALUES
(1, 'Ma  Ma Su', 90, 98, 85, 80, 89),
(2, 'Ma Yati', 85, 80, 86, 75, 70),
(3, 'Mg Bhone Yang Wah', 85, 75, 70, 69, 80),
(4, 'Mg Thiha', 58, 85, 80, 50, 68),
(5, 'Ma Hanna', 68, 86, 60, 80, 82);

-- --------------------------------------------------------

--
-- Table structure for table `5mech`
--

CREATE TABLE IF NOT EXISTS `5mech` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Engineering Managements` int(3) NOT NULL,
  `Refrigeration & Air-Conditioning` int(3) NOT NULL,
  `Gas Turbine Theory` int(3) NOT NULL,
  `Internal Combustion Engines` int(3) NOT NULL,
  `Fluid Mechanics II` int(3) NOT NULL,
  `Vibration & Control` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `5mech`
--

INSERT INTO `5mech` (`Roll Number`, `Name`, `Engineering Managements`, `Refrigeration & Air-Conditioning`, `Gas Turbine Theory`, `Internal Combustion Engines`, `Fluid Mechanics II`, `Vibration & Control`) VALUES
(1, 'Ma Shwe Yi Soe', 90, 89, 80, 85, 95, 85),
(2, 'Mg Paw Htoo', 75, 80, 70, 80, 85, 79),
(3, 'Mg Nay Htoo', 80, 65, 50, 75, 70, 80),
(4, 'Mg Thura', 58, 78, 80, 70, 86, 54),
(5, 'Ma Thone Thone', 85, 89, 75, 57, 60, 70);

-- --------------------------------------------------------

--
-- Table structure for table `6civil`
--

CREATE TABLE IF NOT EXISTS `6civil` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Humanities and Social Science` int(3) NOT NULL,
  `Computer Application in Civil Engineering` int(3) NOT NULL,
  `Environmental Engineering` int(3) NOT NULL,
  `Integrated Design Project` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `6civil`
--

INSERT INTO `6civil` (`Roll Number`, `Name`, `Humanities and Social Science`, `Computer Application in Civil Engineering`, `Environmental Engineering`, `Integrated Design Project`) VALUES
(1, 'Mg Yae Min Aung', 80, 85, 90, 95),
(2, 'Mg Thant Aung Kyaw', 85, 80, 75, 70),
(3, 'Ma May Thet Naing', 75, 70, 60, 65),
(4, 'Ma Moe Moe', 85, 78, 88, 56),
(5, 'Ma Mhone Mhone', 58, 85, 82, 68);

-- --------------------------------------------------------

--
-- Table structure for table `6ec`
--

CREATE TABLE IF NOT EXISTS `6ec` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Humanities and Social Science` int(3) NOT NULL,
  `PLC and SCADA Control System` int(3) NOT NULL,
  `Advanced Communication Systems` int(3) NOT NULL,
  `Computer Networking` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `6ec`
--

INSERT INTO `6ec` (`Roll Number`, `Name`, `Humanities and Social Science`, `PLC and SCADA Control System`, `Advanced Communication Systems`, `Computer Networking`) VALUES
(1, 'Ma Khin Thidar Tun', 90, 90, 85, 85),
(2, 'Ma Kay Khaing Tun', 85, 90, 80, 80),
(3, 'Ma Ei Ei Phyo', 85, 85, 75, 90),
(4, 'Ma Dee', 85, 78, 80, 70),
(5, 'Mg Lin Yaung', 68, 68, 60, 80);

-- --------------------------------------------------------

--
-- Table structure for table `6ep`
--

CREATE TABLE IF NOT EXISTS `6ep` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Humanities and Social Science` int(3) NOT NULL,
  `Industrial Engineering and Management` int(3) NOT NULL,
  `Computer Aided Electrical Engineering` int(3) NOT NULL,
  `Electrical Safty anf Ethic` int(3) NOT NULL,
  `Power System Reliability` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `6ep`
--

INSERT INTO `6ep` (`Roll Number`, `Name`, `Humanities and Social Science`, `Industrial Engineering and Management`, `Computer Aided Electrical Engineering`, `Electrical Safty anf Ethic`, `Power System Reliability`) VALUES
(1, 'Mg Zaw Yae Aung', 90, 85, 80, 90, 92),
(2, 'Ma Hla Wutt Yee', 85, 80, 75, 85, 80),
(3, 'Mg Myo Han Tun', 80, 75, 70, 65, 60),
(4, 'Mg Tayza', 85, 87, 58, 85, 50),
(5, 'Mg Phyo Phyo', 68, 58, 85, 80, 50);

-- --------------------------------------------------------

--
-- Table structure for table `6it`
--

CREATE TABLE IF NOT EXISTS `6it` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Humanities and Social Science` int(3) NOT NULL,
  `Wireless and Mobile Communications` int(3) NOT NULL,
  `Network Planning and Management` int(3) NOT NULL,
  `Project Management` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `6it`
--

INSERT INTO `6it` (`Roll Number`, `Name`, `Humanities and Social Science`, `Wireless and Mobile Communications`, `Network Planning and Management`, `Project Management`) VALUES
(1, 'Mg Zin Min Thant', 85, 90, 83, 90),
(2, 'Ma Moe Hanny Thant', 85, 90, 75, 80),
(3, 'Mg Pay Zin Oo', 80, 85, 70, 75),
(4, 'Ma Grace', 58, 68, 75, 57),
(5, 'Ma Nay Chi', 88, 58, 50, 80);

-- --------------------------------------------------------

--
-- Table structure for table `6mech`
--

CREATE TABLE IF NOT EXISTS `6mech` (
  `Roll Number` int(3) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Humanities and Social Science` int(3) NOT NULL,
  `Renewable Energy` int(3) NOT NULL,
  `Manufacturing System & Automation` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `6mech`
--

INSERT INTO `6mech` (`Roll Number`, `Name`, `Humanities and Social Science`, `Renewable Energy`, `Manufacturing System & Automation`) VALUES
(1, 'Mg Aung Myint Myat', 90, 80, 85),
(2, 'Mg Nan Myint Aung', 85, 75, 70),
(3, 'Ma May Thu', 80, 70, 65),
(4, 'Mg Lwin Moe', 85, 74, 57),
(5, 'Ma Chit Chit', 78, 70, 80);

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('myatmonthant', 'mmt123456'),
('wathonekyaw', 'wtk123456'),
('tunnaingwin', 'tnw1234'),
('wathonekyaw', 'wtk1234'),
('myatmonthant', 'mmt1234');

-- --------------------------------------------------------

--
-- Table structure for table `firstcivil`
--

CREATE TABLE IF NOT EXISTS `firstcivil` (
  `Name` varchar(20) NOT NULL,
  `Roll Number` varchar(10) NOT NULL,
  `Myanmar` varchar(3) NOT NULL,
  `English` varchar(3) NOT NULL,
  `Engineering Mathematics` varchar(3) NOT NULL,
  `Engineering Chemistry` varchar(3) NOT NULL,
  `Engineering Physics` varchar(3) NOT NULL,
  `Building Materials and Construction` varchar(3) NOT NULL,
  `Engineering Drawing` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `firstcivil`
--

INSERT INTO `firstcivil` (`Name`, `Roll Number`, `Myanmar`, `English`, `Engineering Mathematics`, `Engineering Chemistry`, `Engineering Physics`, `Building Materials and Construction`, `Engineering Drawing`) VALUES
('Ma Mya Mya', 'I Civil-1', '80', '60', '98', '89', '79', '96', '60'),
('Ma Moe Moe', 'I Civil-2', '78', '70', '88', '96', '79', '83', '80'),
('tunnaingwin', '', '86', '85', '', '', '', '', ''),
('wathonekyaw', '', '86', '68', '', '', '', '', ''),
('myatmonthant', '', '88', '78', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `secondcivil`
--

CREATE TABLE IF NOT EXISTS `secondcivil` (
  `Name` varchar(20) NOT NULL,
  `Roll Number` varchar(10) NOT NULL,
  `Myanmar` varchar(3) NOT NULL,
  `English` varchar(3) NOT NULL,
  `Engineering Mathematics` varchar(3) NOT NULL,
  `Material` varchar(3) NOT NULL,
  `Building` varchar(3) NOT NULL,
  `Construction` varchar(3) NOT NULL,
  `Structure` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `secondcivil`
--

INSERT INTO `secondcivil` (`Name`, `Roll Number`, `Myanmar`, `English`, `Engineering Mathematics`, `Material`, `Building`, `Construction`, `Structure`) VALUES
('Ma Nilar', 'II Civil-1', '66', '66', '66', '66', '66', '66', '66');
