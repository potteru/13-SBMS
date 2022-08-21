package in.Ashokit.rest;

import java.util.StringJoiner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.Ashokit.client.WelcomeServiceClient;

@RestController
public class GreetRestController {
	@Autowired
	private WelcomeServiceClient welcomeServiceClient;
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		String string = "Good  Morning ....!!!";
		String string2 = welcomeServiceClient.invokServiceMsg();//it is communicating 50-SBMS-EUREKA-Client-one app and Invoking MESSAGE_SERVICE
		
		StringJoiner joiner =new StringJoiner(",");
		joiner.add(string);
		joiner.add(string2);
		return joiner.toString();
		
	}

}
