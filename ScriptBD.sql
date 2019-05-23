-- MySQL Script generated by MySQL Workbench
-- 05/22/19 11:18:05
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `nomeUsuario` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(45) NOT NULL,
  `sexo` TINYINT(1) NOT NULL,
  `email` VARCHAR(60) NOT NULL,
  PRIMARY KEY (`idUsuario`, `email`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Corpo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Corpo` (
  `idCorpo` INT NOT NULL,
  `cor` VARCHAR(45) NULL,
  `sexo` TINYINT(1) NULL,
  PRIMARY KEY (`idCorpo`),
  UNIQUE INDEX `idCorpo_UNIQUE` (`idCorpo` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Personagem`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Personagem` (
  `idPersonagem` INT NOT NULL,
  `nomePersonagem` VARCHAR(45) NOT NULL,
  `Usuario_idUsuario` INT NOT NULL,
  `Usuario_email` VARCHAR(60) NOT NULL,
  `Corpo_idCorpo` INT NOT NULL,
  PRIMARY KEY (`idPersonagem`, `Usuario_idUsuario`, `Usuario_email`, `Corpo_idCorpo`),
  INDEX `fk_Personagem_Usuario1_idx` (`Usuario_idUsuario` ASC, `Usuario_email` ASC),
  INDEX `fk_Personagem_Corpo1_idx` (`Corpo_idCorpo` ASC),
  CONSTRAINT `fk_Personagem_Usuario1`
    FOREIGN KEY (`Usuario_idUsuario` , `Usuario_email`)
    REFERENCES `mydb`.`Usuario` (`idUsuario` , `email`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Personagem_Corpo1`
    FOREIGN KEY (`Corpo_idCorpo`)
    REFERENCES `mydb`.`Corpo` (`idCorpo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Instituto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Instituto` (
  `idInstituto` INT NOT NULL,
  `nome` VARCHAR(45) NULL,
  PRIMARY KEY (`idInstituto`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Personalizacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Personalizacao` (
  `idPersonalizacao` INT NOT NULL AUTO_INCREMENT,
  `cor` VARCHAR(45) NULL,
  `variacao` VARCHAR(45) NULL,
  `Corpo_idCorpo` INT NOT NULL,
  PRIMARY KEY (`idPersonalizacao`, `Corpo_idCorpo`),
  INDEX `fk_Personalizacao_Corpo1_idx` (`Corpo_idCorpo` ASC),
  CONSTRAINT `fk_Personalizacao_Corpo1`
    FOREIGN KEY (`Corpo_idCorpo`)
    REFERENCES `mydb`.`Corpo` (`idCorpo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Instituto_has_Personagem`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Instituto_has_Personagem` (
  `Instituto_idInstituto` INT NOT NULL,
  `Personagem_idPersonagem` INT NOT NULL,
  `Personagem_Usuario_idUsuario` INT NOT NULL,
  `Personagem_Usuario_email` VARCHAR(60) NOT NULL,
  `Personagem_Corpo_idCorpo` INT NOT NULL,
  PRIMARY KEY (`Instituto_idInstituto`, `Personagem_idPersonagem`, `Personagem_Usuario_idUsuario`, `Personagem_Usuario_email`, `Personagem_Corpo_idCorpo`),
  INDEX `fk_Instituto_has_Personagem_Personagem1_idx` (`Personagem_idPersonagem` ASC, `Personagem_Usuario_idUsuario` ASC, `Personagem_Usuario_email` ASC, `Personagem_Corpo_idCorpo` ASC),
  INDEX `fk_Instituto_has_Personagem_Instituto1_idx` (`Instituto_idInstituto` ASC),
  CONSTRAINT `fk_Instituto_has_Personagem_Instituto1`
    FOREIGN KEY (`Instituto_idInstituto`)
    REFERENCES `mydb`.`Instituto` (`idInstituto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Instituto_has_Personagem_Personagem1`
    FOREIGN KEY (`Personagem_idPersonagem` , `Personagem_Usuario_idUsuario` , `Personagem_Usuario_email` , `Personagem_Corpo_idCorpo`)
    REFERENCES `mydb`.`Personagem` (`idPersonagem` , `Usuario_idUsuario` , `Usuario_email` , `Corpo_idCorpo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
