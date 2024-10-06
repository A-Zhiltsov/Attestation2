-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: human_friends
-- ------------------------------------------------------
-- Server version	8.0.39

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
-- Table structure for table `all_animals`
--

DROP TABLE IF EXISTS `all_animals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `all_animals` (
  `id` int NOT NULL DEFAULT '0',
  `AnimalName` varchar(50) DEFAULT NULL,
  `AnimalKind` varchar(50) DEFAULT NULL,
  `DateOfBirth` date DEFAULT NULL,
  `Commands` mediumtext,
  `Sorce` varchar(11) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `all_animals`
--

LOCK TABLES `all_animals` WRITE;
/*!40000 ALTER TABLE `all_animals` DISABLE KEYS */;
INSERT INTO `all_animals` VALUES (1,'Rex','Dog','2020-01-01','Sit, Stay, Fetch','pets'),(2,'Jessy','Dog','2019-04-03','Sit, Fetch','pets'),(3,'Lina','Cat','2021-06-14','Sit, Purr','pets'),(4,'Katty','Cat','2005-09-11','Purr','pets'),(5,'Bob','Hamster','2024-02-06','Roll, Spin','pets'),(6,'Ron','Hamster','2024-06-19','Roll, Hide','pets'),(1,'White','Horse','2016-02-04','Trot, Canter, Gallop','packanimals'),(2,'Black','Horse','2014-05-05','Trot, Canter','packanimals'),(5,'Don','Donkey','2017-09-18','Walk, Carry Load, Bray','packanimals'),(6,'Polly','Donkey','2019-01-23','Walk, Bray, Kick','packanimals');
/*!40000 ALTER TABLE `all_animals` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `horsesanddonkeys`
--

DROP TABLE IF EXISTS `horsesanddonkeys`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `horsesanddonkeys` (
  `id` int NOT NULL DEFAULT '0',
  `AnimalName` varchar(50) DEFAULT NULL,
  `AnimalKind` varchar(50) DEFAULT NULL,
  `DateOfBirth` date DEFAULT NULL,
  `Commands` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horsesanddonkeys`
--

LOCK TABLES `horsesanddonkeys` WRITE;
/*!40000 ALTER TABLE `horsesanddonkeys` DISABLE KEYS */;
INSERT INTO `horsesanddonkeys` VALUES (1,'White','Horse','2016-02-04','Trot, Canter, Gallop'),(2,'Black','Horse','2014-05-05','Trot, Canter'),(5,'Don','Donkey','2017-09-18','Walk, Carry Load, Bray'),(6,'Polly','Donkey','2019-01-23','Walk, Bray, Kick');
/*!40000 ALTER TABLE `horsesanddonkeys` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `packanimals`
--

DROP TABLE IF EXISTS `packanimals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `packanimals` (
  `id` int NOT NULL AUTO_INCREMENT,
  `AnimalKind` varchar(50) DEFAULT NULL,
  `AnimalName` varchar(50) DEFAULT NULL,
  `DateOfBirth` date DEFAULT NULL,
  `Commands` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `packanimals`
--

LOCK TABLES `packanimals` WRITE;
/*!40000 ALTER TABLE `packanimals` DISABLE KEYS */;
INSERT INTO `packanimals` VALUES (1,'Horse','White','2016-02-04','Trot, Canter, Gallop'),(2,'Horse','Black','2014-05-05','Trot, Canter'),(5,'Donkey','Don','2017-09-18','Walk, Carry Load, Bray'),(6,'Donkey','Polly','2019-01-23','Walk, Bray, Kick');
/*!40000 ALTER TABLE `packanimals` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pets`
--

DROP TABLE IF EXISTS `pets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pets` (
  `id` int NOT NULL AUTO_INCREMENT,
  `AnimalKind` varchar(50) DEFAULT NULL,
  `AnimalName` varchar(50) DEFAULT NULL,
  `DateOfBirth` date DEFAULT NULL,
  `Commands` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pets`
--

LOCK TABLES `pets` WRITE;
/*!40000 ALTER TABLE `pets` DISABLE KEYS */;
INSERT INTO `pets` VALUES (1,'Dog','Rex','2020-01-01','Sit, Stay, Fetch'),(2,'Dog','Jessy','2019-04-03','Sit, Fetch'),(3,'Cat','Lina','2021-06-14','Sit, Purr'),(4,'Cat','Katty','2005-09-11','Purr'),(5,'Hamster','Bob','2024-02-06','Roll, Spin'),(6,'Hamster','Ron','2024-06-19','Roll, Hide');
/*!40000 ALTER TABLE `pets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `young_animals`
--

DROP TABLE IF EXISTS `young_animals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `young_animals` (
  `id` int NOT NULL DEFAULT '0',
  `AnimalName` varchar(50) DEFAULT NULL,
  `AnimalKind` varchar(50) DEFAULT NULL,
  `DateOfBirth` date DEFAULT NULL,
  `Commands` text,
  `AgeMonths` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `young_animals`
--

LOCK TABLES `young_animals` WRITE;
/*!40000 ALTER TABLE `young_animals` DISABLE KEYS */;
INSERT INTO `young_animals` VALUES (3,'Lina','Cat','2021-06-14','Sit, Purr',39);
/*!40000 ALTER TABLE `young_animals` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-10-06 12:38:12
