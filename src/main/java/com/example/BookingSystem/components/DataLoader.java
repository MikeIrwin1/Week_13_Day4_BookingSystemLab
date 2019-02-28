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
        Course course1 = new Course("Exploring the Internet", "Glasgow", 2);
        Course course2 = new Course("JavaScript for Dummies", "Edinburgh", 5);

        courseRepository.save(course);
        courseRepository.save(course1);
        courseRepository.save(course2);

        Customer customer = new Customer("Mark Mackay", "Innerleithen", 46);
        Customer customer1 = new Customer("Michael Irwin", "Edinburgh", 31);
        Customer customer2 = new Customer("Jonathan Lavi", "Edinburgh", 33);
        customerRepository.save(customer);
        customerRepository.save(customer1);
        customerRepository.save(customer2);

        Booking booking = new Booking("07-12-2019", course, customer);
        Booking booking1 = new Booking("07-12-2019", course, customer1);
        Booking booking2 = new Booking("01-01-2012", course1, customer2);
        Booking booking3 = new Booking("05-02-2017", course2, customer1);
        Booking booking4 = new Booking("05-02-2017", course2, customer2);

        bookingRepository.save(booking);
        bookingRepository.save(booking1);
        bookingRepository.save(booking2);
        bookingRepository.save(booking3);
        bookingRepository.save(booking4);

    }


}
