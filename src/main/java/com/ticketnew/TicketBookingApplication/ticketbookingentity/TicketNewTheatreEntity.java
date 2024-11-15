package com.ticketnew.TicketBookingApplication.ticketbookingentity;

import jakarta.persistence.Entity;


public class TicketNewTheatreEntity {
  private String theatre_id;
  private String theatre_name;
  private String theatre_location;

public TicketNewTheatreEntity () {
	super();
}

public TicketNewTheatreEntity (String theatre_id, String theatre_name, String theatre_location) {
	super();
	this.theatre_id = theatre_id;
	this.theatre_name = theatre_name;
	this.theatre_location = theatre_location;
}

public String getTheatre_id() {
	return theatre_id;
}
public void setTheatre_id(String theatre_id) {
	this.theatre_id = theatre_id;
}
public String getTheatre_name() {
	return theatre_name;
}
public void setTheatre_name(String theatre_name) {
	this.theatre_name = theatre_name;
}
public String getTheatre_location() {
	return theatre_location;
}
public void setTheatre_location(String theatre_location) {
	this.theatre_location = theatre_location;
}
  
  
  
}


