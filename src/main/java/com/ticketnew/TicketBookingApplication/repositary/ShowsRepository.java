package com.ticketnew.TicketBookingApplication.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ticketnew.TicketBookingApplication.ticketbookingentity.Shows;

@Repository
public interface ShowsRepository extends JpaRepository<Shows,Long>{

}
