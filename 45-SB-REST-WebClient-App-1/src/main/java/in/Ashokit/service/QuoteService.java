package in.Ashokit.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.Ashokit.response.QuoteResponse;

@Service
public class QuoteService {
	
	public void getQuote() {
		
		String url ="https://quoters.apps.pcfone.io/api/random";
		WebClient webClient = WebClient.create();
		QuoteResponse block = webClient.get()
								.uri(url)
								.accept(MediaType.APPLICATION_JSON)
								.retrieve()
							//	.bodyToMono(String.class)//for string class
								.bodyToMono(QuoteResponse.class)// Quete response class
								.block();
		System.out.println(block);
	}
	
	public void getAsyc() {
		String url ="https://quoters.apps.pcfone.io/api/random";
		WebClient webClient = WebClient.create();
		webClient.get()
				.uri(url)
				.accept(MediaType.APPLICATION_JSON)
				.retrieve()
				//.bodyToMono(String.class)// for string
				.bodyToMono(QuoteResponse.class)
				.subscribe(System.out::println);
		System.out.println("Request sent ......!");
	}

}
