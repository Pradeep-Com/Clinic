package com.Clinic.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Clinic.Entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
