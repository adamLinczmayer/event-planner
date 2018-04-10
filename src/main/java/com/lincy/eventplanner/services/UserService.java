package com.lincy.eventplanner.services;

import com.lincy.eventplanner.model.users.User;
import com.lincy.eventplanner.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void saveUser(User user) { userRepository.save(user); }

    public User findUserById(Long id) {
        return userRepository.findOne(id);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public User findByName(String name) {
        return userRepository.findUserByUserName(name);
    }
}
