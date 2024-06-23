package com.fk.upod.application.port.in.usecase;

import com.fk.upod.application.domain.Customer;

import java.util.List;

public interface RetrieveCustomerUseCase {

    List<Customer> retrieve();
    Customer retrieve(Long id);
}
