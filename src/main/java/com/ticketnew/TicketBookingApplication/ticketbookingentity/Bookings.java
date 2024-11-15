package com.ticketnew.TicketBookingApplication.ticketbookingentity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bookings {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long booking_id;
	
	private long show_id;
	
	private int seats;
	
	public Bookings() {}

	public Bookings(long booking_id, long show_id, int seats) {
		super();
		this.booking_id = booking_id;
		this.show_id = show_id;
		this.seats = seats;
	}

	public long getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(long booking_id) {
		this.booking_id = booking_id;
	}

	public long getShow_id() {
		return show_id;
	}

	public void setShow_id(long show_id) {
		this.show_id = show_id;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	
	
}
