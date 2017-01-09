DROP DATABASE test;
CREATE DATABASE test;
USE test;
-- MySQL dump 10.13  Distrib 5.5.46, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: test
-- ------------------------------------------------------
-- Server version	5.5.46-0ubuntu0.14.04.2

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `hibernate_id_generation`
--

DROP TABLE IF EXISTS `hibernate_id_generation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_id_generation` (
  `next_hi` BIGINT(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_id_generation`
--

LOCK TABLES `hibernate_id_generation` WRITE;
/*!40000 ALTER TABLE `hibernate_id_generation` DISABLE KEYS */;
INSERT INTO `hibernate_id_generation` VALUES (169);
/*!40000 ALTER TABLE `hibernate_id_generation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_element`
--

DROP TABLE IF EXISTS `t_element`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_element` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `created_date` DATETIME NOT NULL,
  `last_modified` DATETIME NOT NULL,
  `version` INT(11) NOT NULL,
  `uuid` VARCHAR(100) NOT NULL,
  `TEXT` VARCHAR(100) NOT NULL COMMENT 'label名称',
  `height` INT(11) NOT NULL COMMENT '高',
  `width` INT(11) NOT NULL COMMENT '宽',
  `positionx` double NOT NULL COMMENT 'x坐标',
  `positiony` double NOT NULL COMMENT 'y坐标',
  `comments` VARCHAR(300) DEFAULT NULL,
  `ml_flow_id` BIGINT(20) NOT NULL,
  `element_tpl_id` BIGINT(20) NOT NULL,
  `status` VARCHAR(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uuid` (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=5373955 DEFAULT CHARSET=utf8 COMMENT='GUI 拖拽的元素';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_element`
--

LOCK TABLES `t_element` WRITE;
/*!40000 ALTER TABLE `t_element` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_element` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_element_history`
--

DROP TABLE IF EXISTS `t_element_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_element_history` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `created_date` DATETIME NOT NULL,
  `last_modified` DATETIME NOT NULL,
  `version` INT(11) NOT NULL,
  `TEXT` VARCHAR(100) NOT NULL COMMENT 'label名称',
  `height` INT(11) NOT NULL COMMENT '高',
  `width` INT(11) NOT NULL COMMENT '宽',
  `positionx` double NOT NULL COMMENT 'x坐标',
  `positiony` double NOT NULL COMMENT 'y坐标',
  `comments` VARCHAR(300) DEFAULT NULL,
  `ml_flow_id` BIGINT(20) NOT NULL,
  `ml_flow_history_id` BIGINT(20) NOT NULL,
  `element_tpl_id` BIGINT(20) NOT NULL,
  `status` VARCHAR(100) DEFAULT NULL,
  `uuid` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5472272 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_element_history`
--

LOCK TABLES `t_element_history` WRITE;
/*!40000 ALTER TABLE `t_element_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_element_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_element_param`
--

DROP TABLE IF EXISTS `t_element_param`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_element_param` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `created_date` DATETIME NOT NULL,
  `last_modified` DATETIME NOT NULL,
  `version` INT(11) NOT NULL,
  `element_id` BIGINT(20) NOT NULL,
  `value` TEXT NOT NULL,
  `comments` VARCHAR(300) DEFAULT NULL,
  `element_tpl_param_id` BIGINT(20) NOT NULL,
  `ml_flow_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5406747 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_element_param`
--

LOCK TABLES `t_element_param` WRITE;
/*!40000 ALTER TABLE `t_element_param` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_element_param` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_element_param_history`
--

DROP TABLE IF EXISTS `t_element_param_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_element_param_history` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `created_date` DATETIME NOT NULL,
  `last_modified` DATETIME NOT NULL,
  `version` INT(11) NOT NULL,
  `element_id` BIGINT(20) NOT NULL,
  `value` TEXT NOT NULL,
  `comments` VARCHAR(300) DEFAULT NULL,
  `element_tpl_param_id` BIGINT(20) NOT NULL,
  `ml_flow_id` BIGINT(20) NOT NULL,
  `ml_flow_history_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5505294 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_element_param_history`
--

LOCK TABLES `t_element_param_history` WRITE;
/*!40000 ALTER TABLE `t_element_param_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_element_param_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_element_tpl`
--

DROP TABLE IF EXISTS `t_element_tpl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_element_tpl` (
  `id` BIGINT(20) NOT NULL,
  `created_date` DATETIME NOT NULL,
  `last_modified` DATETIME NOT NULL,
  `version` INT(11) NOT NULL,
  `type` VARCHAR(100) NOT NULL COMMENT 'js 组件type',
  `TEXT` VARCHAR(100) NOT NULL COMMENT 'label名称',
  `height` INT(11) NOT NULL COMMENT '高',
  `width` INT(11) NOT NULL COMMENT '宽',
  `in_ports` VARCHAR(100) NOT NULL COMMENT '输入连接点名称,数组","分隔',
  `out_ports` VARCHAR(100) NOT NULL COMMENT '输出连接点名称,数组","分隔',
  `comments` VARCHAR(300) DEFAULT NULL,
  `is_start` tinyint(1) NOT NULL DEFAULT '0',
  `is_end` tinyint(1) NOT NULL DEFAULT '0',
  `group_id` BIGINT(20) NOT NULL,
  `owner_id` BIGINT(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_element_tpl`
--

LOCK TABLES `t_element_tpl` WRITE;
/*!40000 ALTER TABLE `t_element_tpl` DISABLE KEYS */;
INSERT INTO `t_element_tpl` VALUES (1998848,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,'devs.StartState','开始',20,20,'','','',1,0,1966080,NULL),(1998849,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,'devs.EndState','结束',20,20,'','','',0,1,1966080,NULL),(1998850,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,'devs.Atomic','数据抽样',20,20,'in1','out1,out2','',0,0,1966081,NULL),(1998851,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,'devs.Atomic','Meta数据计算',20,20,'in1','out1','',0,0,1966081,NULL),(1998852,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,'devs.Atomic','特征选取',20,20,'in1,in2','out1','',0,0,1966081,NULL),(1998853,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,'devs.Atomic','特征规范化',20,20,'in1','out1','',0,0,1966081,NULL),(2850817,'2016-02-24 14:10:47','2016-02-24 14:10:47',0,'devs.Atomic','新建组件',20,20,'in1','out1',NULL,0,0,2785280,884736),(3145728,'2016-02-25 16:29:22','2016-02-25 16:29:22',0,'devs.Atomic','test1',20,20,'in1','out1',NULL,0,0,2785280,884736);
/*!40000 ALTER TABLE `t_element_tpl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_element_tpl_group`
--

DROP TABLE IF EXISTS `t_element_tpl_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_element_tpl_group` (
  `id` BIGINT(20) NOT NULL,
  `created_date` DATETIME NOT NULL,
  `last_modified` DATETIME NOT NULL,
  `version` INT(11) NOT NULL,
  `name` VARCHAR(100) NOT NULL COMMENT 'key',
  `value` VARCHAR(100) NOT NULL COMMENT 'label名称',
  `closed` tinyint(1) NOT NULL DEFAULT '0',
  `sort` INT(11) NOT NULL COMMENT '顺序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_element_tpl_group`
--

LOCK TABLES `t_element_tpl_group` WRITE;
/*!40000 ALTER TABLE `t_element_tpl_group` DISABLE KEYS */;
INSERT INTO `t_element_tpl_group` VALUES (1966080,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,'base','基础工具',0,1),(1966081,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,'feature','特征工具',1,2),(2785280,'2016-02-24 10:16:18','2016-02-24 10:16:18',0,'custom','自定义',1,5);
/*!40000 ALTER TABLE `t_element_tpl_group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_element_tpl_param`
--

DROP TABLE IF EXISTS `t_element_tpl_param`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_element_tpl_param` (
  `id` BIGINT(20) NOT NULL,
  `created_date` DATETIME NOT NULL,
  `last_modified` DATETIME NOT NULL,
  `version` INT(11) NOT NULL,
  `element_tpl_id` BIGINT(20) NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `default_value` TEXT NOT NULL,
  `value_type` VARCHAR(100) NOT NULL COMMENT '枚举类型[String,Long,Double]',
  `input_type` VARCHAR(100) NOT NULL COMMENT '枚举类型[TEXT,range,color,select,textarea]',
  `group_id` BIGINT(20) NOT NULL COMMENT '枚举[module,in,out,spark]',
  `comments` VARCHAR(300) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_element_tpl_param`
--

LOCK TABLES `t_element_tpl_param` WRITE;
/*!40000 ALTER TABLE `t_element_tpl_param` DISABLE KEYS */;
INSERT INTO `t_element_tpl_param` VALUES (2031616,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998848,'备注','无','STRING','textarea',1933315,''),(2031617,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998849,'备注','无','STRING','textarea',1933315,''),(2031618,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998850,'k1','v1','STRING','TEXT',1933312,'参数1'),(2031619,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998850,'k2','v2','STRING','TEXT',1933312,'参数2'),(2031620,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998850,'k3','v3','STRING','TEXT',1933312,'参数3'),(2031621,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998850,'k1','v1','STRING','TEXT',1933313,'参数1'),(2031622,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998850,'k2','v2','STRING','TEXT',1933313,'参数2'),(2031623,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998850,'k3','v3','STRING','TEXT',1933313,'参数3'),(2031624,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998850,'k1','v1','STRING','TEXT',1933314,'参数1'),(2031625,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998850,'k2','v2','STRING','TEXT',1933314,'参数2'),(2031626,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998850,'k3','v3','STRING','TEXT',1933314,'参数3'),(2031627,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998851,'k1','v1','STRING','TEXT',1933312,'参数1'),(2031628,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998851,'k2','v2','STRING','TEXT',1933312,'参数2'),(2031629,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998851,'k3','v3','STRING','TEXT',1933312,'参数3'),(2031630,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998851,'k1','v1','STRING','TEXT',1933313,'参数1'),(2031631,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998851,'k2','v2','STRING','TEXT',1933313,'参数2'),(2031632,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998851,'k3','v3','STRING','TEXT',1933313,'参数3'),(2031633,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998851,'k1','v1','STRING','TEXT',1933314,'参数1'),(2031634,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998851,'k2','v2','STRING','TEXT',1933314,'参数2'),(2031635,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998851,'k3','v3','STRING','TEXT',1933314,'参数3'),(2031636,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998852,'k1','v1','STRING','TEXT',1933312,'参数1'),(2031637,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998852,'k2','v2','STRING','TEXT',1933312,'参数2'),(2031638,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998852,'k3','v3','STRING','TEXT',1933312,'参数3'),(2031639,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998852,'k1','v1','STRING','TEXT',1933313,'参数1'),(2031640,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998852,'k2','v2','STRING','TEXT',1933313,'参数2'),(2031641,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998852,'k3','v3','STRING','TEXT',1933313,'参数3'),(2031642,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998852,'k1','v1','STRING','TEXT',1933314,'参数1'),(2031643,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998852,'k2','v2','STRING','TEXT',1933314,'参数2'),(2031644,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998852,'k3','v3','STRING','TEXT',1933314,'参数3'),(2031645,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998853,'k1','v1','STRING','TEXT',1933312,'参数1'),(2031646,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998853,'k2','v2','STRING','TEXT',1933312,'参数2'),(2031647,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998853,'k3','v3','STRING','TEXT',1933312,'参数3'),(2031648,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998853,'k1','v1','STRING','TEXT',1933313,'参数1'),(2031649,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998853,'k2','v2','STRING','TEXT',1933313,'参数2'),(2031650,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998853,'k3','v3','STRING','TEXT',1933313,'参数3'),(2031651,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998853,'k1','v1','STRING','TEXT',1933314,'参数1'),(2031652,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998853,'k2','v2','STRING','TEXT',1933314,'参数2'),(2031653,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,1998853,'k3','v3','STRING','TEXT',1933314,'参数3'),(2883585,'2016-02-24 14:10:47','2016-02-24 14:10:47',0,2850817,'code','val textFile = sc.textFile(\"README.md\")\ntextFile.count()','STRING','textarea',1933315,''),(3178496,'2016-02-25 16:29:22','2016-02-25 16:29:22',0,3145728,'code','val logData = sc.textFile(\"README.md\", 2).cache()\n    val numAs = logData.filter(line => line.contains(\"a\")).count()\n    val numBs = logData.filter(line => line.contains(\"b\")).count()\n    println(\"Lines with a: %s, Lines with b: %s\".format(numAs, numBs))','STRING','textarea',1933315,'');
/*!40000 ALTER TABLE `t_element_tpl_param` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_element_tpl_param_group`
--

DROP TABLE IF EXISTS `t_element_tpl_param_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_element_tpl_param_group` (
  `id` BIGINT(20) NOT NULL,
  `created_date` DATETIME NOT NULL,
  `last_modified` DATETIME NOT NULL,
  `version` INT(11) NOT NULL,
  `name` VARCHAR(100) NOT NULL COMMENT 'key',
  `value` VARCHAR(100) NOT NULL COMMENT 'label名称',
  `closed` tinyint(1) NOT NULL DEFAULT '0',
  `sort` INT(11) NOT NULL COMMENT '顺序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_element_tpl_param_group`
--

LOCK TABLES `t_element_tpl_param_group` WRITE;
/*!40000 ALTER TABLE `t_element_tpl_param_group` DISABLE KEYS */;
INSERT INTO `t_element_tpl_param_group` VALUES (1933312,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,'module','模块参数',0,1),(1933313,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,'inout','输入输出参数',0,2),(1933314,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,'spark','spark参数',0,3),(1933315,'2016-02-16 09:59:27','2016-02-16 09:59:27',0,'other','其他参数',0,4);
/*!40000 ALTER TABLE `t_element_tpl_param_group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_link`
--

DROP TABLE IF EXISTS `t_link`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_link` (
  `id` BIGINT(20) NOT NULL,
  `created_date` DATETIME NOT NULL,
  `last_modified` DATETIME NOT NULL,
  `version` INT(11) NOT NULL,
  `uuid` VARCHAR(100) NOT NULL,
  `source_id` BIGINT(20) NOT NULL COMMENT '输入id',
  `source_uuid` VARCHAR(100) NOT NULL COMMENT '输入uuid',
  `source_port` VARCHAR(100) DEFAULT NULL COMMENT '输入端口',
  `target_uuid` VARCHAR(100) NOT NULL COMMENT '输出uuid',
  `target_id` BIGINT(20) NOT NULL COMMENT '输出id',
  `target_port` VARCHAR(100) DEFAULT NULL COMMENT '输出端口',
  `type` VARCHAR(100) NOT NULL COMMENT '连线类型',
  `comments` VARCHAR(300) DEFAULT NULL,
  `ml_flow_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uuid` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_link`
--

LOCK TABLES `t_link` WRITE;
/*!40000 ALTER TABLE `t_link` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_link` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_link_history`
--

DROP TABLE IF EXISTS `t_link_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_link_history` (
  `id` BIGINT(20) NOT NULL,
  `created_date` DATETIME NOT NULL,
  `last_modified` DATETIME NOT NULL,
  `version` INT(11) NOT NULL,
  `source_id` BIGINT(20) NOT NULL COMMENT '输入id',
  `source_uuid` VARCHAR(100) NOT NULL COMMENT '输入uuid',
  `source_port` VARCHAR(100) DEFAULT NULL COMMENT '输入端口',
  `target_uuid` VARCHAR(100) NOT NULL COMMENT '输出uuid',
  `target_id` BIGINT(20) NOT NULL COMMENT '输出id',
  `target_port` VARCHAR(100) DEFAULT NULL COMMENT '输出端口',
  `type` VARCHAR(100) NOT NULL COMMENT '连线类型',
  `comments` VARCHAR(300) DEFAULT NULL,
  `ml_flow_id` BIGINT(20) NOT NULL,
  `ml_flow_history_id` BIGINT(20) NOT NULL,
  `uuid` VARCHAR(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_link_history`
--

LOCK TABLES `t_link_history` WRITE;
/*!40000 ALTER TABLE `t_link_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_link_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_ml_flow`
--

DROP TABLE IF EXISTS `t_ml_flow`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_ml_flow` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `created_date` DATETIME NOT NULL,
  `last_modified` DATETIME NOT NULL,
  `version` INT(11) NOT NULL,
  `owner_id` BIGINT(20) NOT NULL COMMENT 'user id',
  `name` VARCHAR(100) NOT NULL,
  `status` VARCHAR(100) NOT NULL COMMENT '状态 枚举[stop,running,finished]',
  `comments` VARCHAR(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5341186 DEFAULT CHARSET=utf8 COMMENT='算法流程';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_ml_flow`
--

LOCK TABLES `t_ml_flow` WRITE;
/*!40000 ALTER TABLE `t_ml_flow` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_ml_flow` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_ml_flow_history`
--

DROP TABLE IF EXISTS `t_ml_flow_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_ml_flow_history` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `created_date` DATETIME NOT NULL,
  `last_modified` DATETIME NOT NULL,
  `version` INT(11) NOT NULL,
  `owner_id` BIGINT(20) NOT NULL COMMENT 'user id',
  `name` VARCHAR(100) NOT NULL,
  `status` VARCHAR(100) NOT NULL COMMENT '状态 枚举[stop,running,finished]',
  `comments` VARCHAR(100) DEFAULT NULL,
  `column_13` INT(11) DEFAULT NULL,
  `start_time` BIGINT(20) DEFAULT NULL,
  `end_time` BIGINT(20) DEFAULT NULL,
  `ml_flow_id` BIGINT(20) NOT NULL,
  `result` VARCHAR(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5439497 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_ml_flow_history`
--

LOCK TABLES `t_ml_flow_history` WRITE;
/*!40000 ALTER TABLE `t_ml_flow_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_ml_flow_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_user`
--

DROP TABLE IF EXISTS `t_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_user` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `created_date` DATETIME NOT NULL,
  `last_modified` DATETIME NOT NULL,
  `version` INT(11) NOT NULL,
  `username` VARCHAR(100) NOT NULL COMMENT '用户名',
  `password` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=884737 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_user`
--

LOCK TABLES `t_user` WRITE;
/*!40000 ALTER TABLE `t_user` DISABLE KEYS */;
INSERT INTO `t_user` VALUES (884736,'2016-02-05 10:22:39','2016-02-05 10:22:39',0,'test','test');
/*!40000 ALTER TABLE `t_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_zeppelin_paragraph`
--

DROP TABLE IF EXISTS `t_zeppelin_paragraph`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_zeppelin_paragraph` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `created_date` DATETIME NOT NULL,
  `last_modified` DATETIME NOT NULL,
  `version` INT(11) NOT NULL,
  `note_id` VARCHAR(100) NOT NULL COMMENT 'zeppelin notebook id',
  `note_name` VARCHAR(100) NOT NULL COMMENT 'zeppelin notebook name',
  `job_name` VARCHAR(100) NOT NULL COMMENT 'zeppelin notebook job name',
  `element_id` BIGINT(20) DEFAULT NULL,
  `uuid` VARCHAR(100) NOT NULL,
  `code` VARCHAR(100) DEFAULT NULL,
  `msg` TEXT,
  `type` VARCHAR(100) DEFAULT NULL,
  `status` VARCHAR(100) DEFAULT NULL,
  `TEXT` TEXT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_zeppelin_paragraph`
--

LOCK TABLES `t_zeppelin_paragraph` WRITE;
/*!40000 ALTER TABLE `t_zeppelin_paragraph` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_zeppelin_paragraph` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-03-08 19:49:55
