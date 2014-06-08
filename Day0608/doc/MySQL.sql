CREATE TABLE `test`.`user` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `cities` VARCHAR(255) NULL,
  `hobbies` VARCHAR(255) NULL,
  PRIMARY KEY (`ID`));


CREATE TABLE `test`.`book` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(255) NOT NULL,
  `author` VARCHAR(100) NULL,
  `press` VARCHAR(100) NULL,
  `cover` VARCHAR(255) NULL,
  `date` DATE NULL,
  `price` DOUBLE NULL,
  `amount` INT NULL,
  PRIMARY KEY (`id`));

