package com.microservice.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.microservice.spring.boot.Models.User;

public interface UserRepository extends JpaRepository<User,Integer>{
      
    
}
