package com.fk.upod.application.port.in.usecase;

import com.fk.upod.application.domain.Customer;

public interface CreateCustomerUseCase {

    Customer create(Customer customer);
}
