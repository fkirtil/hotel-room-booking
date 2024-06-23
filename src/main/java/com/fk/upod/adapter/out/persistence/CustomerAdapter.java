package com.fk.upod.adapter.out.persistence;

import com.fk.upod.adapter.out.persistence.entity.CustomerEntity;
import com.fk.upod.adapter.out.persistence.repository.CustomerRepository;
import com.fk.upod.application.domain.Customer;
import com.fk.upod.application.domain.mapper.CustomerMapper;
import com.fk.upod.application.error.NotFoundException;
import com.fk.upod.application.port.out.persistence.CustomerReadOutPort;
import com.fk.upod.application.port.out.persistence.CustomerWriteOutPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CustomerAdapter implements CustomerReadOutPort, CustomerWriteOutPort {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper = CustomerMapper.INSTANCE;

    @Override
    public List<Customer> getAllCustomer() {
        List<CustomerEntity> customerEntities = customerRepository.findAllByCreatedAtDesc();
        return customerEntities.stream()
                .map(customerMapper::entityToDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Customer getCustomer(Long id) {
        return customerMapper.entityToDomain(customerRepository.findById(id)
                .orElseThrow(NotFoundException::new));
    }

    @Override
    public Customer create(Customer customer) {
        customerRepository.save(customerMapper.domainToEntity(customer));
        return customer;
    }
}
