package com.fk.upod.adapter.out.persistence.entity;

import com.fk.upod.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;

@Entity
@Table(name = "customer")
@NoArgsConstructor
@Getter
@Setter
public class CustomerEntity extends BaseEntity {

    @Serial
    private static final long serialVersionUID = 4386598690844903633L;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;
}
