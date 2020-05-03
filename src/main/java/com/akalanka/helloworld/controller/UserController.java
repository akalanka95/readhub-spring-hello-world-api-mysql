package com.akalanka.helloworld.controller;

import com.akalanka.helloworld.model.User;
import com.akalanka.helloworld.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping()
    public ResponseEntity<?> createUser(@RequestBody User user) {
        User userCreate =   userRepository.save(user);
        return new ResponseEntity<User>(userCreate, HttpStatus.CREATED);
    }


}
