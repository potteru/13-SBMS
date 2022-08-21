package in.Ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.Ashokit.response.Flight;
import in.Ashokit.response.Flights;

@Service
public class FlightsService {
	
	public void getUnitedFlights() {
		RestTemplate rt = new RestTemplate();
		String url = "http://mu.mulesoft-training.com/essentials/united/flights/";
		
//		Approach-1
//		ResponseEntity<String> forEntity = rt.getForEntity(url, String.class);
//		String body = forEntity.getBody();

//		Approach-2
//		ResponseEntity<Flights> responseEntity = rt.getForEntity(url, Flights.class);
//		Flights body = responseEntity.getBody();
//		List<Flight>flights = body.getFlights();
//		flights.forEach(System.out::println);
//		System.out.println(flights);
		
//      Approach-3
		HttpHeaders headers = new HttpHeaders();
		//headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("Accept", "application/json");
		HttpEntity entity =new HttpEntity<>(headers);
		
		ResponseEntity<Flights> responseEntity = rt.exchange(url, HttpMethod.GET, entity, Flights.class);
		Flights body = responseEntity.getBody();
		List<Flight> flights = body.getFlights();
		flights.forEach(System.out::println);
		
	}

}
