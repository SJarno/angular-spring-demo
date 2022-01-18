package com.jarno.angulardemo.controllers;

import java.util.List;

import com.jarno.angulardemo.models.User;
import com.jarno.angulardemo.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "http://localhost:4200") // for dev
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }
    @PostMapping("/users")
    public void addUser(@RequestBody User user) {
        userRepository.save(user);
        
    }
    
    
}
