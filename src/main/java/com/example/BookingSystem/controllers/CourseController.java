package com.example.BookingSystem.controllers;


import com.example.BookingSystem.models.Course;
import com.example.BookingSystem.repositories.course.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/bookings/customers/{id}")
    public List<Course> getCoursesByCustomer(@PathVariable Long id){
        return courseRepository.getCoursesByCustomer(id);
    }
}


