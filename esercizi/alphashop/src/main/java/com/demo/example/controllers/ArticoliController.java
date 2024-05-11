package com.demo.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticoliController {
	
	@GetMapping(value = "/articoli")
	public String getArticoli() {
		return "articoli";
	}
	
}
