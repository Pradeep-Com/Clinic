package com.Clinic.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Clinic.Entity.Admin;
import com.Clinic.Service.AdminService;


@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    
    @RequestMapping("/list")
    public String listAdmins(Model model) {
        List<Admin> admins = adminService.getAllAdmins();
        model.addAttribute("admins", admins);
        return "admin-list";
    }
    
    @RequestMapping("/new/form")
    public String newAdminForm(Model model) {
        model.addAttribute("admin", new Admin());
        return "admin-form";
    }
    
    @RequestMapping("/new")
    public String addNewAdmin(@ModelAttribute("admin") Admin admin) {
        adminService.addNewAdmin(admin);
        return "redirect:/admin/list";
    }
}
