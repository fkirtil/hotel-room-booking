package com.fk.upod.application.service;

import com.fk.upod.application.domain.Reservation;
import com.fk.upod.application.port.in.usecase.CreateReservationUseCase;
import com.fk.upod.application.port.in.usecase.RetrieveReservationUseCase;
import com.fk.upod.application.port.in.usecase.UpdateReservationUseCase;
import com.fk.upod.application.port.out.persistence.ReservationReadOutPort;
import com.fk.upod.application.port.out.persistence.ReservationWriteOutPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService implements RetrieveReservationUseCase, CreateReservationUseCase, UpdateReservationUseCase {

    private final ReservationReadOutPort reservationReadOutPort;
    private final ReservationWriteOutPort reservationWriteOutPort;

    @Override
    public List<Reservation> retrieve() {
        return reservationReadOutPort.getAllReservations();
    }

    @Override
    public Long create(Reservation reservation) {
        return reservationWriteOutPort.create(reservation);
    }

    @Override
    public Reservation update(Long id, Reservation reservation) {
        return reservationWriteOutPort.update(id, reservation);
    }
}
