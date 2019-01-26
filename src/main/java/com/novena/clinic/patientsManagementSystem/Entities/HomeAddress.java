package com.novena.clinic.patientsManagementSystem.Entities;

import javax.persistence.Embeddable;

@Embeddable
public class HomeAddress {
	
	private int streetNumber;
	
	private String streetName;
	
	private String addressCity;
	
	private String addressState;
	
	

	public HomeAddress() {
	}

	public HomeAddress(int streetNumber, String streetName, String addressCity, String addressState) {
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.addressCity = addressCity;
		this.addressState = addressState;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getAddressState() {
		return addressState;
	}

	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HomeAddress [streetNumber=");
		builder.append(streetNumber);
		builder.append(", streetName=");
		builder.append(streetName);
		builder.append(", addressCity=");
		builder.append(addressCity);
		builder.append(", addressState=");
		builder.append(addressState);
		builder.append("]");
		return builder.toString();
	}


	
	

}


