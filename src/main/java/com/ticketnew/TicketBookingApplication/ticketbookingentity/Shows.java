package com.ticketnew.TicketBookingApplication.ticketbookingentity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Shows {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long show_id;

	private int theatre_id;
	private String theatre_name;
	private String theatre_location;
	private int screen_id;
	private int seats;
	private String screen_name;
	private int movie_id;
    private String movie_name;
    private String movie_lang;
    
    public Shows() {}

	public Shows(long show_id, int theatre_id, String theatre_name, String theatre_location, int screen_id, int seats,
			String screen_name, int movie_id, String movie_name, String movie_lang) {
		super();
		this.show_id = show_id;
		this.theatre_id = theatre_id;
		this.theatre_name = theatre_name;
		this.theatre_location = theatre_location;
		this.screen_id = screen_id;
		this.seats = seats;
		this.screen_name = screen_name;
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.movie_lang = movie_lang;
	}

	public long getShow_id() {
		return show_id;
	}

	public void setShow_id(long show_id) {
		this.show_id = show_id;
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

	public int getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getMovie_lang() {
		return movie_lang;
	}

	public void setMovie_lang(String movie_lang) {
		this.movie_lang = movie_lang;
	};
    
    
	

}
