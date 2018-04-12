package com.lincy.eventplanner.controller;


import com.lincy.eventplanner.model.Event;
import com.lincy.eventplanner.model.users.User;
import com.lincy.eventplanner.services.EventService;
import com.lincy.eventplanner.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

@Controller
public class EventController {

    @Autowired
    UserService userService;

    @Autowired
    EventService eventService;

    @RequestMapping(value = "/")
    public String index(Model model) {
        return "add_event";
    }

    @PostMapping(value = "/save-event")
    public String saveEvent(@RequestParam Map<String, String> queryParameters) {
        System.out.println("Hello" + queryParameters);
        Event newEvent = new Event(queryParameters.get("event-name"), queryParameters.get("event-date"));
        eventService.saveEvent(newEvent);
        return "redirect:/";
    }

}
