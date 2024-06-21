package com.fk.upod.application.domain;

import lombok.Data;

@Data
public class Room {

    Long id;
    String roomNumber;
    Integer capacity;
    boolean seaView;
    boolean jacuzzi;
    boolean safeBox;
}
