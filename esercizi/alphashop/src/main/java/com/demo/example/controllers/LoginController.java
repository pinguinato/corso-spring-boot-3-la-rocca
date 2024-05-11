package com.demo.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	private static final String saluti = "Benvenuto nella pagina di login della web app Alfashop";
	private static final String advertising = "Inserisci le specifiche di autenticazione";
	
	@GetMapping(value = "/login")
	public String getLoginPage(Model model) {
		model.addAttribute("intestazione", saluti);
		model.addAttribute("advertising", advertising);
		
		return "login";
	}
}
