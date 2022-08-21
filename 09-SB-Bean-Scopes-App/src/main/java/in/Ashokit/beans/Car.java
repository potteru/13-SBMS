package in.Ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	private Engine eng;
	
	@Autowired
	private Engine eng1;
	
	public Car() {
		System.out.println("---Car Constructor---");
	}
}
