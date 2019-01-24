package com.novena.clinic.patientsManagementSystem.Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.novena.clinic.patientsManagementSystem.Entities.Enums.BloodGroup;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.Gender;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.Level;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.MaritalStatus;
import com.novena.clinic.patientsManagementSystem.Entities.Enums.Genotype;

@Entity
public class Patient extends AuditModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(unique = true, nullable = false)
	@NotEmpty(message = "Matric Number Cannot be Empty")
	private String matricNumber;

	private String firstName;

	private String middleName;

	private String lastName;

	@Column(unique = true, nullable = false)
	private int phoneNumber;

	@Column(unique = true, nullable = false)
	private String email;

	private Gender gender;

	@NotNull
	@NotEmpty(message = "Date of Birth cannot be empty")
	private Date dateOfBirth;

	@NotNull
	@NotEmpty(message = "marital status cannot be empty")
	private MaritalStatus maritalStatus;

	@NotNull
	@NotEmpty(message = "Level cannot be empty")
	private Level level;

	@NotNull
	private String department;

	@NotNull
	private String faculty;

	@NotNull
	private String homeAdress;

	@NotNull
	private String campusAdress;

	@NotNull
	private String stateOfOrigin;

	@NotNull
	private String LGAOfOrigin;

	@NotNull
	private String emergencyContact;

	@NotNull
	private String phoneNumberOfEmergencyContact;

	@NotNull
	private String adressOfEmergencyContact;

	@NotNull
	private String relationshipToEmergencyContact;

	@NotNull
	private BloodGroup bloodgroup;

	@NotNull
	private Genotype Genotype;

	@ElementCollection
	private List<String> allergies = new ArrayList<String>();
	@ElementCollection
	private List<String> medicalConditions;
	
	@OneToMany(mappedBy="patient",fetch=FetchType.LAZY)
	private List<ClinicalReport> clinicalReports;

	/**
	 * 
	 */
	public Patient() {
	}

	public Patient(String matricNumber, String firstName, String middleName, String lastName, int phoneNumber,
			String email, Gender gender, Date dateOfBirth, MaritalStatus maritalStatus, Level level, String department,
			String faculty, String homeAdress, String campusAdress, String stateOfOrigin, String lGAOfOrigin,
			String emergencyContact, String phoneNumberOfEmergencyContact, String adressOfEmergencyContact,
			String relationshipToEmergencyContact, BloodGroup bloodgroup, Genotype genotype, List<String> allergies,
			List<String> medicalConditions) {
		this.matricNumber = matricNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.maritalStatus = maritalStatus;
		this.level = level;
		this.department = department;
		this.faculty = faculty;
		this.homeAdress = homeAdress;
		this.campusAdress = campusAdress;
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

	public String getMatricNumber() {
		return matricNumber;
	}

	public void setMatricNumber(String matricNumber) {
		this.matricNumber = matricNumber;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getHomeAdress() {
		return homeAdress;
	}

	public void setHomeAdress(String homeAdress) {
		this.homeAdress = homeAdress;
	}

	public String getCampusAdress() {
		return campusAdress;
	}

	public void setCampusAdress(String campusAdress) {
		this.campusAdress = campusAdress;
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
		return "Patient [id=" + id + ", matricNumber=" + matricNumber + ", firstName=" + firstName + ", lastName="
				+ lastName + ", phoneNumber=" + phoneNumber + ", email=" + email + ", gender=" + gender
				+ ", dateOfBirth=" + dateOfBirth + ", maritalStatus=" + maritalStatus + ", level=" + level
				+ ", department=" + department + ", faculty=" + faculty + ", homeAdress=" + homeAdress
				+ ", campusAdress=" + campusAdress + ", stateOfOrigin=" + stateOfOrigin + ", LGAOfOrigin=" + LGAOfOrigin
				+ ", emergencyContact=" + emergencyContact + ", phoneNumberOfEmergencyContact="
				+ phoneNumberOfEmergencyContact + ", adressOfEmergencyContact=" + adressOfEmergencyContact
				+ ", relationshipToEmergencyContact=" + relationshipToEmergencyContact + ", bloodgroup=" + bloodgroup
				+ ", Genotype=" + Genotype + ", allergies=" + allergies + ", medicalConditions=" + medicalConditions
				+ "]";
	}

}
