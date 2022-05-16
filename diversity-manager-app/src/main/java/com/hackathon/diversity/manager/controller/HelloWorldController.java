package com.hackathon.diversity.manager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/hello")
    public String hello() {
    	return "Hello This is diversity dimensions application";
    }
}
