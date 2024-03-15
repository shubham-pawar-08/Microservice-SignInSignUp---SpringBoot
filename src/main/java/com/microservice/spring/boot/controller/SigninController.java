package com.microservice.spring.boot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import com.microservice.spring.boot.Models.User;
import com.microservice.spring.boot.repositories.UserRepository;

@Controller
public class SigninController {
    @Autowired
    private UserRepository userRepository;
    // this template helps to interact with SignUp service
    RestTemplate restTemplate = new RestTemplate();

    // Endpoint to check if the signin service is ready
    @GetMapping("/")
    public String check() {
        return "signin";
    }

    // Endpoint to check if the signin request
    @RequestMapping("/signin")
    public String signin(@RequestParam("userName") String userName,
            @RequestParam("password") String password,
            Model model) {
        try {
            // Retrieve users by username and password
            List<User> users = userRepository.findByUsername(userName);
            List<User> pass = userRepository.findByPassword(password);

            // Flag to indicate if username and password match
            boolean credentialsValid = false;

            // Check if username and password match for any user
            for (User user : users) {
                for (User passwordUser : pass) {
                    if (user.getPassword().equals(password) && passwordUser.getUsername().equals(userName)) {
                        credentialsValid = true;
                        break;
                    }
                }
            }

            // Check if username and password match for any user
            if (credentialsValid) {
                model.addAttribute("Username", userName);
                return "homePage";
            } else {
                // Validation failed, return with error message
                model.addAttribute("error", "Check your Credentials or Need to Sign Up");
                return "signin";
            }
        } catch (Exception e) {
            // Exception occurred during signin, handle gracefully
            model.addAttribute("error", "An error occurred during signin: " + e.getMessage());
            return "signin";
        }
    }

    // Endpoint to check if the signup service is ready
    @GetMapping("/signup")
    public String goToSignup() {
        return "signup";
    }

    // Endpoint to for signup request
    @RequestMapping("/signup-user")
    public String signupMicroservice(@RequestParam("userName") String userName,
            @RequestParam("password") String password,
            @RequestParam("password1") String password1,
            Model model) {
        // Retrieve users by username
        List<User> users = userRepository.findByUsername(userName);
        // Retrieve users by password
        List<User> pass = userRepository.findByPassword(password);

        // Flag to indicate if username and password match
        boolean credentialsValid = false;

        // Check if username and password match for any user
        for (User user : users) {
            for (User passwordUser : pass) {
                if (user.getPassword().equals(password) && passwordUser.getUsername().equals(userName)) {
                    credentialsValid = true;
                    break;
                }
            }
        }

        // If credentials already exist, return with error
        if (credentialsValid) {
            model.addAttribute("signupError", "User Already Exists");
        } else {
            // If passwords match, proceed with signup
            if (password.equals(password1)) {
                try {
                    // Make a call to the signup service
                    restTemplate.getForObject("http://localhost:8081/signup-user/" + userName + "/" + password,
                            String.class);
                    // If successful, show signup success message
                    model.addAttribute("signupSuccess", "Successfully Signed up !! <br> You can Sign In to Check !!");
                } catch (Exception e) {
                    // If an error occurs during signup service call, show an error message
                    model.addAttribute("signupError", "An error occurred while signing up: " + e.getMessage());
                }
            } else {
                // If passwords don't match, return with error
                model.addAttribute("signupError", "Recheck your password");
            }
        }

        return "signup";
    }

}