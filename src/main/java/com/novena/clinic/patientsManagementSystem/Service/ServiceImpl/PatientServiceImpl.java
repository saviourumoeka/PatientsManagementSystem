package com.novena.clinic.patientsManagementSystem.Service.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.novena.clinic.patientsManagementSystem.Entities.Patient;
import com.novena.clinic.patientsManagementSystem.Repository.PatientRepository;
import com.novena.clinic.patientsManagementSystem.Service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientRepository patientRepo;

	@Override
	public Patient addPatient(Patient patient) {
		
		return patientRepo.save(patient);
	}

	@Override
	public Optional<Patient> findPatient(int id) {
		return patientRepo.findById(id);
	}

	@Override
	public Patient edidPatient(Patient patient) {
		return patientRepo.save(patient);
	}

	@Override
	public void deletePatient(int id) {
		patientRepo.deleteById(id);
		
	}

	@Override
	public List<Patient> findAllPatients() {
		return patientRepo.findAll();
	}


}
