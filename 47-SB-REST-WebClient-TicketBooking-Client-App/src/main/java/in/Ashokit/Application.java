package in.Ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Ashokit.service.TicketBookingClientService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		
		TicketBookingClientService ticketBookingClientService = applicationContext.getBean(TicketBookingClientService.class);
		ticketBookingClientService.invokTicketBookingApi();
		
	}

}
