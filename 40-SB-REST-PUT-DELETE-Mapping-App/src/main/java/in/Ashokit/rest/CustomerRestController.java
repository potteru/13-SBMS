package in.Ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
	
	@PutMapping("/customer/{cid}")
	public ResponseEntity<String> updateCustomer(@PathVariable Integer cid){
		// customer update logic
		String msg = " Customer record updated succesfully";
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	@DeleteMapping("/customer/{cid}")
	public ResponseEntity<String> deleteCustomer(Integer cid){
		// logic to delete customer
		
		String msg = "Customer deleted succesfully";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}

}
