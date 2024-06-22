package com.fk.upod.adapter.out.persistence;

import com.fk.upod.adapter.out.persistence.entity.ReservationEntity;
import com.fk.upod.adapter.out.persistence.entity.RoomEntity;
import com.fk.upod.adapter.out.persistence.repository.ReservationRepository;
import com.fk.upod.application.domain.Reservation;
import com.fk.upod.application.domain.mapper.ReservationMapper;
import com.fk.upod.application.error.NotFoundException;
import com.fk.upod.application.port.out.persistence.ReservationReadOutPort;
import com.fk.upod.application.port.out.persistence.ReservationWriteOutPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ReservationAdapter implements ReservationReadOutPort, ReservationWriteOutPort {

    private final ReservationRepository reservationRepository;
    private final ReservationMapper reservationMapper = ReservationMapper.INSTANCE;

    @Override
    public List<Reservation> getAllReservations() {
        List<ReservationEntity> reservationEntities = reservationRepository.findAll();
        return reservationEntities.stream()
                .map(reservationMapper::entityToDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Long create(Reservation reservation) {
        ReservationEntity reservationEntity = reservationMapper.domainToEntity(reservation);
        reservationRepository.save(reservationEntity);
        return reservationEntity.getId();
    }

    @Override
    public Reservation update(Long id, Reservation reservation) {
        if (!reservationRepository.existsById(reservation.getId())) {
            throw new NotFoundException("Reservation with id " + reservation.getId() + " not found");
        }

        ReservationEntity reservationEntity = reservationMapper.domainToEntity(reservation);
        return reservationMapper.entityToDomain(reservationRepository.save(reservationEntity));
    }
}
