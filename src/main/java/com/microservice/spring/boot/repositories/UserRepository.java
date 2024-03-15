package com.microservice.spring.boot.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.microservice.spring.boot.Models.User;

public interface UserRepository extends JpaRepository<User,Integer>{
    //Method to find username
    List<User> findByUsername(String username);
    
    //Method to find username
    List<User> findByPassword(String password);
    
}
