package com.novena.clinic.patientsManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.novena.clinic.patientsManagementSystem.Entities.ClinicalReport;

@Repository
public interface ClinicalReportRepository extends JpaRepository<ClinicalReport, Integer> {

}
