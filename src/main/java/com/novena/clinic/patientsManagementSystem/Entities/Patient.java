package com.novena.clinic.patientsManagementSystem.Entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.novena.clinic.patientsManagementSystem.Entities.Enums.BloodGroup;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.Gender;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.MaritalStatus;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.Genotype;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Patient extends AuditModel {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Integer id;

	private String firstName;

	private String middleName;

	private String lastName;

	@Column(unique = true, nullable = false)
	private int phoneNumber;

	@Column(unique = true, nullable = false)
	private String email;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;

	//@NotNull
	//@NotEmpty(message = "Date of Birth cannot be empty")
	private LocalDate dateOfBirth;

	//@NotNull
	//@NotEmpty(message = "marital status cannot be empty")
	@Enumerated(EnumType.STRING)
	private MaritalStatus maritalStatus;

	private String deparment;

	//@NotNull
	@Embedded
	private HomeAddress homeAdress;

	//@NotNull
	private String stateOfOrigin;

	//@NotNull
	private String LGAOfOrigin;

	//@NotNull
	private String emergencyContact;

	//@NotNull
	private String phoneNumberOfEmergencyContact;

	@NotNull
	private String adressOfEmergencyContact;

	//@NotNull
	private String relationshipToEmergencyContact;

	//@NotNull
	@Enumerated(EnumType.STRING)
	private BloodGroup bloodgroup;

	//@NotNull
	@Enumerated(EnumType.STRING)
	private Genotype Genotype;

	@ElementCollection
	private List<String> allergies;
	@ElementCollection
	private List<String> medicalConditions;

	@OneToMany(mappedBy = "patient", fetch = FetchType.LAZY)
	private List<ClinicalReport> clinicalReports;

	/**
	 * 
	 */
	public Patient() {
	}

	public Patient(String firstName, String middleName, String lastName, int phoneNumber, String email, Gender gender,
			LocalDate dateOfBirth, MaritalStatus maritalStatus, String deparment, HomeAddress homeAdress,
			String stateOfOrigin, String lGAOfOrigin, String emergencyContact, String phoneNumberOfEmergencyContact,
			String adressOfEmergencyContact, String relationshipToEmergencyContact, BloodGroup bloodgroup,
			Genotype genotype, List<String> allergies, List<String> medicalConditions) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.maritalStatus = maritalStatus;
		this.deparment = deparment;
		this.homeAdress = homeAdress;
		this.stateOfOrigin = stateOfOrigin;
		LGAOfOrigin = lGAOfOrigin;
		this.emergencyContact = emergencyContact;
		this.phoneNumberOfEmergencyContact = phoneNumberOfEmergencyContact;
		this.adressOfEmergencyContact = adressOfEmergencyContact;
		this.relationshipToEmergencyContact = relationshipToEmergencyContact;
		this.bloodgroup = bloodgroup;
		Genotype = genotype;
		this.allergies = allergies;
		this.medicalConditions = medicalConditions;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getDeparment() {
		return deparment;
	}

	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}

	public HomeAddress getHomeAdress() {
		return homeAdress;
	}

	public void setHomeAdress(HomeAddress homeAdress) {
		this.homeAdress = homeAdress;
	}

	public String getStateOfOrigin() {
		return stateOfOrigin;
	}

	public void setStateOfOrigin(String stateOfOrigin) {
		this.stateOfOrigin = stateOfOrigin;
	}

	public String getLGAOfOrigin() {
		return LGAOfOrigin;
	}

	public void setLGAOfOrigin(String lGAOfOrigin) {
		LGAOfOrigin = lGAOfOrigin;
	}

	public String getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public String getPhoneNumberOfEmergencyContact() {
		return phoneNumberOfEmergencyContact;
	}

	public void setPhoneNumberOfEmergencyContact(String phoneNumberOfEmergencyContact) {
		this.phoneNumberOfEmergencyContact = phoneNumberOfEmergencyContact;
	}

	public String getAdressOfEmergencyContact() {
		return adressOfEmergencyContact;
	}

	public void setAdressOfEmergencyContact(String adressOfEmergencyContact) {
		this.adressOfEmergencyContact = adressOfEmergencyContact;
	}

	public String getRelationshipToEmergencyContact() {
		return relationshipToEmergencyContact;
	}

	public void setRelationshipToEmergencyContact(String relationshipToEmergencyContact) {
		this.relationshipToEmergencyContact = relationshipToEmergencyContact;
	}

	public BloodGroup getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(BloodGroup bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public Genotype getGenotype() {
		return Genotype;
	}

	public void setGenotype(Genotype genotype) {
		Genotype = genotype;
	}

	public List<String> getAllergies() {
		return allergies;
	}

	public void setAllergies(List<String> allergies) {
		this.allergies = allergies;
	}

	public List<String> getMedicalConditions() {
		return medicalConditions;
	}

	public void setMedicalConditions(List<String> medicalConditions) {
		this.medicalConditions = medicalConditions;
	}

	public List<ClinicalReport> getClinicalReports() {
		return clinicalReports;
	}

	public void setClinicalReports(List<ClinicalReport> clinicalReports) {
		this.clinicalReports = clinicalReports;
	}

	@Override
	public String toString() {
		return "\nPatient [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", phoneNumber=" + phoneNumber + ", email=" + email + ", gender=" + gender
				+ ", dateOfBirth=" + dateOfBirth + ", maritalStatus=" + maritalStatus + ", deparment=" + deparment
				+ ", homeAdress=" + homeAdress + ", stateOfOrigin=" + stateOfOrigin + ", LGAOfOrigin=" + LGAOfOrigin
				+ ", emergencyContact=" + emergencyContact + ", phoneNumberOfEmergencyContact="
				+ phoneNumberOfEmergencyContact + ", adressOfEmergencyContact=" + adressOfEmergencyContact
				+ ", relationshipToEmergencyContact=" + relationshipToEmergencyContact + ", bloodgroup=" + bloodgroup
				+ ", Genotype=" + Genotype + ", allergies=" + allergies + ", medicalConditions=" + medicalConditions
				+ "]";
	}
	
	

}
