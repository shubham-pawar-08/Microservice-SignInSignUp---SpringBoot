package com.microservice.spring.boot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.microservice.spring.boot.Models.User;
import com.microservice.spring.boot.repositories.UserRepository;
import com.microservice.spring.boot.service.AuthenticationService;
import com.microservice.spring.boot.service.UserService;

//import com.microservice.Services.impl.UserServiceImpl;

@Controller
public class SigninController {
    @Autowired private  UserService userRepository;


    @GetMapping("/")
    public String check(){
        return "signin";
    }

/*
    @PostMapping("/signin")
    public String  addUser(@RequestParam("username") String username, @RequestParam("password") String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userRepository.save(user);
                return "homePage";
    } */
    
    /*@PostMapping("/signin")
    public String signInHomePage(@RequestParam("username") String userName,@RequestParam("password") String password,Model model)
    {
       User user=null;
       User pass=null;
       user= userRepository.getByUsername(userName);
       pass = userRepository.getByPassword(password);
        // user check
        if (user!= null) {
            // password check 
            if(pass!=null){
            model.addAttribute("Username", userName);
         // Redirect to the home page
            return "homePage";

        }
    }
         else {
            // Handle case where user could not be added to the database
          model.addAttribute("error", "User Need to Sign Up");
            return "signin";
        }
        return "signin";
    }
    */
    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/signin")
    public String signin(@RequestParam("username") String username, 
                        @RequestParam("password") String password,
                        Model model) {
        String nextPage = authenticationService.validateSignin(username, password, model);
        return nextPage;
    }
    @GetMapping("/signup")
    public String goToSignup()
    {
    return "signup";
    }

    @PostMapping("/signup-user")
    public String signupMicroservice(){

    
        return "signup";
    }
}
