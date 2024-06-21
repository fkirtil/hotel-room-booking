package com.fk.upod.application.port.out.persistence;

import com.fk.upod.application.domain.Room;

import java.util.List;

public interface RoomReadOutPort {

    List<Room> getAllRooms();
}
