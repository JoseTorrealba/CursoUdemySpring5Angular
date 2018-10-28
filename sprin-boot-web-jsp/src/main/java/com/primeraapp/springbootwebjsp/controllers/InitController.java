package com.primeraapp.springbootwebjsp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InitController {
	
	
	@GetMapping("/index")
	public String init(Model model) {
		
		model.addAttribute("titulo", "Hola Mundo");
		return "index";
	}

}
