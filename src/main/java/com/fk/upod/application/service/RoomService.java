package com.fk.upod.application.service;

import com.fk.upod.application.domain.Room;
import com.fk.upod.application.port.in.usecase.RetrieveRoomUseCase;
import com.fk.upod.application.port.out.persistence.RoomReadOutPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomService implements RetrieveRoomUseCase {

    private final RoomReadOutPort roomReadOutPort;

    @Override
    public List<Room> retrieve() {
        return roomReadOutPort.getAllRooms();
    }
}
