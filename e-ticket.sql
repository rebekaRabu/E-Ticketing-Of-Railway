-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.41-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema tic
--

CREATE DATABASE IF NOT EXISTS tic;
USE tic;

--
-- Definition of table `compsubtype`
--

DROP TABLE IF EXISTS `compsubtype`;
CREATE TABLE `compsubtype` (
  `compsubtypeid` varchar(45) NOT NULL,
  `compsubtypename` varchar(255) NOT NULL,
  PRIMARY KEY  (`compsubtypeid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `compsubtype`
--

/*!40000 ALTER TABLE `compsubtype` DISABLE KEYS */;
INSERT INTO `compsubtype` (`compsubtypeid`,`compsubtypename`) VALUES 
 ('1','A'),
 ('2','B'),
 ('3','G');
/*!40000 ALTER TABLE `compsubtype` ENABLE KEYS */;


--
-- Definition of table `comptype`
--

DROP TABLE IF EXISTS `comptype`;
CREATE TABLE `comptype` (
  `comptypeid` varchar(45) NOT NULL,
  `compname` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  PRIMARY KEY  USING BTREE (`comptypeid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `comptype`
--

/*!40000 ALTER TABLE `comptype` DISABLE KEYS */;
INSERT INTO `comptype` (`comptypeid`,`compname`,`description`) VALUES 
 ('1','AC','AC Cabin'),
 ('2','NON-AC','Normal Chair'),
 ('3','General','AC Chair Coach'),
 ('4','AC_B_Class','Fully AC Coach');
/*!40000 ALTER TABLE `comptype` ENABLE KEYS */;


--
-- Definition of table `contact`
--

DROP TABLE IF EXISTS `contact`;
CREATE TABLE `contact` (
  `contactid` varchar(45) NOT NULL,
  `name` varchar(255) NOT NULL,
  `mailaddress` varchar(255) NOT NULL,
  `message` varchar(255) NOT NULL,
  PRIMARY KEY  (`contactid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `contact`
--

/*!40000 ALTER TABLE `contact` DISABLE KEYS */;
INSERT INTO `contact` (`contactid`,`name`,`mailaddress`,`message`) VALUES 
 ('1','rabu','rabu@rabu.com','i can not connect in this website');
/*!40000 ALTER TABLE `contact` ENABLE KEYS */;


--
-- Definition of table `fare`
--

DROP TABLE IF EXISTS `fare`;
CREATE TABLE `fare` (
  `fareid` varchar(45) NOT NULL,
  `fromstationid` varchar(45) NOT NULL,
  `tostationid` varchar(45) NOT NULL,
  `comptypeid` varchar(45) NOT NULL,
  `passtypeid` varchar(45) NOT NULL,
  `fareamount` double NOT NULL,
  PRIMARY KEY  (`fareid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fare`
--

/*!40000 ALTER TABLE `fare` DISABLE KEYS */;
INSERT INTO `fare` (`fareid`,`fromstationid`,`tostationid`,`comptypeid`,`passtypeid`,`fareamount`) VALUES 
 ('1','1','15','1','5',500);
/*!40000 ALTER TABLE `fare` ENABLE KEYS */;


--
-- Definition of table `farechart`
--

DROP TABLE IF EXISTS `farechart`;
CREATE TABLE `farechart` (
  `farechartid` varchar(45) NOT NULL,
  `fromstationid` varchar(45) NOT NULL,
  `tostationid` varchar(45) NOT NULL,
  `comptypeid` varchar(45) NOT NULL,
  `passtypeid` varchar(45) NOT NULL,
  `fareamount` double NOT NULL,
  PRIMARY KEY  (`farechartid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `farechart`
--

/*!40000 ALTER TABLE `farechart` DISABLE KEYS */;
INSERT INTO `farechart` (`farechartid`,`fromstationid`,`tostationid`,`comptypeid`,`passtypeid`,`fareamount`) VALUES 
 ('1','2','15','2','5',400),
 ('2','2','14','2','6',100),
 ('3','2','15','2','7',100);
/*!40000 ALTER TABLE `farechart` ENABLE KEYS */;


--
-- Definition of table `fromstation`
--

DROP TABLE IF EXISTS `fromstation`;
CREATE TABLE `fromstation` (
  `fromstationid` varchar(45) NOT NULL,
  `fromstationname` varchar(255) NOT NULL,
  PRIMARY KEY  (`fromstationid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fromstation`
--

/*!40000 ALTER TABLE `fromstation` DISABLE KEYS */;
INSERT INTO `fromstation` (`fromstationid`,`fromstationname`) VALUES 
 ('1','Dhaka'),
 ('10','Tongi'),
 ('2','BimanBandar'),
 ('3','Chitagong'),
 ('4','Sylhet'),
 ('5','khulna'),
 ('6','Rajshahi'),
 ('7','Rangpur'),
 ('8','Dinajpur'),
 ('9','B-Baria');
/*!40000 ALTER TABLE `fromstation` ENABLE KEYS */;


--
-- Definition of table `passengerinfo`
--

DROP TABLE IF EXISTS `passengerinfo`;
CREATE TABLE `passengerinfo` (
  `passengerid` varchar(45) NOT NULL,
  `passengername` varchar(255) NOT NULL,
  `emailid` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `dob` date NOT NULL,
  `address` varchar(255) NOT NULL,
  `postcode` varchar(45) NOT NULL,
  `nid` varchar(255) NOT NULL,
  `birthid` varchar(255) default NULL,
  `phone` varchar(45) NOT NULL,
  PRIMARY KEY  (`passengerid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `passengerinfo`
--

/*!40000 ALTER TABLE `passengerinfo` DISABLE KEYS */;
INSERT INTO `passengerinfo` (`passengerid`,`passengername`,`emailid`,`password`,`dob`,`address`,`postcode`,`nid`,`birthid`,`phone`) VALUES 
 ('1','a','a@a.com','123','1992-06-02','143 mugda','1214','123456','123456789','0123456'),
 ('2','b','b@b.com','1234','1992-03-13','143 north','1212','123456','123456789','012345');
/*!40000 ALTER TABLE `passengerinfo` ENABLE KEYS */;


--
-- Definition of table `passengertype`
--

DROP TABLE IF EXISTS `passengertype`;
CREATE TABLE `passengertype` (
  `passtypeid` varchar(45) NOT NULL,
  `passtypename` varchar(45) NOT NULL,
  `passadult` int(10) unsigned NOT NULL,
  `passchild` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`passtypeid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `passengertype`
--

/*!40000 ALTER TABLE `passengertype` DISABLE KEYS */;
INSERT INTO `passengertype` (`passtypeid`,`passtypename`,`passadult`,`passchild`) VALUES 
 ('5','Adult',1,0),
 ('7','Child',2,1),
 ('9','adult',3,2);
/*!40000 ALTER TABLE `passengertype` ENABLE KEYS */;


--
-- Definition of table `payment`
--

DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment` (
  `paymentid` varchar(45) NOT NULL,
  `reservid` varchar(45) NOT NULL,
  `qty` int(10) unsigned NOT NULL,
  `total` double NOT NULL,
  `farechartid` varchar(45) NOT NULL,
  `fareamt` double NOT NULL,
  PRIMARY KEY  (`paymentid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment`
--

/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;


--
-- Definition of table `purchaseticket`
--

DROP TABLE IF EXISTS `purchaseticket`;
CREATE TABLE `purchaseticket` (
  `purchaseid` varchar(45) NOT NULL,
  `fromstationid` varchar(45) NOT NULL,
  `tostationid` varchar(45) NOT NULL,
  PRIMARY KEY  (`purchaseid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `purchaseticket`
--

/*!40000 ALTER TABLE `purchaseticket` DISABLE KEYS */;
/*!40000 ALTER TABLE `purchaseticket` ENABLE KEYS */;


--
-- Definition of table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
CREATE TABLE `reservation` (
  `reservid` varchar(45) NOT NULL,
  `passengerid` varchar(45) default NULL,
  `comptypeid` varchar(45) default NULL,
  `compsubtypeid` varchar(45) default NULL,
  `trainid` varchar(45) default NULL,
  `fromstationid` varchar(45) default NULL,
  `tostationid` varchar(45) default NULL,
  `adult` int(10) unsigned default NULL,
  `child` int(10) unsigned default NULL,
  `reservdate` date default NULL,
  `journeydate` date default NULL,
  `status` varchar(255) default NULL,
  PRIMARY KEY  (`reservid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reservation`
--

/*!40000 ALTER TABLE `reservation` DISABLE KEYS */;
INSERT INTO `reservation` (`reservid`,`passengerid`,`comptypeid`,`compsubtypeid`,`trainid`,`fromstationid`,`tostationid`,`adult`,`child`,`reservdate`,`journeydate`,`status`) VALUES 
 ('1','rabu','1','kha','padma','4','16',2,1,'2019-06-08','2019-06-10','order'),
 ('2','shimu','3','gha','jamuna','2','18',1,1,'2019-06-10','2019-06-15','order'),
 ('3','sultana','2','gha','turna','1','13',3,2,'2019-06-12','2019-06-14','order'),
 ('4','nur','2','ka','silkcity','1','16',3,1,'2019-06-10','2019-07-14','order'),
 ('5','borno','2','ghi','citra','1','13',4,1,'2019-06-12','2019-06-13','order'),
 ('6','reb','1','kha','padma','8','19',1,0,'2019-06-08','2019-06-15','order'),
 ('7','rabu','3','ga','jamuna','3','14',2,0,'2019-07-08','2019-07-10','order');
/*!40000 ALTER TABLE `reservation` ENABLE KEYS */;


--
-- Definition of table `reservationdetails`
--

DROP TABLE IF EXISTS `reservationdetails`;
CREATE TABLE `reservationdetails` (
  `resdetid` varchar(45) NOT NULL,
  `reservid` varchar(45) default NULL,
  `compsubtypeid` varchar(45) default NULL,
  `seatno` int(10) unsigned default NULL,
  `journeydate` date default NULL,
  `trainid` varchar(45) default NULL,
  `farechartid` varchar(45) default NULL,
  PRIMARY KEY  (`resdetid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reservationdetails`
--

/*!40000 ALTER TABLE `reservationdetails` DISABLE KEYS */;
INSERT INTO `reservationdetails` (`resdetid`,`reservid`,`compsubtypeid`,`seatno`,`journeydate`,`trainid`,`farechartid`) VALUES 
 ('1','1','1',10,'2019-06-10','1','1');
/*!40000 ALTER TABLE `reservationdetails` ENABLE KEYS */;


--
-- Definition of table `station`
--

DROP TABLE IF EXISTS `station`;
CREATE TABLE `station` (
  `stationid` varchar(45) NOT NULL,
  `stationname` varchar(45) NOT NULL,
  `status` varchar(45) NOT NULL,
  PRIMARY KEY  (`stationid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `station`
--

/*!40000 ALTER TABLE `station` DISABLE KEYS */;
INSERT INTO `station` (`stationid`,`stationname`,`status`) VALUES 
 ('501','dhaka','true');
/*!40000 ALTER TABLE `station` ENABLE KEYS */;


--
-- Definition of table `test`
--

DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `testid` varchar(45) NOT NULL,
  `testname` varchar(45) NOT NULL,
  `testarea` varchar(45) NOT NULL,
  `comptypeid` varchar(45) NOT NULL,
  `compsubtypeid` varchar(45) NOT NULL,
  `fromstationid` varchar(45) NOT NULL,
  `tostationid` varchar(45) NOT NULL,
  PRIMARY KEY  (`testid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `test`
--

/*!40000 ALTER TABLE `test` DISABLE KEYS */;
INSERT INTO `test` (`testid`,`testname`,`testarea`,`comptypeid`,`compsubtypeid`,`fromstationid`,`tostationid`) VALUES 
 ('50','rebeka','mugda','1','1','1','15');
/*!40000 ALTER TABLE `test` ENABLE KEYS */;


--
-- Definition of table `tostation`
--

DROP TABLE IF EXISTS `tostation`;
CREATE TABLE `tostation` (
  `tostationid` varchar(45) NOT NULL,
  `tostationname` varchar(255) NOT NULL,
  PRIMARY KEY  (`tostationid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tostation`
--

/*!40000 ALTER TABLE `tostation` DISABLE KEYS */;
INSERT INTO `tostation` (`tostationid`,`tostationname`) VALUES 
 ('13','Tangail'),
 ('14','BimanBandor'),
 ('15','Dhaka'),
 ('16','Khulna'),
 ('17','Rajshahi'),
 ('18','Rangpur'),
 ('19','dinajpur'),
 ('20','sirajgong');
/*!40000 ALTER TABLE `tostation` ENABLE KEYS */;


--
-- Definition of table `train`
--

DROP TABLE IF EXISTS `train`;
CREATE TABLE `train` (
  `id` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `train_id` varchar(45) NOT NULL,
  `source_station` varchar(255) NOT NULL,
  `destination_station` varchar(255) NOT NULL,
  `type` varchar(45) NOT NULL,
  `fare` double NOT NULL,
  `distance` double NOT NULL,
  `seats` int(10) unsigned NOT NULL,
  `arrives` int(10) unsigned NOT NULL,
  `departs` int(10) unsigned NOT NULL,
  `day` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `train`
--

/*!40000 ALTER TABLE `train` DISABLE KEYS */;
/*!40000 ALTER TABLE `train` ENABLE KEYS */;


--
-- Definition of table `traininfo`
--

DROP TABLE IF EXISTS `traininfo`;
CREATE TABLE `traininfo` (
  `trainid` varchar(45) NOT NULL,
  `trainnub` varchar(45) NOT NULL,
  `trainname` varchar(45) NOT NULL,
  `fromstationid` varchar(45) NOT NULL,
  `tostationid` varchar(45) NOT NULL,
  `depttime` varchar(45) NOT NULL,
  `arrivtime` varchar(45) NOT NULL,
  `dayoff` varchar(45) NOT NULL,
  PRIMARY KEY  (`trainid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `traininfo`
--

/*!40000 ALTER TABLE `traininfo` DISABLE KEYS */;
INSERT INTO `traininfo` (`trainid`,`trainnub`,`trainname`,`fromstationid`,`tostationid`,`depttime`,`arrivtime`,`dayoff`) VALUES 
 ('500','100','padma','1','13','2.50 pm','9.30 pm','sunday'),
 ('502','102','chitra','2','15','10.00 am','12.00 am','tuesday'),
 ('504','104','jamuna','1','13','9.00 am','12.00 pm','sunday'),
 ('506','106','Turna','1','13','7.10 am','11.15 am','tuesday'),
 ('508','108','Silkcity','6','14','3.40 pm','7.00 pm','sunday');
/*!40000 ALTER TABLE `traininfo` ENABLE KEYS */;


--
-- Definition of table `trainseat`
--

DROP TABLE IF EXISTS `trainseat`;
CREATE TABLE `trainseat` (
  `seatid` varchar(45) NOT NULL,
  `trainid` varchar(45) NOT NULL,
  `comptypeid` varchar(45) NOT NULL,
  `compsubtypeid` varchar(45) NOT NULL,
  `totalseat` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`seatid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `trainseat`
--

/*!40000 ALTER TABLE `trainseat` DISABLE KEYS */;
INSERT INTO `trainseat` (`seatid`,`trainid`,`comptypeid`,`compsubtypeid`,`totalseat`) VALUES 
 ('1','502','1','2',50);
/*!40000 ALTER TABLE `trainseat` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `emailid` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  PRIMARY KEY  (`emailid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`emailid`,`phone`,`username`) VALUES 
 ('diba@gmail.com','+880123456','diba'),
 ('nur@nur.com','+8801234','nur'),
 ('rabu@gmail.com','123','rabu'),
 ('reb@gmail.com','12345','rabu');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;


--
-- Definition of table `user1`
--

DROP TABLE IF EXISTS `user1`;
CREATE TABLE `user1` (
  `emailid` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  `username` varchar(255) NOT NULL,
  PRIMARY KEY  (`emailid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user1`
--

/*!40000 ALTER TABLE `user1` DISABLE KEYS */;
/*!40000 ALTER TABLE `user1` ENABLE KEYS */;


--
-- Definition of table `userreservation`
--

DROP TABLE IF EXISTS `userreservation`;
CREATE TABLE `userreservation` (
  `userreservationid` varchar(45) NOT NULL,
  `trainid` varchar(45) NOT NULL,
  `comptypeid` varchar(45) NOT NULL,
  `passtypeid` varchar(45) NOT NULL,
  `ptn` varchar(45) NOT NULL,
  `reservationdate` date default NULL,
  `journeydate` date NOT NULL,
  `adult` int(10) unsigned default NULL,
  `child` int(10) unsigned default NULL,
  PRIMARY KEY  (`userreservationid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userreservation`
--

/*!40000 ALTER TABLE `userreservation` DISABLE KEYS */;
/*!40000 ALTER TABLE `userreservation` ENABLE KEYS */;


--
-- Definition of table `userrole`
--

DROP TABLE IF EXISTS `userrole`;
CREATE TABLE `userrole` (
  `emailid` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `role` varchar(45) NOT NULL,
  `status` varchar(45) NOT NULL,
  PRIMARY KEY  (`emailid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userrole`
--

/*!40000 ALTER TABLE `userrole` DISABLE KEYS */;
INSERT INTO `userrole` (`emailid`,`password`,`role`,`status`) VALUES 
 ('diba@gmail.com','123','ROLE_USER','True'),
 ('nur@nur.com','1234','ROLE_USER','True'),
 ('rabu@gmail.com','123','ROLE_ADMIN','True'),
 ('reb@gmail.com','12345','ROLE_USER','True');
/*!40000 ALTER TABLE `userrole` ENABLE KEYS */;


--
-- Definition of table `userrole1`
--

DROP TABLE IF EXISTS `userrole1`;
CREATE TABLE `userrole1` (
  `emailid` varchar(45) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(45) NOT NULL,
  `status` varchar(255) NOT NULL,
  PRIMARY KEY  (`emailid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userrole1`
--

/*!40000 ALTER TABLE `userrole1` DISABLE KEYS */;
/*!40000 ALTER TABLE `userrole1` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
