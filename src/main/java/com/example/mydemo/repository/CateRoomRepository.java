package com.example.mydemo.repository;

import com.example.mydemo.model.CategoryRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CateRoomRepository extends JpaRepository<CategoryRoom, Long> {

}
