package in.Ashokit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.Ashokit.bindings.Customer;
import in.Ashokit.service.CustomerService;

@RestController
public class CustomerRestController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping(value = "/customer",
				consumes = { MediaType.APPLICATION_JSON,
							 MediaType.APPLICATION_XML
							})
	public String addCustomer(@RequestBody List<Customer> customers) {
		
	return customerService.add(customers);	
	}

}
