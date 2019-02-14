package com.novena.clinic.patientsManagementSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.novena.clinic.patientsManagementSystem.Entities.Enums.Gender;

@Controller
public class PageController {

	@RequestMapping("/")
	public String root(ModelMap model) {
		model.addAttribute("pageTitle", "Dashboard Home Page");
		return "index";
	}
	
	@RequestMapping("/login")
	public String login(ModelMap model) {
		model.addAttribute("pageTitle", "Staff login");
		return "login";
	}
	
	@RequestMapping("/registerPatient")
	public String registerPatient(ModelMap model) {
		model.addAttribute("pageTitle", "Register Patient");
		model.addAttribute("genders", Gender.values());
		return "register";
	}

}
