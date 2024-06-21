package com.fk.upod.application.domain.mapper;

import com.fk.upod.adapter.out.persistence.entity.CustomerEntity;
import com.fk.upod.application.domain.Customer;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-21T16:57:22+0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public Customer entityToDomain(CustomerEntity customerEntity) {
        if ( customerEntity == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setFirstName( customerEntity.getFirstName() );
        customer.setLastName( customerEntity.getLastName() );
        customer.setEmail( customerEntity.getEmail() );
        customer.setPhoneNumber( customerEntity.getPhoneNumber() );

        return customer;
    }

    @Override
    public CustomerEntity domainToEntity(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerEntity customerEntity = new CustomerEntity();

        customerEntity.setFirstName( customer.getFirstName() );
        customerEntity.setLastName( customer.getLastName() );
        customerEntity.setEmail( customer.getEmail() );
        customerEntity.setPhoneNumber( customer.getPhoneNumber() );

        return customerEntity;
    }
}
