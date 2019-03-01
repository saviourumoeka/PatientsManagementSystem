package com.novena.clinic.patientsManagementSystem.Controller;

import java.util.Stack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.novena.clinic.patientsManagementSystem.Entities.HomeAddress;
import com.novena.clinic.patientsManagementSystem.Entities.StaffPatient;
import com.novena.clinic.patientsManagementSystem.Entities.StudentPatient;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.BloodGroup;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.Gender;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.Genotype;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.Level;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.MaritalStatus;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.StaffCategory;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.StaffType;

import javassist.expr.NewArray;
import net.bytebuddy.asm.Advice.Return;

@Controller
public class PageController {

	@RequestMapping("/")
	public String root(ModelMap model) {
		model.addAttribute("pageTitle", "Dashboard Home Page");
		model.addAttribute("breadcrumb", "Dashboard");
		model.addAttribute("breadcrumbItem", "Overview");
		return "index";
	}
	
	@RequestMapping("/login")
	public String login(ModelMap model) {
		model.addAttribute("pageTitle", "Staff login");
		return "login";
	}
	
	@RequestMapping("/registerPatient")
	public String registerPatient(ModelMap model,Model formModel) {
		
	CommonModels.studentModel(model);
	formModel.addAttribute("object",new StudentPatient());
		return "registerpatient";
	}
	
	@RequestMapping("/registerStaff")
	public String registerStaff(ModelMap model,Model formModel) {
		CommonModels.staffModel(model);
		formModel.addAttribute("object", new StaffPatient()); 
		return"registerpatient";
	}
	
	//@RequestMapping("/patientdetails")
	public String patientDetails(ModelMap model) {
		model.addAttribute("breadcrumb", "Patients");
		model.addAttribute("breadcrumbItem", "Patient Information");
		model.addAttribute("pageTitle", "Patient Detail");
	return "patientDetails";
	}
}
