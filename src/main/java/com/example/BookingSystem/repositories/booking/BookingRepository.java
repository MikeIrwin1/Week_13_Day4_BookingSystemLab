package com.example.BookingSystem.repositories.booking;

import com.example.BookingSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
