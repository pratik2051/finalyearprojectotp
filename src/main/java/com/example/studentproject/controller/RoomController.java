package com.example.studentproject.controller;

import com.example.studentproject.model.Room;
import com.example.studentproject.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rooms")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/getallRooms")
    public List<Room> getAllRooms() {
        return roomService.getAllRooms();
    }

    @GetMapping("/getroomby/{id}")
    public Room getRoomById(@PathVariable Long id) {
        return roomService.getRoomById(id);
    }

    @PostMapping("/createroom")
    public Room createRoom(@RequestBody Room room) {
        return roomService.saveRoom(room);
    }

    @PutMapping("/updatebyid/{id}")
    public Room updateRoom(@PathVariable Long id, @RequestBody Room room) {
        Room existingRoom = roomService.getRoomById(id);
        if (existingRoom != null) {
            existingRoom.setNumber(room.getNumber());
            existingRoom.setLocation(room.getLocation());
            existingRoom.setAssets(room.getAssets());
            return roomService.saveRoom(existingRoom);
        } else {
            return null;
        }
    }

    @DeleteMapping("/deleteroom/{id}")
    public void deleteRoom(@PathVariable Long id) {
        roomService.deleteRoom(id);
    }
}