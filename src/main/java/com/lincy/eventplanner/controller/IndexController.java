package com.lincy.eventplanner.controller;

import com.lincy.eventplanner.model.users.User;
import com.lincy.eventplanner.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/")
    public String index(Model model) {
        User user = userService.findUserById(1L);
        model.addAttribute("user", user);
        return "index";
    }
}
