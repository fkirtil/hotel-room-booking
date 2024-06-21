package com.fk.upod.application.domain.mapper;

import com.fk.upod.adapter.out.persistence.entity.RoomEntity;
import com.fk.upod.application.domain.Room;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-21T16:55:17+0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
public class RoomMapperImpl implements RoomMapper {

    @Override
    public Room entityToDomain(RoomEntity roomEntity) {
        if ( roomEntity == null ) {
            return null;
        }

        Room room = new Room();

        room.setRoomNumber( roomEntity.getRoomNumber() );
        room.setCapacity( roomEntity.getCapacity() );
        room.setSeaView( roomEntity.isSeaView() );
        room.setJacuzzi( roomEntity.isJacuzzi() );
        room.setSafeBox( roomEntity.isSafeBox() );

        return room;
    }

    @Override
    public RoomEntity domainToEntity(Room room) {
        if ( room == null ) {
            return null;
        }

        RoomEntity roomEntity = new RoomEntity();

        roomEntity.setRoomNumber( room.getRoomNumber() );
        if ( room.getCapacity() != null ) {
            roomEntity.setCapacity( room.getCapacity() );
        }
        roomEntity.setSeaView( room.isSeaView() );
        roomEntity.setJacuzzi( room.isJacuzzi() );
        roomEntity.setSafeBox( room.isSafeBox() );

        return roomEntity;
    }
}
