package com.novena.clinic.patientsManagementSystem.Entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.novena.clinic.patientsManagementSystem.Entities.Enums.BloodGroup;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.Gender;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.MaritalStatus;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.StaffCategory;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.StaffType;

@Entity
public class StaffPatient extends Patient {
	@Column(nullable = false)
	private String staffNumber;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private StaffType staffType;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private StaffCategory staffCategory;
	
	private String rank;
	@Column(nullable = false)
	private String officeBlock;
	
	

	public StaffPatient() {
		super();
	}

	public StaffPatient(String firstName, String middleName, String lastName, String phoneNumber, String email, Gender gender,
			LocalDate dateOfBirth, MaritalStatus maritalStatus, String deparment, HomeAddress homeAdress,
			String stateOfOrigin, String lGAOfOrigin, String emergencyContact, String phoneNumberOfEmergencyContact,
			ContactAddress adressOfEmergencyContact, String relationshipToEmergencyContact, BloodGroup bloodgroup,
			com.novena.clinic.patientsManagementSystem.Entities.Enums.Genotype genotype, List<String> allergies,
			List<String> medicalConditions, String staffNumber, StaffType staffType, StaffCategory staffCategory,
			String rank, String officeBlock) {
		super(firstName, middleName, lastName, phoneNumber, email, gender, dateOfBirth, maritalStatus, deparment,
				homeAdress, stateOfOrigin, lGAOfOrigin, emergencyContact, phoneNumberOfEmergencyContact,
				adressOfEmergencyContact, relationshipToEmergencyContact, bloodgroup, genotype, allergies,
				medicalConditions);
		this.staffNumber = staffNumber;
		this.staffType = staffType;
		this.staffCategory = staffCategory;
		this.rank = rank;
		this.officeBlock = officeBlock;
	}

	public String getStaffNumber() {
		return staffNumber;
	}

	public void setStaffNumber(String staffNumber) {
		this.staffNumber = staffNumber;
	}

	public StaffType getStaffType() {
		return staffType;
	}

	public void setStaffType(StaffType staffType) {
		this.staffType = staffType;
	}

	public StaffCategory getStaffCategory() {
		return staffCategory;
	}

	public void setStaffCategory(StaffCategory staffCategory) {
		this.staffCategory = staffCategory;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getOfficeBlock() {
		return officeBlock;
	}

	public void setOfficeBlock(String officeBlock) {
		this.officeBlock = officeBlock;
	}

	@Override
	public String toString() {
		return "StaffPatient [staffNumber=" + staffNumber + ", staffType=" + staffType + ", staffCategory="
				+ staffCategory + ", rank=" + rank + ", officeBlock=" + officeBlock + ", toString()=" + super.toString()
				+ "]";
	}

	
	
	

}
