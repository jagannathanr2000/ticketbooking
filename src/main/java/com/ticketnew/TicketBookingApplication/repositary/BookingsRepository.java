package com.ticketnew.TicketBookingApplication.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ticketnew.TicketBookingApplication.ticketbookingentity.Bookings;

@Repository
public interface BookingsRepository extends JpaRepository<Bookings,Integer>{

}
