package com.novena.clinic.patientsManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.novena.clinic.patientsManagementSystem.Entities.VitalScience;

@Repository
public interface VitalScienceRepository extends JpaRepository<VitalScience, Integer> {

}
