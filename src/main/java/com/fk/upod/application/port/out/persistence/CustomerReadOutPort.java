package com.fk.upod.application.port.out.persistence;

import com.fk.upod.application.domain.Customer;

import java.util.List;

public interface CustomerReadOutPort {

    List<Customer> getAllCustomer();
}
