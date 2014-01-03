package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class HomeController {
	@RequestMapping("/welcome")
	public String printWelcome(ModelMap model) {
 System.out.println("inside contoller class");
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";
 
	}
}
