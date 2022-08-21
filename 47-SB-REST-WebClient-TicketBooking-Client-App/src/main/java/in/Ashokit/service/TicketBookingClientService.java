package in.Ashokit.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.Ashokit.request.PassengerRequest;
import in.Ashokit.response.TicketResponse;

@Service
public class TicketBookingClientService {
		
	public void invokTicketBookingApi() {
		String endpointUrl = "http://localhost:9090/bookTicket";
		
		PassengerRequest requestData = new PassengerRequest("aadi","aadi","hyd","blr","20-mar-2022");
		WebClient webClient = WebClient.create();
					TicketResponse responseData = webClient.post()
							.uri(endpointUrl)
							.body(BodyInserters.fromValue(requestData))
							.accept(MediaType.APPLICATION_JSON)
							.retrieve()
							.bodyToMono(TicketResponse.class)
							.block();
		System.out.println(responseData);
	}
}
