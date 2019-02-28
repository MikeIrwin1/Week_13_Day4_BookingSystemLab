package com.example.BookingSystem.repositories.customer;

import com.example.BookingSystem.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    public List<Customer> getCustomersByCourse(Long id);
}
