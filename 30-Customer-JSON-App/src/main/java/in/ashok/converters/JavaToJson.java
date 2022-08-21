package in.ashok.converters;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashok.bindings.Address;
import in.ashok.bindings.Customer;
import in.ashok.bindings.InsurencePolicy;

public class JavaToJson {
	
	public static void main(String[] args) throws Exception {
		
		InsurencePolicy policy = new InsurencePolicy("Jivan anand","20-feb-2022", "20-feb-2022", 50000.0);
		
		Address addr = new Address("atp", "ap", "India");
		Customer customer = new Customer(101, "mahesh", "acb@gmail.com", 30, policy,addr);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"), customer);
		
		System.out.println("**** Object converted to json successfulle ****");
		
	}

}
