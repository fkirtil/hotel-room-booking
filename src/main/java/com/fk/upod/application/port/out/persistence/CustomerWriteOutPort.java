package com.fk.upod.application.port.out.persistence;

import com.fk.upod.application.domain.Customer;

public interface CustomerWriteOutPort {

    Customer create(Customer customer);
}
