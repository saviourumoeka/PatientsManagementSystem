package com.novena.clinic.patientsManagementSystem.Controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import com.novena.clinic.patientsManagementSystem.Entities.StudentPatient;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.BloodGroup;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.Gender;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.Genotype;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.Level;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.MaritalStatus;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.StaffCategory;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.StaffType;

@Component
public abstract class CommonModels {

	
	public static void studentModel(ModelMap model) {
		model.addAttribute("breadcrumb", "Register");
		model.addAttribute("breadcrumbItem", "Register Student");
		model.addAttribute("pageTitle", "Register Patient");
		model.addAttribute("genders", Gender.values());
		model.addAttribute("levels",Level.values());
		model.addAttribute("maritalStatus", MaritalStatus.values());
		model.addAttribute("bloodGroups", BloodGroup.values());
		model.addAttribute("genotypes", Genotype.values());
		model.addAttribute("student", true);
		model.addAttribute("link", "registerStaff");
		model.addAttribute("forType", "Staff");
	}
	
	public static void staffModel(ModelMap model) {
		model.addAttribute("pageTitle", "Register Patient");
		model.addAttribute("breadcrumb", "Register");
		model.addAttribute("breadcrumbItem", "Register Staff");
		model.addAttribute("types", StaffType.values());
		model.addAttribute("categories", StaffCategory.values());
		model.addAttribute("staff", true);
		model.addAttribute("link", "registerPatient");
		model.addAttribute("forType", "Student");
		model.addAttribute("bloodGroups", BloodGroup.values());
		model.addAttribute("maritalStatus", MaritalStatus.values());
		model.addAttribute("genders", Gender.values());
		model.addAttribute("genotypes", Genotype.values());
	}
}
