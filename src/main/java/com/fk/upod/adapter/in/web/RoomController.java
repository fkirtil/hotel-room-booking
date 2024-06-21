package com.fk.upod.adapter.in.web;

import com.fk.upod.application.domain.Room;
import com.fk.upod.application.port.in.usecase.RetrieveRoomUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
@AllArgsConstructor
public class RoomController {

    private final RetrieveRoomUseCase retrieveRoomUseCase;

    @GetMapping
    public List<Room> getAllRooms() {
        return retrieveRoomUseCase.retrieve();
    }
}
