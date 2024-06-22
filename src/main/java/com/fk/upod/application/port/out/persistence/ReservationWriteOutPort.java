package com.fk.upod.application.port.out.persistence;

import com.fk.upod.application.domain.Reservation;

public interface ReservationWriteOutPort {

    Long create(Reservation reservation);
    Reservation update(Long id, Reservation reservation);
}
