package com.fk.upod.application.service;

import com.fk.upod.application.domain.Customer;
import com.fk.upod.application.port.in.usecase.CreateCustomerUseCase;
import com.fk.upod.application.port.in.usecase.RetrieveCustomerUseCase;
import com.fk.upod.application.port.out.persistence.CustomerReadOutPort;
import com.fk.upod.application.port.out.persistence.CustomerWriteOutPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService implements RetrieveCustomerUseCase, CreateCustomerUseCase {

    private final CustomerReadOutPort customerReadOutPort;
    private final CustomerWriteOutPort customerWriteOutPort;

    @Override
    public List<Customer> retrieve() {
        return customerReadOutPort.getAllCustomer();
    }

    @Override
    public Customer create(Customer customer) {
        return customerWriteOutPort.create(customer);
    }
}
