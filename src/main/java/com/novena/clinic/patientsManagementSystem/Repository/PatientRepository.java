package com.novena.clinic.patientsManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.novena.clinic.patientsManagementSystem.Entities.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
