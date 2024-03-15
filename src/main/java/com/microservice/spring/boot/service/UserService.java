package com.microservice.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.spring.boot.Models.User;
import com.microservice.spring.boot.repositories.UserRepository;

@Service
public class UserService {
     @Autowired
    private UserRepository userRepository;

    public User getByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User getByPassword(String password)
    {
        return userRepository.findByPassword(password);
    }
}
