package com.fk.upod.application.service;

import com.fk.upod.application.domain.Customer;
import com.fk.upod.application.domain.Room;
import com.fk.upod.application.port.in.usecase.RetrieveCustomerUseCase;
import com.fk.upod.application.port.in.usecase.RetrieveRoomUseCase;
import com.fk.upod.application.port.out.persistence.CustomerReadOutPort;
import com.fk.upod.application.port.out.persistence.RoomReadOutPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService implements RetrieveCustomerUseCase {

    private final CustomerReadOutPort customerReadOutPort;

    @Override
    public List<Customer> retrieve() {
        return customerReadOutPort.getAllCustomer();
    }
}
