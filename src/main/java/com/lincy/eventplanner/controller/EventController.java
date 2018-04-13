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

    @RequestMapping(value = "/events")
    public String events(Model model) {
        Event events = eventService.findEventById(1L);
        model.addAttribute("events", events);
        return "events";
    }
}
