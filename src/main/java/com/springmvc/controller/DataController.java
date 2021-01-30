package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataController {
	
	@RequestMapping("/form")
	public String formData() {
		
		System.out.println("New form control");
		return "/form";
	}
	
	/* 

//	Traditional way of fetching data
	
	@RequestMapping(path = "/handelForm",method = RequestMethod.POST)
	public String formHandel(HttpServletRequest request) {
		String parameter = request.getParameter("fname");
		System.out.println(parameter);
		return "";
	}
    
    */

	@RequestMapping(path = "handelForm" , method = RequestMethod.POST)
	public String handelForm(
			@RequestParam("fname") String fname,
			@RequestParam("lname") String lname,
			@RequestParam("email") String email,
			@RequestParam("city") String city,
			@RequestParam("password") String password,Model model ){

		//Add data in model and get in jsp
		model.addAttribute("fname",fname);
		model.addAttribute("lname",lname);
		model.addAttribute("email",email);
		model.addAttribute("city",city);
		model.addAttribute("password",password);
		
		//go to success page
		return "/success";
	}
	
}
