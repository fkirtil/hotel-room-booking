ALTER TABLE room
    MODIFY id BIGINT AUTO_INCREMENT;

ALTER TABLE room
    AUTO_INCREMENT = 1;

INSERT INTO room (room_number, capacity, sea_view, jacuzzi, safe_box)
VALUES  (101, 1, 0, 1, 0),
        (102, 2, 0, 0, 0),
        (103, 3, 0, 1, 0),
        (104, 4, 1, 1, 0),
        (105, 2, 1, 0, 0),
        (106, 2, 1, 1, 0),
        (107, 4, 0, 1, 0),
        (108, 1, 1, 1, 0);