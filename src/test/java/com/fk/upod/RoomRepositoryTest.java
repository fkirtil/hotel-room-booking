package com.fk.upod;

import com.fk.upod.adapter.out.persistence.entity.RoomEntity;
import com.fk.upod.adapter.out.persistence.repository.RoomRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

@DataJpaTest
public class RoomRepositoryTest {

    @Autowired
    private RoomRepository roomRepository;

    @Test
    public void testFindAll() {
        List<RoomEntity> roomEntities = roomRepository.findAll();
        assertFalse(roomEntities.isEmpty(), "Room entities list should not be empty");
    }
}
