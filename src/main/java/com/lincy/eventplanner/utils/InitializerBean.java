package com.lincy.eventplanner.utils;

import com.lincy.eventplanner.model.users.User;
import com.lincy.eventplanner.services.UserService;
import org.springframework.stereotype.Component;
import java.text.ParseException;

@Component
public class InitializerBean {

    public InitializerBean(UserService userService) {
        User user = new User("Lincy", "lincy.adam@gmail.com", "Linczmayer Ádám");
        userService.saveUser(user);
    }
}
