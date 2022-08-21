package in.Ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Ashokit.beans.Car;
import in.Ashokit.beans.Engines;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
//		Engines engines = context.getBean(Engines.class);
//		int start = engines.start();
//		System.out.println("Engine start status :: "+start);
		
		Car car = context.getBean(Car.class);
		car.drive();
	}

}