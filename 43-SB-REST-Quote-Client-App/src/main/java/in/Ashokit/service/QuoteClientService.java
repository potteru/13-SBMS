package in.Ashokit.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.Ashokit.response.QuoteResponse;

@Service
public class QuoteClientService {
	
	public QuoteResponse invokeRandomQuoteApi() {
		RestTemplate rt = new RestTemplate(); 
		  String url ="https://quoters.apps.pcfone.io/api/random";//Response APP URL 
		  
		//  ResponseEntity<String>responseEntity = rt.getForEntity(url, String.class); //This line will store json response into string variable
		 // String body = responseEntity.getBody();
		 
		//  System.out.println(body);
		 
		  	
		 ResponseEntity<QuoteResponse> forEntity = rt.getForEntity(url, QuoteResponse.class);//Quote-API will give json response That json will be converted into Quote response object at client side
		 QuoteResponse body = forEntity.getBody();
		return body;
	}

}
