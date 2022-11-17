package com.tsamanta.lil.learningspring.repository;

import com.tsamanta.lil.learningspring.model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {

}
