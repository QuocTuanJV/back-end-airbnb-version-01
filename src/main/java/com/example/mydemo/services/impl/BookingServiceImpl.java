package com.example.mydemo.services.impl;

import com.example.mydemo.model.Booking;
import com.example.mydemo.repository.BookingRepository;
import com.example.mydemo.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public void saveBooking(Booking booking) {
        bookingRepository.save(booking);
    }


}
