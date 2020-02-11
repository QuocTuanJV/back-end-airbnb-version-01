package com.example.mydemo.services.impl;

import com.example.mydemo.model.Booking;
import com.example.mydemo.repository.BookingRepository;
import com.example.mydemo.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public void saveBooking(Booking booking) {
        bookingRepository.save(booking);
    }

    @Override
    public List<Booking> getAllBookingById(Long idUser) {
        return bookingRepository.findAllByIdUser(idUser);
    }

    @Override
    public void setStatusBooking(Long id) {
        bookingRepository.setStatus(id);
    }


}
