package com.Clinic.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Clinic.Entity.Patient;
import com.Clinic.Service.PatientService;

@Controller
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @RequestMapping("/newForm")
    public String newPatientForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "newPatient";
    }

    @RequestMapping("/save")
    public String addNewPatient(@ModelAttribute("patient") Patient patient) {
        patientService.addNewPatient(patient);
        return "redirect:/patient/list";
    }

    @RequestMapping("/list")
    public String listPatients(Model model) {
        List<Patient> patients = patientService.getAllPatients();
        model.addAttribute("patients", patients);
        return "patientList";
    }
}
