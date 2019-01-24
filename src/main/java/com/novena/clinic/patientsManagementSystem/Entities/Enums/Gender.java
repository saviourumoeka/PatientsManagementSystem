package com.novena.clinic.patientsManagementSystem.Entities.Enums;

public enum Gender {
	MALE ("Male"),
	FEMALE ("Female");
	
	private final String gender;

	/**
	 * @param gender
	 */
	private Gender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}
	
	
}
