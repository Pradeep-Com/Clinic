package com.Clinic.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Clinic.Entity.Room;
import com.Clinic.Repositry.RoomRepository;

@Controller
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomRepository roomRepository;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addNewRoom(@ModelAttribute("room") Room room) {
        roomRepository.save(room);
        return "redirect:/room/list";
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newRoomForm(Model model) {
        Room room = new Room();
        model.addAttribute("room", room);
        return "newRoom";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listRooms(Model model) {
        List<Room> rooms = roomRepository.findAll();
        model.addAttribute("rooms", rooms);
        return "listRooms";
    }
}
