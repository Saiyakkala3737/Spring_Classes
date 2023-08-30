package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.model.*;

@Controller
public class InformationController {

	@RequestMapping("/regForm")
	public String regform(Model model) {
		Person p = new Person();
		model.addAttribute("Person", p);
		return "personalInfo";
	}

	@RequestMapping("/addPerson")
	public String addPerson(@ModelAttribute("Person") Person p, Model model, HttpServletRequest request) {
		System.out.println("InformationController : addPerson fname : "+p.getfName());
		Contact c= new Contact();
		model.addAttribute("Contact",c);
		System.out.println("InformationController : addPerson :25 line");
		return "contactInfo";
	}
	
	@RequestMapping("/addContact")
	public String addContact(@ModelAttribute("Contact") Contact c, Model model, HttpServletRequest request) {
		System.out.println("InformationController : addContact: 1st line");
		Bank b = new Bank();
		model.addAttribute("Bank",b);
		System.out.println("InformationController : addContact: 33 line");
		return "bankInfo";
		
	}
	@RequestMapping("/addBank")
	 public String addBank(@ModelAttribute("Bank") Bank b , HttpServletRequest request) {
		
		return "success";
		
	}

}
