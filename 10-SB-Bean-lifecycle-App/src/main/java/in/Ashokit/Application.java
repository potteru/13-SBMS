package in.Ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Ashokit.beans.ConnectionPoolManager;
import in.Ashokit.beans.Motor;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		Motor motor = context.getBean(Motor.class);
		motor.doWork();
		
		ConnectionPoolManager cpm = context.getBean(ConnectionPoolManager.class);
		cpm.getConnection();
	}
}
