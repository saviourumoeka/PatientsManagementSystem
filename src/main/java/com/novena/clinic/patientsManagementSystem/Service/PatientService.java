package com.novena.clinic.patientsManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import com.novena.clinic.patientsManagementSystem.Entities.Patient;

public interface PatientService {
	
	Patient addPatient (Patient patient);
	Optional<Patient> findPatient(int id);
	Patient edidPatient(Patient patient);
	void deletePatient(int id);
	List<Patient> findAllPatients ();
	
	

}
