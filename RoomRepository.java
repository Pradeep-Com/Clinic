package com.Clinic.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Clinic.Entity.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {
}

