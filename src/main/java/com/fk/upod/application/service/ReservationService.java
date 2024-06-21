package com.fk.upod.application.service;

import com.fk.upod.application.domain.Reservation;
import com.fk.upod.application.port.in.usecase.RetrieveReservationUseCase;
import com.fk.upod.application.port.out.persistence.ReservationReadOutPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService implements RetrieveReservationUseCase {

    private final ReservationReadOutPort reservationReadOutPort;

    @Override
    public List<Reservation> retrieve() {
        return reservationReadOutPort.getAllReservations();
    }
}
