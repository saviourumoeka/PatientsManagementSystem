package com.novena.clinic.patientsManagementSystem.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;


@Entity
public class ClinicalReport extends AuditModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@NotNull
	private String complain;
	
	private String symtoms;
	@NotNull
	private String diagnostic;
	
	@ManyToOne
	private VitalScience vaitalScience;
	@ManyToOne
	private Patient patient;

	public ClinicalReport() {
	}

	public ClinicalReport(String complain, String symtoms, String diagnostic, VitalScience vaitalScience) {
		this.complain = complain;
		this.symtoms = symtoms;
		this.diagnostic = diagnostic;
		this.vaitalScience = vaitalScience;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getComplain() {
		return complain;
	}

	public void setComplain(String complain) {
		this.complain = complain;
	}

	public String getSymtoms() {
		return symtoms;
	}

	public void setSymtoms(String symtoms) {
		this.symtoms = symtoms;
	}

	public String getDiagnostic() {
		return diagnostic;
	}

	public void setDiagnostic(String diagnostic) {
		this.diagnostic = diagnostic;
	}

	public VitalScience getVaitalScience() {
		return vaitalScience;
	}

	public void setVaitalScience(VitalScience vaitalScience) {
		this.vaitalScience = vaitalScience;
	}

	
}
