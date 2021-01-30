package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.entity.User;

@Controller
public class DataController {

	@RequestMapping("/form")
	public String formData() {

		System.out.println("New form control");
		return "/form";
	}

	/*
	 * 
	 * // Traditional way of fetching data
	 * 
	 * @RequestMapping(path = "/handelForm",method = RequestMethod.POST) public
	 * String formHandel(HttpServletRequest request) { String parameter =
	 * request.getParameter("fname"); System.out.println(parameter); return ""; }
	 * 
	 */

	// This is very difficult way
	/*
	 * @RequestMapping(path = "handelForm" , method = RequestMethod.POST) public
	 * String handelForm(
	 * 
	 * @RequestParam("fname") String fname,
	 * 
	 * @RequestParam("lname") String lname,
	 * 
	 * @RequestParam("email") String email,
	 * 
	 * @RequestParam("city") String city,
	 * 
	 * @RequestParam("password") String password,Model model ){
	 * 
	 * User user = new User(); user.setFname(fname); user.setLname(lname);
	 * user.setEmail(email); user.setCity(city); user.setPassword(password) ;
	 * 
	 * System.out.println(user);
	 * 
	 * //Add data in model and get in jsp // model.addAttribute("fname",user); //
	 * model.addAttribute("lname",lname); // model.addAttribute("email",email); //
	 * model.addAttribute("city",city); // model.addAttribute("password",password);
	 * 
	 * model.addAttribute("user",user);
	 * 
	 * //go to success page return "/success"; }
	 * 
	 */

	// Use of model attribute common method for all controllers
	@ModelAttribute
	public void common(Model model) {
		model.addAttribute("hader", "SpringWithShubh");
	}

	// Using Model Attribute
	@RequestMapping(path = "handelForm", method = RequestMethod.POST)
	public String handelForm(@ModelAttribute User user, Model model) {

		System.out.println(user.getFname());
		// go to success page
		return "/success";
	}

}
