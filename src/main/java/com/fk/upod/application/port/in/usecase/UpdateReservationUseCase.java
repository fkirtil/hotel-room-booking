package com.fk.upod.application.port.in.usecase;

import com.fk.upod.application.domain.Reservation;

public interface UpdateReservationUseCase {

    Reservation update(Long id, Reservation reservation);
}
