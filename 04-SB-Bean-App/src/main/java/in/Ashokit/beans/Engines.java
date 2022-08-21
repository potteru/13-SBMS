package in.Ashokit.beans;

import org.springframework.stereotype.Component;

@Component
public class Engines {
	
	public Engines() {
		System.out.println("****Engine class constructor :: *****");
	}
	public int start() {
		// some logic
		return 0;
	}

}
