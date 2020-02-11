package com.example.mydemo.repository;

import com.example.mydemo.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findAllByIdUser(Long idUser);

    @Modifying
    @Transactional
    @Query(value = "update Booking booking set booking.statusBook = 1 where booking.id = :id")
    void setStatus(Long id);
}
