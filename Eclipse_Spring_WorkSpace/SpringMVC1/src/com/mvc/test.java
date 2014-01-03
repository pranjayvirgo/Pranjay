package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class test {
	@RequestMapping("/test")
	public String printWelcome(ModelMap model) {
 System.out.println("inside contoller class");
		model.addAttribute("test", "Spring 3 MVC test");
		return "test";
 
	}
}
