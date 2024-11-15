package com.ticketnew.TicketBookingApplication.bean;
public class AgsScreen {
    
    
	private int  screen_id;
	private  int seats;
	private String screen_name;
	
	public int getScreen_id() {
		return screen_id;
	}
	public void setScreen_id(int screen_id) {
		this.screen_id = screen_id;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getScreen_name() {
		return screen_name;
	}
	public void setScreen_name(String screen_name) {
		this.screen_name = screen_name;
	}
	
	public AgsScreen(int screen_id, int seats, String screen_name) {
		super();
		this.screen_id = screen_id;
		this.seats = seats;
		this.screen_name = screen_name;
	}
	
	public AgsScreen() {
		super();
	}
	
	
	
	
}
