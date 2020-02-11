package com.example.mydemo.services;

import com.example.mydemo.model.Booking;

import java.util.List;

public interface BookingService {
    void saveBooking(Booking booking);

    List<Booking> getAllBookingById(Long idUser);

    void setStatusBooking(Long id);
}
