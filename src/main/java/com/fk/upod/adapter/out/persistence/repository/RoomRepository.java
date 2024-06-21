package com.fk.upod.adapter.out.persistence.repository;

import com.fk.upod.adapter.out.persistence.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<RoomEntity, Long> {
}
