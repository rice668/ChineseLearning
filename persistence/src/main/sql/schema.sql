DROP DATABASE chinese;
CREATE DATABASE chinese;
USE chinese;

CREATE TABLE user
(
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    username varchar(100) NOT NULL,
    password varchar(100) NOT NULL
);