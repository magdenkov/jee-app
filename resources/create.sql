CREATE TABLE users (
       userID         BIGINT AUTO_INCREMENT NOT NULL,
       userLogin             VARCHAR(30) NULL,
       userPassword     VARCHAR(99) NOT NULL,
       userName     VARCHAR(99) NOT NULL,
       PRIMARY KEY (userID)
) ENGINE=INNODB;

insert into users (userLogin, userPassword, userName) values ('admin','admin','admin');
