package com.example.BookingSystem.components;

import com.example.BookingSystem.models.Booking;
import com.example.BookingSystem.models.Course;
import com.example.BookingSystem.models.Customer;
import com.example.BookingSystem.repositories.booking.BookingRepository;
import com.example.BookingSystem.repositories.course.CourseRepository;
import com.example.BookingSystem.repositories.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;



    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        Course course = new Course("Java for Dummies", "Edinburgh", 5);
        courseRepository.save(course);

        Customer customer = new Customer("Mark Mackay", "Innerleithen", 46);
        customerRepository.save(customer);

        Booking booking = new Booking("07-12-2019", course, customer);
        bookingRepository.save(booking);
    }


}
