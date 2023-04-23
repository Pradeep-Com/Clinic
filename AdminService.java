package com.Clinic.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Clinic.Entity.Admin;
import com.Clinic.Repositry.AdminRepository;

@Service
public class AdminService {
    
    @Autowired
    private AdminRepository adminRepository;
    
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }
    
    public void addNewAdmin(Admin admin) {
        adminRepository.save(admin);
    }

}
