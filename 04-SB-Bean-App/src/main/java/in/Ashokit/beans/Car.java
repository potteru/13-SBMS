package in.Ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	public Car() {
		System.out.println("***** Car Calss Constructor :: **********");
	}
	private Engines engine;
	@Autowired
	public void setEng(Engines eng) {
		System.out.println("*****setEng() method called ");
		this.engine=eng;
	}
	
	public void drive() {
		//Engines engine = new Engines();// this is not recommended bcz tightly coupling
		int start = engine.start();
		if(start >= 0) {
			System.out.println("Engine started and journey started");
		}
		else {
			System.out.println("Engine have some trouble!");
		}
	}

}
