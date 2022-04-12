-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: user
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `infouser`
--

DROP TABLE IF EXISTS `infouser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `infouser` (
  `UserName` varchar(45) NOT NULL,
  `typeskin` varchar(45) DEFAULT NULL,
  `typehiar` varchar(45) DEFAULT NULL,
  `s1` int DEFAULT NULL,
  `d1` varchar(45) DEFAULT NULL,
  `s2` int DEFAULT NULL,
  `d2` varchar(45) DEFAULT NULL,
  `s3` int DEFAULT NULL,
  `d3` varchar(45) DEFAULT NULL,
  `s4` int DEFAULT NULL,
  `d4` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`UserName`),
  CONSTRAINT `UserName` FOREIGN KEY (`UserName`) REFERENCES `user` (`UserName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `infouser`
--

LOCK TABLES `infouser` WRITE;
/*!40000 ALTER TABLE `infouser` DISABLE KEYS */;
INSERT INTO `infouser` VALUES ('bn90897665',NULL,'curly',0,NULL,0,NULL,0,NULL,0,NULL),('Nnada123123',NULL,'Curly',1,'2021-12-12',0,NULL,0,NULL,0,NULL),('Nnofa123123','Oily','Curly',1,'2021-12-13',2,'2021-12-27',0,NULL,0,NULL),('nora',NULL,NULL,0,NULL,0,NULL,0,NULL,0,NULL),('nora123456',NULL,NULL,0,NULL,0,NULL,0,NULL,0,NULL),('nora12345677899','Oily',NULL,0,NULL,0,NULL,0,NULL,0,NULL),('nora123456788',NULL,NULL,0,NULL,0,NULL,0,NULL,0,NULL),('Rrana123123','Normal','Curly',0,NULL,0,NULL,0,NULL,0,NULL);
/*!40000 ALTER TABLE `infouser` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-11 19:32:13
