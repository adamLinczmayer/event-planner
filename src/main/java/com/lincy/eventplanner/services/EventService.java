package com.lincy.eventplanner.services;

import com.lincy.eventplanner.model.Event;
import com.lincy.eventplanner.model.users.User;
import com.lincy.eventplanner.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    EventRepository eventRepository;

    public void saveEvent(Event event) { eventRepository.save(event); }

    public Event findEventById(Long id) {
        return eventRepository.findOne(id);
    }

    public List<Event> findAllUsers() {
        return eventRepository.findAll();
    }

    public Event findByName(String name) {
        return eventRepository.findEventByEventName(name);
    }
}
