package com.fk.upod.application.port.in.usecase;

import com.fk.upod.application.domain.Reservation;

public interface CreateReservationUseCase {

    Long create(Reservation reservation);
}
