package com.fk.upod.adapter.out.persistence;

import com.fk.upod.adapter.out.persistence.entity.RoomEntity;
import com.fk.upod.adapter.out.persistence.repository.RoomRepository;
import com.fk.upod.application.domain.Room;
import com.fk.upod.application.domain.mapper.RoomMapper;
import com.fk.upod.application.port.out.persistence.RoomReadOutPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class RoomAdapter implements RoomReadOutPort {

    private final RoomRepository roomRepository;
    private final RoomMapper roomMapper = RoomMapper.INSTANCE;

    @Override
    public List<Room> getAllRooms() {
        List<RoomEntity> roomEntities = roomRepository.findAll();
        return roomEntities.stream()
                .map(roomMapper::entityToDomain)
                .collect(Collectors.toList());
    }
}
