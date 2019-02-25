package com.novena.clinic.patientsManagementSystem.Entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ContactAddress {
	
	@Column(nullable = false)
	private int contactHouseNumber;
	
	@Column(nullable = false)
	private String contactStreetName;
	
	@Column(nullable = false)
	private String contactAddressCity;
	
	@Column(nullable = false)
	private String contactAddressState;

	public ContactAddress() {
	}

	public ContactAddress(int contactHouseNumber, String contactStreetName, String contactAddressCity,
			String contactAddressState) {
		this.contactHouseNumber = contactHouseNumber;
		this.contactStreetName = contactStreetName;
		this.contactAddressCity = contactAddressCity;
		this.contactAddressState = contactAddressState;
	}

	public int getContactHouseNumber() {
		return contactHouseNumber;
	}

	public void setContactHouseNumber(int contactHouseNumber) {
		this.contactHouseNumber = contactHouseNumber;
	}

	public String getContactStreetName() {
		return contactStreetName;
	}

	public void setContactStreetName(String contactStreetName) {
		this.contactStreetName = contactStreetName;
	}

	public String getContactAddressCity() {
		return contactAddressCity;
	}

	public void setContactAddressCity(String contactAddressCity) {
		this.contactAddressCity = contactAddressCity;
	}

	public String getContactAddressState() {
		return contactAddressState;
	}

	public void setContactAddressState(String contactAddressState) {
		this.contactAddressState = contactAddressState;
	}

	@Override
	public String toString() {
		return "ContactAddress [contactHouseNumber=" + contactHouseNumber + ", contactStreetName=" + contactStreetName
				+ ", contactAddressCity=" + contactAddressCity + ", contactAddressState=" + contactAddressState
				+ "]";
	}
	
	

	
	

}


