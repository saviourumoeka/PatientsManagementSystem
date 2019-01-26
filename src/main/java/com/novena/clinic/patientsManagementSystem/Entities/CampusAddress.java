package com.novena.clinic.patientsManagementSystem.Entities;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Embeddable
public class CampusAddress  {
	@NotNull
	@NotEmpty(message="Room Number Cannot be Empty")
	private int roomNumber;
	
	@NotNull
	@NotEmpty(message="Hall Name Cannot be Empty")
	private String hallName;
	
	

	public CampusAddress() {
	}

	public CampusAddress(int roomNumber, String hallName) {
		this.roomNumber = roomNumber;
		this.hallName = hallName;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getHallName() {
		return hallName;
	}

	public void setHallName(String hallName) {
		this.hallName = hallName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CampusAddress [roomNumber=");
		builder.append(roomNumber);
		builder.append(", hallName=");
		builder.append(hallName);
		builder.append("]");
		return builder.toString();
	}

	
	
	

}
