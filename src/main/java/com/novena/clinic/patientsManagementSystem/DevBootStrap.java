package com.novena.clinic.patientsManagementSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.novena.clinic.patientsManagementSystem.Entities.CampusAddress;
import com.novena.clinic.patientsManagementSystem.Entities.ClinicalReport;
import com.novena.clinic.patientsManagementSystem.Entities.ContactAddress;
import com.novena.clinic.patientsManagementSystem.Entities.HomeAddress;
import com.novena.clinic.patientsManagementSystem.Entities.Patient;
import com.novena.clinic.patientsManagementSystem.Entities.StaffPatient;
import com.novena.clinic.patientsManagementSystem.Entities.StudentPatient;
import com.novena.clinic.patientsManagementSystem.Entities.VitalScience;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.BloodGroup;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.Gender;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.Genotype;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.Level;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.MaritalStatus;
import com.novena.clinic.patientsManagementSystem.Repository.ClinicalReportRepository;
import com.novena.clinic.patientsManagementSystem.Repository.PatientRepository;
import com.novena.clinic.patientsManagementSystem.Repository.VitalScienceRepository;

@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private PatientRepository patientRepo;
	
	@Autowired
	private ClinicalReportRepository ReportRepo;
	
	@Autowired
	private VitalScienceRepository VitalsRepo;
	
	private void addPatient() {
		CampusAddress campusAddress=new CampusAddress();
		campusAddress.setRoomNumber(001);
		campusAddress.setHallName("hall 1");
		List<String> allergies = new ArrayList<>();
		allergies.add("Gallic");
		allergies.add("Wine");
		LocalDate date =LocalDate.now();
		HomeAddress homeAdress = new HomeAddress();
		homeAdress.setHouseNumber(001);
		homeAdress.setStreetName("No Where");
		homeAdress.setAddressCity("C city");
		homeAdress.setAddressState("C state");
		
		ContactAddress contact = new ContactAddress();
		contact.setHouseNumber(001);
		contact.setStreetName("No Where");
		contact.setAddressCity("C city");
		contact.setAddressState("C state");
		
		StudentPatient one = new StudentPatient();
		one.setFirstName("John");
		one.setMiddleName("None");
		one.setLastName("Doe");
		one.setMatricNumber("nov/csc/001");
		one.setLevel(Level._300);
		one.setDeparment("CSC");
		one.setFaculty("Physical Science");
		one.setCampusAddress(campusAddress);
		one.setAdressOfEmergencyContact(contact);
		one.setAllergies(allergies);
		one.setBloodgroup(BloodGroup.B_NEGATIVE);
		one.setDateOfBirth(date);
		one.setEmail("JohnDoe@gmail.com");
		one.setEmergencyContact("Me");
		one.setGender(Gender.MALE);
		one.setGenotype(Genotype.AA);
		one.setHomeAdress(homeAdress);
		one.setLGAOfOrigin("LGA");
		one.setMaritalStatus(MaritalStatus.SINGLE);
		one.setPhoneNumber(9);
		one.setPhoneNumberOfEmergencyContact("8");
		one.setRelationshipToEmergencyContact("Nigga");
		one.setStateOfOrigin("C State");
	
		//StaffPatient two = new StaffPatient();
		//two.set
		patientRepo.save(one);
		
		VitalScience vitals = new VitalScience();
		vitals.setPluseRate(86);
		vitals.setTemperture(50.2);
		vitals.setWeight(86.5);
		VitalsRepo.save(vitals);
		
		
		ClinicalReport report = new ClinicalReport();
		report.setComplain("Sick");
		report.setDiagnostic("nigga Sick");
		report.setSymtoms("Nigga looking Sick");
		report.setPatient(one);
		report.setVaitalScience(vitals);
		
		ReportRepo.save(report);
		
		System.out.println("Patient " + one);
		System.out.println("Vitals "+ vitals);
		System.out.println("Report "+ report);
		
	}
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		addPatient();
		
	}
	

}
