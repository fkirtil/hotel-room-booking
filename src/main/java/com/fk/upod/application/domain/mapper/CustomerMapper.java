package com.fk.upod.application.domain.mapper;

import com.fk.upod.adapter.out.persistence.entity.CustomerEntity;
import com.fk.upod.application.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    @Mapping(source = "id", target = "id")
    Customer entityToDomain(CustomerEntity customerEntity);

    //@Mapping(source = "id", target = "id")
    CustomerEntity domainToEntity(Customer customer);
}
