package com.fk.upod.adapter.out.persistence.entity;

import com.fk.upod.common.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;

@Entity
@Table(name = "room")
@NoArgsConstructor
@Getter
@Setter
public class RoomEntity extends BaseEntity {

    @Serial
    private static final long serialVersionUID = 1417294479972099471L;

    @Column(name = "room_number")
    private String roomNumber;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "text")
    private String text;

    @Column(name = "price")
    private String price;

    @Column(name = "sea_view")
    private boolean seaView;

    @Column(name = "jacuzzi")
    private boolean jacuzzi;

    @Column(name = "safe_box")
    private boolean safeBox;
}
