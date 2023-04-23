package com.Clinic.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Clinic.Entity.Doctor;
import com.Clinic.Repositry.DoctorRepository;

@Service
public class DoctorService {
    
    @Autowired
    private DoctorRepository doctorRepository;
    
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }
    
    public void addNewDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
    }
}

