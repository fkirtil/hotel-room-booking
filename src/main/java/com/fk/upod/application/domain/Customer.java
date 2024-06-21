package com.fk.upod.application.domain;

import lombok.Data;

@Data
public class Customer {

    Long id;
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
}
