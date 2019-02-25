package com.novena.clinic.patientsManagementSystem.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.novena.clinic.patientsManagementSystem.Entities.StaffPatient;
import com.novena.clinic.patientsManagementSystem.Entities.StudentPatient;
import com.novena.clinic.patientsManagementSystem.Service.ServiceImpl.PatientServiceImpl;

@Controller
public class PatientsController {
	
	@Autowired
	private PatientServiceImpl patientServ;
	
	@RequestMapping(value="/createStudentPatient", method=RequestMethod.POST)
	public String addStudentPatient(
			@ModelAttribute("object") @Valid StudentPatient patient,BindingResult errors) {
		System.out.println("Patient Gotten "+ patient);
		 if(errors.hasErrors()){	 
			 return "registerpatient";
		 }
		patientServ.addPatient(patient);
		return "redirect:/";
	}

	@RequestMapping(value="/createStaffPatient", method=RequestMethod.POST)
	public String addStaffPatient(
			@ModelAttribute("object") @Valid StaffPatient patient,BindingResult errors) {
		if(errors.hasErrors()){
	         return"registerpatient";
	         }
		patientServ.addPatient(patient);
		return "redirect:/";
	}
}
