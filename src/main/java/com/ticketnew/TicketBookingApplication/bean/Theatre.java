package com.ticketnew.TicketBookingApplication.bean;
public class Theatre {
	
  private int theatre_id;
  private String theatre_name;
  private String theatre_location;
  
  
  
  
  private AgsScreen screen;
  
  
  public Theatre() {}

public Theatre(int theatre_id, String theatre_name, String theatre_location, AgsScreen screen) {
	super();
	this.theatre_id = theatre_id;
	this.theatre_name = theatre_name;
	this.theatre_location = theatre_location;
	this.screen = screen;
}

public int getTheatre_id() {
	return theatre_id;
}

public void setTheatre_id(int theatre_id) {
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

public AgsScreen getScreen() {
	return screen;
}

public void setScreen(AgsScreen screen) {
	this.screen = screen;
}
 
  
  
}


