package com.springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.coyote.http2.Setting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView about() {
		System.out.println("About controller running");
		
		//creating ModelAndView object 
		ModelAndView modelAndView = new ModelAndView();
		
		//Setting the data 
		modelAndView.addObject("fname", "Rakesh");
		modelAndView.addObject("lname", "Nema");
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time",now);
	    
		//Added List
		List<String> student = new ArrayList<String>();
		student.add("rohan");
		student.add("lokesh");
		student.add("vihan");
		student.add("harry");
		student.add("vikas");
		
 		//Setting the list
		modelAndView.addObject("students", student);
		
		//Setting the view name
		modelAndView.setViewName("about");
		
		return modelAndView;
		
	}
	
	
	
	
}
