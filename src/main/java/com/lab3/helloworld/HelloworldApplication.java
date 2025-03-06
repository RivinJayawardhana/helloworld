package com.lab3.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}
	@GetMapping("/greet/{name}")
    public String hello(  @PathVariable String name,
	@RequestParam(value = "message", defaultValue = "Welcome to Spring Boot!") String message) {
      return String.format("Hello %s! %s", name,message);
    }
}



