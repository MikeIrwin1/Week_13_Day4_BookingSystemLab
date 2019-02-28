package com.example.BookingSystem;

import com.example.BookingSystem.models.Booking;
import com.example.BookingSystem.models.Course;
import com.example.BookingSystem.models.Customer;
import com.example.BookingSystem.repositories.booking.BookingRepository;
import com.example.BookingSystem.repositories.course.CourseRepository;
import com.example.BookingSystem.repositories.customer.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingSystemApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetCoursesByRating(){
		List<Course> courses = courseRepository.getCoursesByStarRating(5);
		assertEquals(2, courses.size());
	}

	@Test
	public void canGetCustomersByCourse(){
		List<Customer> customers = customerRepository.getCustomersByCourse(1L);

	}

	@Test
	public void canGetBookingsByDate(){
		List<Booking> bookings = bookingRepository.getBookingsByDate("07-12-2019");

	}

	@Test
	public void canGetCustomersInTownForCourse(){
		List<Customer> customers = customerRepository.getCustomersInTownForCourse("Edinburgh", 3L);
	}

	@Test
	public void canGetCustomersInTownForCourseOverAnAge(){
		List<Customer> customers = customerRepository.getCustomersInTownForCourseOverAge("Edinburgh", 3L, 32);
	}


}
