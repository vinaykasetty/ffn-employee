START TRANSACTION;
CREATE DATABASE IF NOT EXISTS `employee_data`;

USE `employee_data`;

CREATE TABLE IF NOT EXISTS `employee` (
  `emp_no` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `last_updated` datetime DEFAULT NULL,
  PRIMARY KEY (`emp_no`)
);

CREATE TABLE IF NOT EXISTS `department` (
  `dep_no` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `details` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `last_updated` datetime DEFAULT NULL,
  PRIMARY KEY (`dep_no`)
);

COMMIT;