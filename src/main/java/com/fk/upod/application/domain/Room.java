package com.fk.upod.application.domain;

import lombok.Data;

@Data
public class Room {

    Long id;
    String roomNumber;
    Integer capacity;
    String text;
    String price;
    boolean seaView;
    boolean jacuzzi;
    boolean safeBox;
}
