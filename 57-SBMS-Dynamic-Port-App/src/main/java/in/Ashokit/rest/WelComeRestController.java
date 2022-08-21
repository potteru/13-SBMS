package in.Ashokit.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelComeRestController {
	@Autowired
	private Environment env;
	
	@GetMapping("/welcome")
	public String getWelComeMsg() {
		String portnumber = env.getProperty("server.port");
		String response = "Welcome to Ashok it :: Request processed By Server ,Rrunning on port: "+portnumber;
		return response;
		
	}

}
