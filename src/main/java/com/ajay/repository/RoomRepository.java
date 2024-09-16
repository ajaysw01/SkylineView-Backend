package com.ajay.repository;

import com.ajay.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
/**
 *
 * @author Ajay wankhade
 */
public interface RoomRepository extends JpaRepository<Room,Long> {
    @Query("SELECT r.roomType FROM Room r ")
    List<String> findDistinctRoomTypes();
}
