package in.Ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SuppressWarnings("deprecation")
@SpringBootApplication
//@EnableHystrix
@EnableCircuitBreaker
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
