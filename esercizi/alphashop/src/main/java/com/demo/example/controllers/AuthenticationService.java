package com.demo.example.controllers;

import org.springframework.stereotype.Component;

@Component
public class AuthenticationService {
	
	public boolean auth(String username, String password) {
		boolean isValidUsername = username.equalsIgnoreCase("Roberto");
		boolean isValidPassword = password.equalsIgnoreCase("1234");
		
		return isValidUsername && isValidPassword;
	}
}
