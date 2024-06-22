package com.fk.upod.adapter.in.web;

import com.fk.upod.application.domain.Customer;
import com.fk.upod.application.port.in.usecase.CreateCustomerUseCase;
import com.fk.upod.application.port.in.usecase.RetrieveCustomerUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@AllArgsConstructor
public class CustomerController {

    private final RetrieveCustomerUseCase retrieveCustomerUseCase;
    private final CreateCustomerUseCase createCustomerUseCase;

    @GetMapping
    public List<Customer> retrieve() {
        return retrieveCustomerUseCase.retrieve();
    }

    @PostMapping
    public Customer create(@RequestBody Customer customer) {
        return createCustomerUseCase.create(customer);
    }
}
