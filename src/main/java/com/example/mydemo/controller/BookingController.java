package com.example.mydemo.controller;

import com.example.mydemo.message.response.ResponseMessage;
import com.example.mydemo.model.Booking;
import com.example.mydemo.services.BookingService;
import com.example.mydemo.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/auth")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @Autowired
    private IUserService iUserService;

    @PostMapping("/booking/add-booking")
    public ResponseEntity<?> createBooking(@RequestBody Booking booking){
        bookingService.saveBooking(booking);
        return new ResponseEntity<>(new ResponseMessage("Booking successfully!"), HttpStatus.OK);
    }

    @GetMapping("/booking/get-id-user-book")
    public ResponseEntity<?> getIdUserBooking(@RequestParam("username") String username ){
        Long idUserName = iUserService.findIdUserName(username).getId();
        return  new ResponseEntity<>(idUserName, HttpStatus.OK);
    }
//    @PatchMapping("/booking/cancel-booking")
//    public ResponseEntity<?> cancelBooking(@RequestParam("id") Long id){
//        bookingService.setStatusBooking(id);
//        return new ResponseEntity<>(new ResponseMessage("Cancel Booking success"), HttpStatus.OK);
//    }
    @PatchMapping("/booking/cancel-booking/{id}")
    public ResponseEntity<?> cancelBooking(@PathVariable Long id){
        bookingService.setStatusBooking(id);
        return new ResponseEntity<>(new ResponseMessage("Cancel Booking success"), HttpStatus.OK);
    }
}
