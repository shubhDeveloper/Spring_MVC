package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/search")
	public String searchC() {
		
		return "/search";
		
	}
	
	@RequestMapping(path = "/searchH",method = RequestMethod.POST)
	public RedirectView searchH(@RequestParam("search") String search) {
		
		System.out.println(search);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://duckduckgo.com/?q="+ search);
		System.out.println("search h called");
		return redirectView;
	}

}
