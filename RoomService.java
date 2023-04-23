package com.Clinic.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Clinic.Entity.Room;
import com.Clinic.Repositry.RoomRepository;

@Service
public class RoomService {
    
    @Autowired
    private RoomRepository roomRepository;
    
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }
    
    public void addNewRoom(Room room) {
        roomRepository.save(room);
    }
}

