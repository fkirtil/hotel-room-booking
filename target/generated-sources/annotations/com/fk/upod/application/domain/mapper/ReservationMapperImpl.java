package com.fk.upod.application.domain.mapper;

import com.fk.upod.adapter.out.persistence.entity.CustomerEntity;
import com.fk.upod.adapter.out.persistence.entity.ReservationEntity;
import com.fk.upod.adapter.out.persistence.entity.RoomEntity;
import com.fk.upod.application.domain.Customer;
import com.fk.upod.application.domain.Reservation;
import com.fk.upod.application.domain.Room;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import javax.annotation.processing.Generated;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-21T16:55:17+0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
public class ReservationMapperImpl implements ReservationMapper {

    private final DatatypeFactory datatypeFactory;

    public ReservationMapperImpl() {
        try {
            datatypeFactory = DatatypeFactory.newInstance();
        }
        catch ( DatatypeConfigurationException ex ) {
            throw new RuntimeException( ex );
        }
    }

    @Override
    public Reservation entityToDomain(ReservationEntity reservationEntity) {
        if ( reservationEntity == null ) {
            return null;
        }

        Reservation reservation = new Reservation();

        reservation.setCheckInDate( xmlGregorianCalendarToLocalDateTime( localDateToXmlGregorianCalendar( reservationEntity.getCheckInDate() ) ) );
        reservation.setCheckOutDate( xmlGregorianCalendarToLocalDateTime( localDateToXmlGregorianCalendar( reservationEntity.getCheckOutDate() ) ) );
        reservation.setRoom( roomEntityToRoom( reservationEntity.getRoom() ) );
        reservation.setCustomer( customerEntityToCustomer( reservationEntity.getCustomer() ) );

        return reservation;
    }

    @Override
    public ReservationEntity domainToEntity(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        ReservationEntity reservationEntity = new ReservationEntity();

        reservationEntity.setCheckInDate( xmlGregorianCalendarToLocalDate( localDateTimeToXmlGregorianCalendar( reservation.getCheckInDate() ) ) );
        reservationEntity.setCheckOutDate( xmlGregorianCalendarToLocalDate( localDateTimeToXmlGregorianCalendar( reservation.getCheckOutDate() ) ) );
        reservationEntity.setRoom( roomToRoomEntity( reservation.getRoom() ) );
        reservationEntity.setCustomer( customerToCustomerEntity( reservation.getCustomer() ) );

        return reservationEntity;
    }

    private XMLGregorianCalendar localDateToXmlGregorianCalendar( LocalDate localDate ) {
        if ( localDate == null ) {
            return null;
        }

        return datatypeFactory.newXMLGregorianCalendarDate(
            localDate.getYear(),
            localDate.getMonthValue(),
            localDate.getDayOfMonth(),
            DatatypeConstants.FIELD_UNDEFINED );
    }

    private XMLGregorianCalendar localDateTimeToXmlGregorianCalendar( LocalDateTime localDateTime ) {
        if ( localDateTime == null ) {
            return null;
        }

        return datatypeFactory.newXMLGregorianCalendar(
            localDateTime.getYear(),
            localDateTime.getMonthValue(),
            localDateTime.getDayOfMonth(),
            localDateTime.getHour(),
            localDateTime.getMinute(),
            localDateTime.getSecond(),
            localDateTime.get( ChronoField.MILLI_OF_SECOND ),
            DatatypeConstants.FIELD_UNDEFINED );
    }

    private static LocalDate xmlGregorianCalendarToLocalDate( XMLGregorianCalendar xcal ) {
        if ( xcal == null ) {
            return null;
        }

        return LocalDate.of( xcal.getYear(), xcal.getMonth(), xcal.getDay() );
    }

    private static LocalDateTime xmlGregorianCalendarToLocalDateTime( XMLGregorianCalendar xcal ) {
        if ( xcal == null ) {
            return null;
        }

        if ( xcal.getYear() != DatatypeConstants.FIELD_UNDEFINED
            && xcal.getMonth() != DatatypeConstants.FIELD_UNDEFINED
            && xcal.getDay() != DatatypeConstants.FIELD_UNDEFINED
            && xcal.getHour() != DatatypeConstants.FIELD_UNDEFINED
            && xcal.getMinute() != DatatypeConstants.FIELD_UNDEFINED
        ) {
            if ( xcal.getSecond() != DatatypeConstants.FIELD_UNDEFINED
                && xcal.getMillisecond() != DatatypeConstants.FIELD_UNDEFINED ) {
                return LocalDateTime.of(
                    xcal.getYear(),
                    xcal.getMonth(),
                    xcal.getDay(),
                    xcal.getHour(),
                    xcal.getMinute(),
                    xcal.getSecond(),
                    Duration.ofMillis( xcal.getMillisecond() ).getNano()
                );
            }
            else if ( xcal.getSecond() != DatatypeConstants.FIELD_UNDEFINED ) {
                return LocalDateTime.of(
                    xcal.getYear(),
                    xcal.getMonth(),
                    xcal.getDay(),
                    xcal.getHour(),
                    xcal.getMinute(),
                    xcal.getSecond()
                );
            }
            else {
                return LocalDateTime.of(
                    xcal.getYear(),
                    xcal.getMonth(),
                    xcal.getDay(),
                    xcal.getHour(),
                    xcal.getMinute()
                );
            }
        }
        return null;
    }

    protected Room roomEntityToRoom(RoomEntity roomEntity) {
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

    protected Customer customerEntityToCustomer(CustomerEntity customerEntity) {
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

    protected RoomEntity roomToRoomEntity(Room room) {
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

    protected CustomerEntity customerToCustomerEntity(Customer customer) {
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
