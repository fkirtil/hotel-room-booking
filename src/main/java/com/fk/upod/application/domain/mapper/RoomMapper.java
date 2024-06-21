package com.fk.upod.application.domain.mapper;

import com.fk.upod.adapter.out.persistence.entity.RoomEntity;
import com.fk.upod.application.domain.Room;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoomMapper {

    RoomMapper INSTANCE = Mappers.getMapper(RoomMapper.class);

    Room entityToDomain(RoomEntity roomEntity);

    RoomEntity domainToEntity(Room room);
}
