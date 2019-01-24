package com.novena.clinic.patientsManagementSystem.Entities.Enums;

public enum MaritalStatus {
	SINGLE ("Single"),
	MARRIED ("Married"),
	DIVORCED ("Divorced"),
	SEPARATED ("Separated"),
	WIDOWED ("Widowed"),
	WIDOWERED ("Widowered");
	
	private final String maritalStatus;

	/**
	 * @param maritalStatus
	 */
	private MaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}
	
	
	
}
