package in.Ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeResources {
	
	public WelcomeResources() {
		System.out.println("Welcome Resource :: Constructor");
	}
	@GetMapping("/welcome")
	public ResponseEntity<String> welcomeMsg(){
		String responsemessage = "Welcome to India";
		return new ResponseEntity<>(responsemessage,HttpStatus.OK);
	}
}
