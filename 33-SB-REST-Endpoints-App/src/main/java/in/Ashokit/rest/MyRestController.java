
package in.Ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api1")
public class MyRestController {
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welComeMsg(){
		String msg = "Welcome to AshokIt!";
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/greet")
	public ResponseEntity<String> greetMsg(){
		String msg = "Good Morning !";
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
}
