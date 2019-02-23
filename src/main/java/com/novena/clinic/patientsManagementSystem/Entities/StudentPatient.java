package com.novena.clinic.patientsManagementSystem.Entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.novena.clinic.patientsManagementSystem.Entities.Enums.BloodGroup;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.Gender;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.Level;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.MaritalStatus;

@Entity
public class StudentPatient extends Patient {

	@Column(unique = true, nullable = false)
	@NotEmpty(message = "Matric Number Cannot be Empty")
	private String matricNumber;

	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	@NotNull(message = "Level cannot be empty")
	private Level level;

	@Column(nullable = false)
	private String faculty;
	

	@Embedded
	private CampusAddress campusAddress;
	
	public StudentPatient() {
	
	}


	public StudentPatient(String firstName, String middleName, String lastName, int phoneNumber, String email, Gender gender,
			LocalDate dateOfBirth, MaritalStatus maritalStatus, HomeAddress homeAdress,
			String stateOfOrigin, String lGAOfOrigin, String emergencyContact, String phoneNumberOfEmergencyContact,
			ContactAddress adressOfEmergencyContact, String relationshipToEmergencyContact, BloodGroup bloodgroup,
			com.novena.clinic.patientsManagementSystem.Entities.Enums.Genotype genotype, List<String> allergies,
			List<String> medicalConditions, String matricNumber, Level level, String department, String faculty,
			CampusAddress campusAddress) {
		super(firstName, middleName, lastName, phoneNumber, email, gender, dateOfBirth, maritalStatus, department,
				homeAdress, stateOfOrigin, lGAOfOrigin, emergencyContact, phoneNumberOfEmergencyContact,
				adressOfEmergencyContact, relationshipToEmergencyContact, bloodgroup, genotype, allergies,
				medicalConditions);
		this.matricNumber = matricNumber;
		this.level = level;
		this.faculty = faculty;
		this.campusAddress = campusAddress;
	}

	public String getMatricNumber() {
		return matricNumber;
	}

	public void setMatricNumber(String matricNumber) {
		this.matricNumber = matricNumber;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public CampusAddress getCampusAddress() {
		return campusAddress;
	}

	public void setCampusAddress(CampusAddress campusAddress) {
		this.campusAddress = campusAddress;
	}

	@Override
	public String toString() {
		return "StudentPatient [matricNumber=" + matricNumber + ", level=" + level + ", faculty=" + faculty
				+ ", campusAddress=" + campusAddress + super.toString() + "]";
	}

	
	
	
	
}
