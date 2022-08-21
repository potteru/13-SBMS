package in.Ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import in.Ashokit.response.QuoteResponse;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		
//		  RestTemplate rt = new RestTemplate(); 
//		  String url ="https://quoters.apps.pcfone.io/api/random";//Response APP URL 
//		  
//		  ResponseEntity<String>responseEntity = rt.getForEntity(url, String.class); //This line will store json response into string variable
//		  String body = responseEntity.getBody();
//		 
//		  System.out.println(body);
//		 
//		  	
//		 ResponseEntity<QuoteResponse> forEntity = rt.getForEntity(url, QuoteResponse.class);//Quote-API will give json response That json will be converted into Quote response object at client side
//		 QuoteResponse body = forEntity.getBody();
		 
//		 System.out.println(body);
		 
	}
}
