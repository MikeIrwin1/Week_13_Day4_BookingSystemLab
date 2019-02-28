package com.example.BookingSystem.repositories.course;

import com.example.BookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
    List<Course> getCoursesByStarRating(int rating);
    List<Course> getCoursesByCustomer(Long id);


}
