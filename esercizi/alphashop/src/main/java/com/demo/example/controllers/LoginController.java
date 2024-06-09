package com.demo.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	private final AuthenticationService authenticationService;
	
	private static final String saluti = "Benvenuto nella pagina di login della web app Alfashop";
	private static final String advertising = "Inserisci le specifiche di autenticazione";
	private static final String titolo = "Accesso & autenticazione";
	private static final String sottotitolo = "Procedi ad inserire lo userid e la password";	
	private static final String errmsg = "Spiacente, la userid e la password sono errati";
	
	public LoginController(AuthenticationService authenticationService) {
		this.authenticationService = authenticationService;
	}

	
	
	@GetMapping(value = "/login")
	public String getLoginPage(Model model) {
		model.addAttribute("intestazione", saluti);
		model.addAttribute("advertising", advertising);
		model.addAttribute("titolo", titolo);
		model.addAttribute("sottotitolo", sottotitolo);
		model.addAttribute("errmsg", errmsg);
		
		return "login";
	}
	
	
	@PostMapping(value = "/login")
	public String goToWelcomePage(
			@RequestParam("name") String name, 
			@RequestParam("password") String password, 
			ModelMap model
			) 
	{
		if (authenticationService.auth(name, password)) {
			model.put("name", name);
			return "welcome";
		}
		else return "redirect:/login?error=nologged";
	}
}
