package in.Ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public String welComeMsg() {
		return "welcome to India......!!!!!!";
	}

}
