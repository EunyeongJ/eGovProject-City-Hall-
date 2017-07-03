package com.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.service.Service;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	Service service;
	
	@RequestMapping(value = "/java")
	public String home(Model model) {
		System.out.println("컨트롤러");
		model.addAttribute("dual", service.connect());			
		return "home";
	}
	
}
