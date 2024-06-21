package com.fk.upod.application.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Reservation {

    Long id;
    LocalDateTime checkInDate;
    LocalDateTime checkOutDate;
    Room room;
    Customer customer;
}
