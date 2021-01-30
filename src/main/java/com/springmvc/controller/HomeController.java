package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//Sending data using model
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("home controller running");
		model.addAttribute("name","Shubham Panchal");
		List<String> friends = new ArrayList<String>();
		friends.add("drashti");
		friends.add("larry");
		friends.add("janie");
		
		model.addAttribute("f",friends);
		
		return "index";	
	}

	
	@RequestMapping("/about")
	public String about() {
		System.out.println("About controller running");
		return "about";
		
	}
}
