package com.tsamanta.lil.learningspring.util;

import com.tsamanta.lil.learningspring.model.Guest;
import com.tsamanta.lil.learningspring.model.Reservation;
import com.tsamanta.lil.learningspring.model.Room;
import com.tsamanta.lil.learningspring.repository.GuestRepository;
import com.tsamanta.lil.learningspring.repository.ReservationRepository;
import com.tsamanta.lil.learningspring.repository.RoomRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {
    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;

    public AppStartupEvent(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        Iterable<Room> rooms = this.roomRepository.findAll();
        rooms.forEach(System.out::println);

        Iterable<Guest> guests = this.guestRepository.findAll();

        Iterable<Reservation> reservations = reservationRepository.findAll();
    }


}
