package com.microservice.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.microservice")
//@ComponentScan("com.microservice.Controller")

public class SignInServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SignInServiceApplication.class, args);
	}

}
