package com.Clinic.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Clinic.Entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}

