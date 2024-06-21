package com.fk.upod.adapter.in.web;

import com.fk.upod.application.domain.Reservation;
import com.fk.upod.application.port.in.usecase.RetrieveReservationUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
@AllArgsConstructor
public class ReservationController {

    private final RetrieveReservationUseCase retrieveReservationUseCase;

    @GetMapping
    public List<Reservation> retrieve() {
        return retrieveReservationUseCase.retrieve();
    }
}
