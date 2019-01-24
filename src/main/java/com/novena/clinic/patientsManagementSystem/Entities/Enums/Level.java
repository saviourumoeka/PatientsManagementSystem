package com.novena.clinic.patientsManagementSystem.Entities.Enums;

public enum Level {
	_100 ("100"),
	_200 ("200"),
	_300 ("300"),
	_400 ("400"),
	_500 ("500"),
	_600 ("600");
	
	private final String level;

	/**
	 * @param level
	 */
	private Level(String level) {
		this.level = level;
	}

	public String getLevel() {
		return level;
	}
	
	
}
