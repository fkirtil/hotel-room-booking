package com.fk.upod.application.domain.mapper;

import com.fk.upod.adapter.out.persistence.entity.ReservationEntity;
import com.fk.upod.application.domain.Reservation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReservationMapper {

    ReservationMapper INSTANCE = Mappers.getMapper(ReservationMapper.class);

    @Mapping(source = "room.id", target = "room.id")
    @Mapping(source = "customer.id", target = "customer.id")
    Reservation entityToDomain(ReservationEntity reservationEntity);

    ReservationEntity domainToEntity(Reservation reservation);
;}
