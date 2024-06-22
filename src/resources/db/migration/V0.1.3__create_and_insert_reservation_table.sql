CREATE TABLE IF NOT EXISTS reservation
(
    id             BIGINT      NOT NULL PRIMARY KEY AUTO_INCREMENT,
    check_in_date  DATETIME    NULL,
    check_out_date DATETIME    NULL,
    customer_id    BIGINT      NOT NULL,
    room_id        BIGINT      NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES customer (id),
    FOREIGN KEY (room_id) REFERENCES room (id)
    );

INSERT INTO reservation (check_in_date, check_out_date, customer_id, room_id)
VALUES ('2024-06-21 14:00:00', '2024-06-25 11:00:00', 1, 1),
       ('2024-06-22 11:00:00', '2024-06-25 11:00:00', 2, 2),
       ('2024-06-23 11:00:00', '2024-06-25 11:00:00', 3, 3);