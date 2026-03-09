package com.demo_docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {
	
	 @GetMapping("/hello")
	    public String hello() {
	        return "Hello from Spring Boot Docker Demo!";
	    }
	
}
