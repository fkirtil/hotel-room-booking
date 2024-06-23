package com.fk.upod.application.port.out.persistence;

import com.fk.upod.application.domain.Reservation;

import java.util.List;

public interface ReservationReadOutPort {
    List<Reservation> getAllReservations();

    List<Reservation> getReservation(Long id);
}
