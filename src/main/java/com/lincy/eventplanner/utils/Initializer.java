package com.lincy.eventplanner.utils;

import com.lincy.eventplanner.model.Event;
import com.lincy.eventplanner.model.users.User;
import com.lincy.eventplanner.services.UserService;
import org.springframework.stereotype.Component;
import java.text.ParseException;

@Component
public class Initializer {

    public Initializer(UserService userService) {
        User user = new User("Lincy", "lincy.adam@gmail.com", "Linczmayer Ádám");
        userService.saveUser(user);

    }
}
