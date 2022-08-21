package in.ashok.converters;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashok.bindings.Customer;

public class JsonToJava {
	
	public static void main(String[] args) throws IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		
		Customer customer = mapper.readValue(new File("customer.json"), Customer.class);
		System.out.println("*** Json to Java object converted successfully ***");
		System.out.println(customer);
	}

}
