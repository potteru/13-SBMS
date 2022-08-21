package in.Ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Ashokit.beans.Car;
import in.Ashokit.beans.Engine;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		Car car = context.getBean(Car.class);
		Car car1 = context.getBean(Car.class);
		Engine eng = context.getBean(Engine.class);
		Engine eng1 = context.getBean(Engine.class);
		System.out.println(car.hashCode());
		System.out.println(car1.hashCode());
		
		System.out.println(eng.hashCode());
		System.out.println(eng1.hashCode());
		
		
	}
}
