package in.Ashokit.rest;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataRestController {
	
	@GetMapping("/data")
	@HystrixCommand(fallbackMethod="getDataFromDatabase", 
					commandsProperties = {
							@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = 5),
							@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = 10000),
							@HystrixProperty(name = "circuitBreaker.enabled", value = "true")
					})
	public String getDataFromRedis() {
		// logic to get data from Redis 
		if(new Random().nextInt(10) <=10) {
			throw new RuntimeException("Redis Server is down....");	
		}	
		return "data accessed from Redis ....";
	}
	public String getDataFromDatabase() {	
		//logic to get data from database
		return "Data recevived from DataBase....";
	}
}
