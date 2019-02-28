package com.example.BookingSystem.repositories.course;

import com.example.BookingSystem.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {
    List<Course> getCoursesByCustomer(Long id);
}
