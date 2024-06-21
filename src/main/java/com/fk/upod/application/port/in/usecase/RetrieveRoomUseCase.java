package com.fk.upod.application.port.in.usecase;

import com.fk.upod.application.domain.Room;

import java.util.List;

public interface RetrieveRoomUseCase {

    List<Room> retrieve();
}
