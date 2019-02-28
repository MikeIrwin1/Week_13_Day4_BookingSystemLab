package com.example.BookingSystem.controllers;


import com.example.BookingSystem.models.Customer;
import com.example.BookingSystem.repositories.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/bookings/courses/{id}")
    public List<Customer> getCustomersByCourse(@PathVariable Long id){
        return customerRepository.getCustomersByCourse(id);
    }

}
