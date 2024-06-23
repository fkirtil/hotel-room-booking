package com.fk.upod.adapter.in.web;

import com.fk.upod.adapter.out.persistence.repository.ReservationRepository;
import com.fk.upod.application.domain.Reservation;
import com.fk.upod.application.port.in.usecase.CreateReservationUseCase;
import com.fk.upod.application.port.in.usecase.RetrieveReservationUseCase;
import com.fk.upod.application.port.in.usecase.UpdateReservationUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
@AllArgsConstructor
public class ReservationController {

    private final RetrieveReservationUseCase retrieveReservationUseCase;
    private final CreateReservationUseCase createReservationUseCase;
    private final UpdateReservationUseCase updateReservationUseCase;
    private final ReservationRepository reservationRepository;

    @GetMapping
    public List<Reservation> retrieve() {
        return retrieveReservationUseCase.retrieve();
    }

    @GetMapping("/{id}")
    public List<Reservation> getReservationsByCustomerId(@PathVariable Long id) {
        return retrieveReservationUseCase.retrieve(id);
    }

    @PostMapping
    public Long create(@RequestBody Reservation reservation) {
        return createReservationUseCase.create(reservation);
    }

    @PutMapping("/{id}")
    public Reservation update(@PathVariable Long id, @RequestBody Reservation reservation) {
        return updateReservationUseCase.update(id, reservation);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        reservationRepository.deleteById(id);
    }
}
