package in.Ashokit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelComeRestController {
	
	private Logger logger = LoggerFactory.getLogger(WelComeRestController.class);
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		logger.info("WelcomeMsg() method execution started ");
		String msg = "Welcome to Ashok it ...!";
		logger.info("WelcomeMsg() execution ended ");
		return msg;
	}

}
