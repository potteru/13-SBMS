package in.Ashokit.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Motor {
	
	public Motor() {
		System.out.println("*** Motor constructor ***");
	}
	@PostConstruct
	public void start() {
		System.out.println("*** Motor started ***");
	}
	public void doWork() {
		System.out.println("*** do work method ***");	
	}
	@PreDestroy
	public void stop() {
		System.out.println("*** Motor stopped ***");
	}
}
