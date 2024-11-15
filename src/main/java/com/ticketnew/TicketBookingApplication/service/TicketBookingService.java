package com.ticketnew.TicketBookingApplication.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ticketnew.TicketBookingApplication.bean.Movie;
import com.ticketnew.TicketBookingApplication.bean.ShowDTO;
import com.ticketnew.TicketBookingApplication.bean.Theatre;
import com.ticketnew.TicketBookingApplication.repositary.ShowsRepository;
import com.ticketnew.TicketBookingApplication.ticketbookingentity.Shows;

@Service
public class TicketBookingService {

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	ShowsRepository showsRepo;
	
	public Shows addShow(ShowDTO req) {
		String theatreName = req.getTheatre_name();
		String baseUrl = theatreName.equals("AGS") ? "http://localhost:8085" : "http://localhost:8086";

		Movie movie = fetchMovieFromApi(baseUrl, req.getMovie_id());
		Theatre theatre = fetchTheatreFromApi(baseUrl, req.getTheatre_id());
		Shows show = new Shows();
		show.setTheatre_id(theatre.getTheatre_id());
		show.setMovie_id(movie.getMovie_id());
		show.setTheatre_name(theatre.getTheatre_name());
		show.setTheatre_location(theatre.getTheatre_location());
		show.setMovie_name(movie.getMovie_name());
		show.setMovie_lang(movie.getMovie_lang());
		show.setScreen_name(theatre.getScreen().getScreen_name());
		show.setSeats(theatre.getScreen().getSeats());
		show.setScreen_id(theatre.getScreen().getScreen_id());
		
		return showsRepo.save(show);
	}

	public Movie fetchMovieFromApi(String baseUrl, int movieId) {
			
		String url = baseUrl+"/movies"+movieId;
		  HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity <String> entity = new HttpEntity<String>(headers);
	      
	      Movie movie = restTemplate.exchange(url, HttpMethod.GET, entity, Movie.class).getBody();
	      return movie;
	}

	public Theatre fetchTheatreFromApi(String baseUrl, int theatreId) {
		String url = baseUrl+"/theatres"+theatreId;
		  HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity <String> entity = new HttpEntity<String>(headers);
	      
	      Theatre theatre = restTemplate.exchange(url, HttpMethod.GET, entity, Theatre.class).getBody();
	      return theatre;
	}

}
