package com.session4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	@RequestMapping(value="/hola",method = RequestMethod.GET)
	public String hola(Model model) {
		
		model.addAttribute("title", "Hola Mundo");
		return "hola";
	}

}
