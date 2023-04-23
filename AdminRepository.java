package com.Clinic.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Clinic.Entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}

