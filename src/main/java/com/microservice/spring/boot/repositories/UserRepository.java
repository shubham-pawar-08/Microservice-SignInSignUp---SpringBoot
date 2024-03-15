package com.microservice.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.microservice.spring.boot.Models.User;
import java.util.List;


//@EnableJpaRepositories("com.microservice.Repository")
public interface UserRepository extends JpaRepository<User,Integer>{
       // Custom query to find a user by username with case sensitivity

    @Query("SELECT u FROM User u WHERE u.username = :username")
    User findByUsername(@Param("username") String username);
   
   // Custom query to find a user by password with case sensitivity
   @Query("SELECT u FROM User u WHERE u.password = :password")
    User findByPassword(@Param("password") String password);
    
}
