package com.novena.clinic.patientsManagementSystem.Entities.Enums;

public enum Genotype {
	AA ("AA"),
	AS ("AS"),
	SS ("SStq");
	
	private final String genotype;

	/**
	 * @param genotype
	 */
	private Genotype(String genotype) {
		this.genotype = genotype;
	}

	public String getGenotype() {
		return genotype;
	}
	
	
}
