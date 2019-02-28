package com.example.BookingSystem.repositories.customer;

import com.example.BookingSystem.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    public List<Customer> getCustomersByCourse(Long id);
    List<Customer> getCustomersInTownForCourse(String town, Long id);
    public List<Customer> getCustomersInTownForCourseOverAge(String town, Long id, int age);
}
