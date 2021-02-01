package com.springmvc.controller;
/*

Redirecting in spring mvc :- use to redirect one controller to another controller

0) HttpServletResponce

1) redirect prefix
2) Redirect view

*/


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

	@RequestMapping("/first")
	public String one() {
		
		System.out.println("This is one controller redirect in three");
//		return "/three"; //This search jsp page with name three 
		return "redirect:/three";
	}
	
	@RequestMapping("/three")
//	public RedirectView three() 
	public String three() 
	{
		
//		RedirectView redirectView = new RedirectView();
		System.out.println("this is three controller using redirect view");
//		redirectView.setUrl("four"); //redirect four controller
//		redirectView.setUrl("https://github.com/shubhDeveloper?tab=repositories"); //we can redirect any web page using this
//		return redirectView; //Here same error occure : did not find four.jsp
		System.out.println("three controller");
		return "redirect:/four";
	}
	
	
	@RequestMapping("/four")
	public String lastController() {
		
		System.out.println("This is handel four request");
		return "redirect:/formCtr";  // call DataController /form url
		
	}
	
	
	
}
