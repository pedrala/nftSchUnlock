-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        10.6.1-MariaDB - mariadb.org binary distribution
-- 서버 OS:                        Win64
-- HeidiSQL 버전:                  11.2.0.6213
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- user_wallet 데이터베이스 구조 내보내기
CREATE DATABASE IF NOT EXISTS `user_wallet` /*!40100 DEFAULT CHARACTER SET utf8mb3 */;
USE `user_wallet`;

-- 테이블 user_wallet.tbl_execute_flags 구조 내보내기
CREATE TABLE IF NOT EXISTS `tbl_execute_flags` (
  `idx` int(11) NOT NULL AUTO_INCREMENT,
  `flags` int(11) DEFAULT NULL,
  `exetime` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`idx`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3 COMMENT='동시 실행 방지 처리';

-- 테이블 데이터 user_wallet.tbl_execute_flags:~0 rows (대략적) 내보내기
/*!40000 ALTER TABLE `tbl_execute_flags` DISABLE KEYS */;
INSERT INTO `tbl_execute_flags` (`idx`, `flags`, `exetime`) VALUES
	(1, 0, '2022-10-25 09:27:00');
/*!40000 ALTER TABLE `tbl_execute_flags` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
