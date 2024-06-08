package com.demo.example.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.example.entities.Articoli;
import com.demo.example.services.ArticoliService;

@Controller
public class ArticoliController {
	
	@Autowired
	private ArticoliService articoliService;

	
	@GetMapping(value = "/articoli")
	public String getArticoli(ModelMap modelMap) {
		
		List<Articoli> articoli = articoliService.selAll();
		modelMap.addAttribute("articoli", articoli);
		
		return "articoli"; 
	}
}
