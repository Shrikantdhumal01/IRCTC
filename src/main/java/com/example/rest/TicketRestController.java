package com.example.rest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bindings.TicketInfo;



import com.example.bindings.PassengerInfo;



@RestController

public class TicketRestController
{   @PostMapping (
	              value= "/ticket", 
	              produces = {"application/json"},
	              consumes = {"application/json"})

	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo request)
	{
	  
		System.out.println(request);
		
		TicketInfo t = new TicketInfo();
		t.setTicketId(1234);
		t.setPnr("JLJL6868");
		t.setTicketStatus("Confirmed");
		
		return new ResponseEntity<>(t,HttpStatus.CREATED);
		
	
	}
	
	}

