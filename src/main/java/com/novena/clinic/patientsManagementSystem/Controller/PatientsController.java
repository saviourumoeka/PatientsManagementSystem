package com.novena.clinic.patientsManagementSystem.Controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.novena.clinic.patientsManagementSystem.Entities.StudentPatient;

@Controller
public class PatientsController {
	
	@RequestMapping(value="/createStudentPatient", method=RequestMethod.POST)
	public String addSfaffPatient(
			@ModelAttribute("studentPatient") @Valid StudentPatient patient) {
		System.out.println("Patient Gotten "+ patient);
		return "redirect:/index";
	}

}
