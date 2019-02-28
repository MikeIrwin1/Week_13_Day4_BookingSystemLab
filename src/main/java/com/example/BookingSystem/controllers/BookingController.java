package com.example.BookingSystem.controllers;


import com.example.BookingSystem.models.Booking;
import com.example.BookingSystem.repositories.booking.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/dates/{date}")
    public List<Booking> getBookingsByDate(@PathVariable String date){
        String parsed = date.toLowerCase();
        return bookingRepository.getBookingsByDate(parsed);
    }
}
