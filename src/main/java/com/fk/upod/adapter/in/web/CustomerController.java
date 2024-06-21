package com.fk.upod.adapter.in.web;

import com.fk.upod.application.domain.Customer;
import com.fk.upod.application.domain.Room;
import com.fk.upod.application.port.in.usecase.RetrieveCustomerUseCase;
import com.fk.upod.application.port.in.usecase.RetrieveRoomUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@AllArgsConstructor
public class CustomerController {

    private final RetrieveCustomerUseCase retrieveCustomerUseCase;

    @GetMapping
    public List<Customer> retrieve() {
        return retrieveCustomerUseCase.retrieve();
    }
}
