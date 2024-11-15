package com.ticketnew.TicketBookingApplication.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticketnew.TicketBookingApplication.ticketbookingentity.Shows;

public interface ShowsRepository extends JpaRepository<Shows,Integer>{

}
