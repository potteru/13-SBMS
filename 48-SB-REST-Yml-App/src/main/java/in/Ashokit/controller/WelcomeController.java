package in.Ashokit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.Ashokit.properties.AppProperties;

@RestController
public class WelcomeController {
//	
//	@Value("${messages.welcomeMsg}")
//	private String welcomeMsg;
	
	@Autowired
	private AppProperties properties;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		Map<String, String> messages = properties.getMessages();
		String string = messages.get("welcomeMsg");
		return string;
	}
	@GetMapping("/greet")
	public String getGreetMsg() {
		Map<String, String> messages = properties.getMessages();
		String string = messages.get("greetMsg");
		return string;
		
	}

}
