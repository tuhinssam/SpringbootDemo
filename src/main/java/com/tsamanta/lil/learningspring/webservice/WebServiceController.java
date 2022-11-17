package com.tsamanta.lil.learningspring.webservice;

import com.tsamanta.lil.learningspring.model.Guest;
import com.tsamanta.lil.learningspring.model.Room;
import com.tsamanta.lil.learningspring.repository.RoomRepository;
import com.tsamanta.lil.learningspring.service.GuestService;
import com.tsamanta.lil.learningspring.service.ReservationService;
import com.tsamanta.lil.learningspring.service.RoomReservation;
import com.tsamanta.lil.learningspring.service.RoomService;
import com.tsamanta.lil.learningspring.util.DateUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class WebServiceController {
    private final DateUtils dateUtils;
    private final ReservationService reservationService;
    private final GuestService guestService;
    private final RoomService roomService;

    public WebServiceController(DateUtils dateUtils, ReservationService reservationService, GuestService guestService, RoomService roomService) {
        this.dateUtils = dateUtils;
        this.reservationService = reservationService;
        this.guestService = guestService;
        this.roomService = roomService;
    }

    @RequestMapping(path = "/reservations", method = RequestMethod.GET)
    public List<RoomReservation> getReservations(@RequestParam(value = "date", required = false) String dateString) {
        Date date = this.dateUtils.createDatefromDateString(dateString);
        return this.reservationService.getRoomReservationsForDate(date);
    }

    @RequestMapping(path = "/guests", method = RequestMethod.GET)
    public List<Guest> getGuests() {
        List<Guest> guests = this.guestService.GetAllGuests();
        return guests;
    }

    @RequestMapping(path = "/guests", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void addGuest(@RequestBody Guest guest) {
        List<Guest> guests = this.guestService.GetAllGuests();
        guests.add(guest);
    }

    @RequestMapping(path = "/rooms", method = RequestMethod.GET)
    public List<Room> grtRooms() {
        List<Room> rooms = this.roomService.getRooms();
        return rooms;
    }
}
