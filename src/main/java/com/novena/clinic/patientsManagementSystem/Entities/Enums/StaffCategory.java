package com.novena.clinic.patientsManagementSystem.Entities.Enums;

public enum StaffCategory {

	MANAGEMENT_STAFF ("Management Staff") ,
	ACADEMIC_STAFF ("Academic Staff"),
	TECHNICAL_STAFF ("Technical Staff"),
	NON_ACADEMIC_STAFF ("Non Academic Staff");
	
	private final String staffCategory;

	private StaffCategory(String staffCategory) {
		this.staffCategory = staffCategory;
	}

	public String getStaffCategory() {
		return staffCategory;
	}
	
	
}
