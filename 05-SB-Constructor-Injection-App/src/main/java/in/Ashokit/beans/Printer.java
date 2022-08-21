package in.Ashokit.beans;

import org.springframework.stereotype.Component;

@Component
public class Printer {
	
	public Printer() {
		System.out.println("------printer constructor ---------");
	}
	public void print() {	
		System.out.println("-------Document printing -----------");
	}
}
