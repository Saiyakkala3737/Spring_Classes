package com.training.basicauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.basicauth.UserRepository;
import com.training.basicauth.dao.Userdetails;

@RestController
public class UserController {

	@Autowired
	UserRepository repo;
	
	@Autowired
	PasswordEncoder encoder;
	
	@PostMapping("/signin")
	public Userdetails save(@RequestBody Userdetails u) {
		u.setPassword(encoder.encode(u.getPassword()));
		return repo.save(u);
	}
}
