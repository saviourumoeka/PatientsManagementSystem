package com.novena.clinic.patientsManagementSystem.Entities.Enums;

public enum StaffType {

	FULL_TIME ("Full Time"),
	PART_TIME ("Part Time");
	
	private final String staffType;

	private StaffType(String staffType) {
		this.staffType = staffType;
	}

	public String getStaffType() {
		return staffType;
	}
	
	
}
