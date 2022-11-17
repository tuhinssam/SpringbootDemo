package com.tsamanta.lil.learningspring.service;

import com.tsamanta.lil.learningspring.model.Room;
import com.tsamanta.lil.learningspring.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoomService {
    RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getRooms(){
        List<Room> roomList = roomRepository.findAll();
        return roomList.stream().sorted((r1, r2)->r1.getName().compareTo(r2.getName())).collect(Collectors.toList());
    }
}
