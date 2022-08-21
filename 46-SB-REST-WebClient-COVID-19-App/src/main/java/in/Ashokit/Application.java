package in.Ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Ashokit.service.Covid19Service;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		Covid19Service covid19Service = context.getBean(Covid19Service.class);
		covid19Service.getCovid19Data();
	}

}
