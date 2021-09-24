package com.htc.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.user.dao.UserRegistrationInterface;
import com.htc.user.entity.UserRegistration;

@RestController
@RequestMapping("/api")

public class UserRegistrationController {
	@Autowired
	UserRegistrationInterface UserRegistrationInterface;
	
	@PostMapping("/adduser") 
	public UserRegistration createNewUser(@RequestBody UserRegistration UserRegistration) {
		   
		 return UserRegistrationInterface.save(UserRegistration);
		 
	}
	@GetMapping("/user/{id}") 
	public UserRegistration getUserByphoneno(@PathVariable String Id) {
		UserRegistration user =null;
	
		user=UserRegistrationInterface.findById(Id);
		return user;
	}
	
}


