package com.tsamanta.lil.learningspring.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Reservation")
public class Reservation {
//    RESERVATION_ID BIGSERIAL PRIMARY KEY,
//    ROOM_ID BIGINT NOT NULL,
//    GUEST_ID BIGINT NOT NULL,
//    RES_DATE DATE
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="RESERVATION_ID")
    private long id;

    @Column(name = "ROOM_ID")
    private long roomId;

    @Column(name = "GUEST_ID")
    private long guestId;

    @Column(name = "RES_DATE")
    private Date reservationDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }
}