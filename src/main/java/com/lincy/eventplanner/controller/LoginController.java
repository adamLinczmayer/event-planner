package com.lincy.eventplanner.controller;

import com.lincy.eventplanner.model.users.User;
import com.lincy.eventplanner.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String renderLogin(@RequestParam(value = "incorrect", required = false) Boolean incorrect, Model model) {
        model.addAttribute("login", true);
        if (incorrect != null) {
            model.addAttribute("incorrect", incorrect);
        } else {
            model.addAttribute("incorrect", "false");
        }
        return "login";
    }

    @RequestMapping(value = "/user")
    public String user(Model model) {
        User user = userService.findUserById(1L);
        model.addAttribute("user", user);
        return "user";
    }


}
