package com.example.mydemo.repository;

import com.example.mydemo.model.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface HomeRepository extends JpaRepository<Home,Long> {
    @Transactional
    @Modifying
    @Query(value = "update Home home set home.statusHome = 1 where home.id = :id")
    void updateStatus(Long id);
}
