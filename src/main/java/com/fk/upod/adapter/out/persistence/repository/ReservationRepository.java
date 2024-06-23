package com.fk.upod.adapter.out.persistence.repository;

import com.fk.upod.adapter.out.persistence.entity.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<ReservationEntity, Long> {

    List<ReservationEntity> findByCustomerId(Long id);
}
