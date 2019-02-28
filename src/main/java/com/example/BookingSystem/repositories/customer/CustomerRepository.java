package com.example.BookingSystem.repositories.customer;

import com.example.BookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
    public List<Customer> getCustomersByCourse(Long id);
}
