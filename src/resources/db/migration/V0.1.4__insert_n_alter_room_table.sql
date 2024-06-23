ALTER TABLE room
    MODIFY id BIGINT AUTO_INCREMENT;

ALTER TABLE room
    AUTO_INCREMENT = 1;

INSERT INTO room (room_number, capacity, text, price, sea_view, jacuzzi, safe_box)
VALUES  (101, 1, "Rahat ve temiz", "2500", 0, 1, 0),
        (102, 2, "Deniz manzaralı", "4200", 1, 0, 0),
        (103, 3, "Konforlu", "3850", 0, 1, 0),
        (104, 4, "Geniş aileler için birebir", "5000", 1, 1, 0),
        (104, 2, "Çok iyi", "4000", 1, 1, 0);