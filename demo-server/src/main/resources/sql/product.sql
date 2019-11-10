DROP DATABASE IF EXISTS sc_product;
  CREATE DATABASE sc_product DEFAULT CHARSET utf8mb4;
  USE sc_product;

  DROP TABLE IF EXISTS product;
  CREATE TABLE product
  (
      id           INT AUTO_INCREMENT   NOT NULL ,
      name         VARCHAR(200)         NOT NULL ,
      description  VARCHAR(500)                  ,
      PRIMARY KEY (id)
  );