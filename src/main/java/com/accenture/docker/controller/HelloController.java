package com.accenture.docker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@GetMapping("")
	public String sayHello() {
		return "hello";
	}
	
	@GetMapping("/name")
	public String displayName(Model model,@RequestParam("textName") String name) {
		model.addAttribute("name","Hello "+name);
		return "hello";
	}
}
