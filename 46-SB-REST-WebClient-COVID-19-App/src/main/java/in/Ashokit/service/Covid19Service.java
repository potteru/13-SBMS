package in.Ashokit.service;

import java.util.stream.Stream;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.Ashokit.response.Covid19Response;

@Service
public class Covid19Service {
	public void getCovid19Data() {
		
		String endpointUrl = "https://covid-19-data.p.rapidapi.com/country/code?code=it";
		WebClient webClient = WebClient.create();
		
		//String
		Covid19Response[] response = webClient.get()
				.uri(endpointUrl)
				.header("x-rapidapi-host","covid-19-data.p.rapidapi.com")
				.header("x-rapidapi-key", "0b5f1a8b22msh114ec806252576ep1a937cjsn7819c9620f3c")
				.retrieve()
			//	.bodyToMono(String.class)
				.bodyToMono(Covid19Response[].class)
				.block();
		
		//System.out.println(response);
		
		Stream.of(response).forEach(System.out::println);
	}
}
