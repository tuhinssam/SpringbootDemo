package com.tsamanta.lil.learningspring.service;

import com.tsamanta.lil.learningspring.model.Guest;
import com.tsamanta.lil.learningspring.repository.GuestRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GuestService {
    GuestRepository guestRepository;

    public GuestService(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    public List<Guest> GetAllGuests() {
       List<Guest> guestList = guestRepository.findAll();
       return guestList.stream().sorted((g1,g2)->g1.getLastName().compareTo(g2.getLastName()))/*sort based on last name*/.collect(Collectors.toList());
    }

}
