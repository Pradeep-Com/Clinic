package com.Clinic.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Clinic.Entity.Patient;
import com.Clinic.Repositry.PatientRepository;

@Service
public class PatientService {
    
    @Autowired
    private PatientRepository patientRepository;
    
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
    
    public void addNewPatient(Patient patient) {
        patientRepository.save(patient);
    }
}

