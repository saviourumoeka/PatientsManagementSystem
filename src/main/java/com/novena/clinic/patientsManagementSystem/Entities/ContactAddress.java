package com.novena.clinic.patientsManagementSystem.Entities;

import javax.persistence.Embeddable;

@Embeddable
public class ContactAddress {
	
	private int contactHouseNumber;
	
	private String contactStreetName;
	
	private String contactAddressCity;
	
	private String contactAddressState;
	
	

	public ContactAddress() {
	}

	public ContactAddress(int streetNumber, String streetName, String addressCity, String addressState) {
		this.contactHouseNumber = streetNumber;
		this.contactStreetName = streetName;
		this.contactAddressCity = addressCity;
		this.contactAddressState = addressState;
	}

	public int getHouseNumber() {
		return contactHouseNumber;
	}

	public void setHouseNumber(int streetNumber) {
		this.contactHouseNumber = streetNumber;
	}

	public String getStreetName() {
		return contactStreetName;
	}

	public void setStreetName(String streetName) {
		this.contactStreetName = streetName;
	}

	public String getAddressCity() {
		return contactAddressCity;
	}

	public void setAddressCity(String addressCity) {
		this.contactAddressCity = addressCity;
	}

	public String getAddressState() {
		return contactAddressState;
	}

	public void setAddressState(String addressState) {
		this.contactAddressState = addressState;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HomeAddress [streetNumber=");
		builder.append(contactHouseNumber);
		builder.append(", streetName=");
		builder.append(contactStreetName);
		builder.append(", addressCity=");
		builder.append(contactAddressCity);
		builder.append(", addressState=");
		builder.append(contactAddressState);
		builder.append("]");
		return builder.toString();
	}


	
	

}


