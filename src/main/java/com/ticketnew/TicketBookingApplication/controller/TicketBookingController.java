package com.ticketnew.TicketBookingApplication.controller;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ticketnew.TicketBookingApplication.bean.Movie;
import com.ticketnew.TicketBookingApplication.bean.ShowDTO;
import com.ticketnew.TicketBookingApplication.bean.Theatre;
import com.ticketnew.TicketBookingApplication.service.TicketBookingService;
import com.ticketnew.TicketBookingApplication.ticketbookingentity.Shows;

@RestController
public class TicketBookingController {
	
	   @Autowired
	   TicketBookingService ticketService;
	
	@PostMapping("/addshow")
	public ResponseEntity<Shows> addNewShow(@RequestBody ShowDTO request) {
		 Shows response = ticketService.addShow(request);
		 return ResponseEntity.ok(response);
	}
}
