package com.tsamanta.lil.learningspring.service;

import com.tsamanta.lil.learningspring.model.Guest;
import com.tsamanta.lil.learningspring.repository.GuestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {
    GuestRepository guestRepository;

    public GuestService(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    public List<Guest> GetAllGuests() {
       return guestRepository.findAll();
    }

}
