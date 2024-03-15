package com.microservice.spring.boot.service;

import com.microservice.spring.boot.Models.User;
import com.microservice.spring.boot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class AuthenticationService {

    @Autowired
    private UserRepository userRepository;

    public String validateSignin(String username, String password, Model model) {
        User user = userRepository.findByUsername(username);
        
        if (user != null && user.getPassword().equals(password)) {
            model.addAttribute("Username", username);
            return "homePage";
        } else {
            // Validation failed
            model.addAttribute("error", "Check your Credentials or Need to Sign Up");
            return "signin"; 
        }
    }
}
