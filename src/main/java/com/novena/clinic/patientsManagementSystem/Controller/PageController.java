package com.novena.clinic.patientsManagementSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.novena.clinic.patientsManagementSystem.Entities.Enums.BloodGroup;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.Gender;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.Genotype;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.Level;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.MaritalStatus;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.StaffCategory;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.StaffType;

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
		model.addAttribute("breadcrumb", "Register");
		model.addAttribute("breadcrumbItem", "Register Student");
		model.addAttribute("pageTitle", "Register Patient");
		model.addAttribute("genders", Gender.values());
		model.addAttribute("levels",Level.values());
		model.addAttribute("maritalStatus", MaritalStatus.values());
		model.addAttribute("bloodGroups", BloodGroup.values());
		model.addAttribute("genotypes", Genotype.values());
		model.addAttribute("student", true);
		model.addAttribute("link", "/clinic/registerStaff");
		model.addAttribute("forType", "Staff");
		return "registerpatient";
	}
	
	@RequestMapping("/registerStaff")
	public String registerStaff(ModelMap model) {
		model.addAttribute("pageTitle", "Register Patient");
		model.addAttribute("breadcrumb", "Register");
		model.addAttribute("breadcrumbItem", "Register Staff");
		model.addAttribute("types", StaffType.values());
		model.addAttribute("categories", StaffCategory.values());
		model.addAttribute("staff", true);
		model.addAttribute("link", "/clinic/registerPatient");
		model.addAttribute("forType", "Student");
		return"registerpatient";
	}
}
