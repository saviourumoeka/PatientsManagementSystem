package com.novena.clinic.patientsManagementSystem.Entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class VitalScience extends AuditModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotNull
	private double weight;
	@NotNull
	private double temperture;
	@NotNull
	private int pluseRate;
	

	public VitalScience() {
	}

	public VitalScience(double weight, double temperture, int pluseRate) {
		this.weight = weight;
		this.temperture = temperture;
		this.pluseRate = pluseRate;
	}

	public Integer getId() {
		return id;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getTemperture() {
		return temperture;
	}

	public void setTemperture(double temperture) {
		this.temperture = temperture;
	}

	public int getPluseRate() {
		return pluseRate;
	}

	public void setPluseRate(int pluseRate) {
		this.pluseRate = pluseRate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VitalScience [id=");
		builder.append(id);
		builder.append(", weight=");
		builder.append(weight);
		builder.append(", temperture=");
		builder.append(temperture);
		builder.append(", pluseRate=");
		builder.append(pluseRate);
		builder.append("]");
		return builder.toString();
	}
	
	

}
