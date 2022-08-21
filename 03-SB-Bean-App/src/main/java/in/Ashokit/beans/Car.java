package in.Ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private Engines engine;
	@Autowired
	public void setEng(Engines eng) {
		System.out.println("*****setEng() method called ");
		this.engine=eng;
	}
}


