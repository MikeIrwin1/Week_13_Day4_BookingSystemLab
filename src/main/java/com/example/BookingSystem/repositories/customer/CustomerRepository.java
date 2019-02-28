package com.example.BookingSystem.repositories.customer;

import com.example.BookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
