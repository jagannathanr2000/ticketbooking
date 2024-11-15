package com.ticketnew.TicketBookingApplication.ticketbookingentity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


public class TicketNewMovieEntity {

    
	private String movie_id;
    private String movie_name;
    private String movie_lang;
    private String movie_location;
    
 
	public TicketNewMovieEntity() {
		super();
	}
	public TicketNewMovieEntity(String movie_id, String movie_name, String movie_lang, String movie_location) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.movie_lang = movie_lang;
		this.movie_location = movie_location;
	}
	public String getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(String movie_id) {
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
	}
	public String getMovie_location() {
		return movie_location;
	}
	public void setMovie_location(String movie_location) {
		this.movie_location = movie_location;
	}
    
 
}
