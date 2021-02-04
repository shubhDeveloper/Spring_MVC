package com.springmvc.complexform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.entity.Student;

@Controller
public class ComplexController {
	
	@RequestMapping("/cform")
	public String cFormC() {
		
		System.out.println("This is complex form");
		return "/complexForm";
		
	}
	@RequestMapping(path = "pcform",method = RequestMethod.POST)
	public String formHendler(@ModelAttribute("student") Student student)
	{
		System.out.println(student.getName());
		System.out.println(student.getId());
		System.out.println(student.getCity());
		System.out.println(student.getCources());
		System.out.println(student.getDate());
		System.out.println(student.getGender());
		System.out.println("process form");
		return "/good";
	}

}
