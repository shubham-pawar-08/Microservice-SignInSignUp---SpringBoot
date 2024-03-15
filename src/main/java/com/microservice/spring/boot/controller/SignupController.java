package com.microservice.spring.boot.controller;

import org.springframework.web.bind.annotation.RestController;
import com.microservice.spring.boot.Models.User;
import com.microservice.spring.boot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class SignupController {
    
    @Autowired 
    private UserRepository userRepository;
    
    // Endpoint to check if the signup service is ready
    @GetMapping("/")
    public String checkSignupService() {
        return "SignUp Ready";
    }

    // Endpoint to handle user signup requests
    @RequestMapping("/signup-user/{userName}/{password}")
    public String signUpUser(@PathVariable("userName") String userName, @PathVariable("password") String password) {
        try {
            // Create a new User instance
            User user = new User();
            // Set username and password
            user.setUsername(userName);
            user.setPassword(password);
            // Save the user to the database
            userRepository.save(user);
            // Return success message
            return "SignUp Completed";
        } catch (Exception e) {
            // If an error occurs during signup
            return "An error occurred during signup: " + e.getMessage();
        }
    }
}
