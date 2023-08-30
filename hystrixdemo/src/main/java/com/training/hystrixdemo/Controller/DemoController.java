package com.training.hystrixdemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DemoController {

	@Autowired
	RestTemplate rest;
	
	@HystrixCommand(fallbackMethod = "myfallback", commandKey = "demokey")
	@GetMapping("/hello")
	public String greet() {
		return rest.getForObject("http://localhost:8085/home", String.class);
	}
	
	public String myfallback() {
		return "<h1>Sorry at present service is loadiing</h1>";
	}
}
