package com.fk.upod.application.port.in.usecase;

import com.fk.upod.application.domain.Reservation;

import java.util.List;

public interface RetrieveReservationUseCase {
    List<Reservation> retrieve();
    List<Reservation> retrieve(Long id);
}
