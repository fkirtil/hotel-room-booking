CREATE TABLE IF NOT EXISTS room
(
    id              BIGINT          AUTO_INCREMENT PRIMARY KEY,
    room_number     VARCHAR(45)     DEFAULT NULL,
    capacity        SMALLINT        DEFAULT NULL,
    sea_view        BOOLEAN         NOT NULL DEFAULT FALSE,
    jacuzzi         BOOLEAN         NOT NULL DEFAULT FALSE,
    safe_box        BOOLEAN         NOT NULL DEFAULT FALSE
);