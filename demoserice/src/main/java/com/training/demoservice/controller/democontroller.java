package com.training.demoservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class democontroller {
	
	@RequestMapping("/greet")
	public String greet() {
		return "hello";
	}
	

}
