package com.demo.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	public final String saluti = "Salve, sono la tua prima applicazione web creata in Spring Boot 3";
	
	@GetMapping(value = "/")
	public String getWelcome(Model model) {
		model.addAttribute("intestazione", "Benvenuti nella root page della webapp Alphashop");
		model.addAttribute("saluti", saluti);
		return "index";
	}
	
	@GetMapping(value = "/index")
	public String getWelcome2(Model model) {
		model.addAttribute("intestazione", "Benvenuti nella index page della webapp Alphashop");
		model.addAttribute("saluti", saluti);
		return "index";
	}
}
