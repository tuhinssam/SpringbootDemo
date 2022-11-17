package com.tsamanta.lil.learningspring.controller;

import com.tsamanta.lil.learningspring.model.Guest;
import com.tsamanta.lil.learningspring.service.GuestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/guests")
public class GuestController {

    GuestService guestService;

    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getAllGuests(Model model){
        List<Guest> guests = this.guestService.GetAllGuests();
        model.addAttribute("guestList", guests);
        return "guestlist";
    }

}
