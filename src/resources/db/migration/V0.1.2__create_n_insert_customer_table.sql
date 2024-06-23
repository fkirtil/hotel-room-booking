CREATE TABLE IF NOT EXISTS customer
(
    id           BIGINT       NOT NULL PRIMARY KEY AUTO_INCREMENT,
    first_name   VARCHAR(255) NOT NULL,
    last_name    VARCHAR(255) NOT NULL,
    email        VARCHAR(255) NOT NULL,
    phone_number VARCHAR(255) NOT NULL
    );

ALTER TABLE customer
    AUTO_INCREMENT = 1;

INSERT INTO customer (first_name, last_name, email, phone_number)
VALUES ("Dwight", "Schrute", "d@gmail.com", "5555555555"),
       ("Michael", "Scott", "m@gmail.com", "5555555555"),
       ("Kevin", "Malone", "k@gmail.com", "5555555555");