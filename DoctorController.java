package com.Clinic.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Clinic.Entity.Doctor;
import com.Clinic.Service.DoctorService;


@Controller
@RequestMapping("/doctor")
public class DoctorController {
    
    @Autowired
    private DoctorService doctorService;

    @RequestMapping("/new")
    public String newDoctorForm(Model model) {
        model.addAttribute("doctor", new Doctor());
        return "newDoctor";
    }

    @RequestMapping("/save")
    public String addNewDoctor(@ModelAttribute("doctor") Doctor doctor) {
        doctorService.addNewDoctor(doctor);
        return "redirect:/doctor/list";
    }
    
    // other methods
}
