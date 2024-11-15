package com.ticketnew.TicketBookingApplication.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ticketnew.TicketBookingApplication.ticketbookingentity.Shows;

@Repository
public interface ShowsRepository extends JpaRepository<Shows,Long>{
	
	@Query(nativeQuery=true,value="SELECT * FROM shows WHERE theatre_loc=:location")
	public List<Shows> getShowsByLocation(String location);
}
