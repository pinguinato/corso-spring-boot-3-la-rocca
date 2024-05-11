package com.demo.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String getWelcome2(Model model, @RequestParam("name") String name) {
		model.addAttribute("intestazione", String.format("Benvenuto %s nella index page della webapp Alphashop", name));
		model.addAttribute("saluti", saluti);
		return "index";
	}
}
