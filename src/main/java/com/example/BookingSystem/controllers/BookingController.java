package com.example.BookingSystem.controllers;


import com.example.BookingSystem.repositories.booking.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;
}
