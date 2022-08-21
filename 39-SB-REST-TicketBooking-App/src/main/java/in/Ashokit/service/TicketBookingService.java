package in.Ashokit.service;

import org.springframework.stereotype.Service;

import in.Ashokit.request.Passenger;
import in.Ashokit.response.Ticket;

@Service
public class TicketBookingService {
	
	public Ticket bookTicket(Passenger passenger){
		
		System.out.println(passenger);
		//logic to book Ticket
		
		Ticket t = new Ticket();
		t.setPnr("123456789");
		t.setTicketStatus(" CONFIRMED ");
		t.setTicketPrice("1000.45 INR");
		return t;	
	}
}
