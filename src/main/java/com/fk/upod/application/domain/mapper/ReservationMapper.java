package com.fk.upod.application.domain.mapper;

import com.fk.upod.adapter.out.persistence.entity.ReservationEntity;
import com.fk.upod.application.domain.Reservation;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReservationMapper {

    ReservationMapper INSTANCE = Mappers.getMapper(ReservationMapper.class);

    Reservation entityToDomain(ReservationEntity reservationEntity);

    ReservationEntity domainToEntity(Reservation reservation);
;}
