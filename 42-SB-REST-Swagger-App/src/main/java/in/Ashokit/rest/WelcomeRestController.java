package in.Ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class WelcomeRestController {
	@ApiOperation(value = "This operation is used to generate msg",
					response = String.class)
	@GetMapping("/welcome/{name}")
	public String welcomeMsg(String name) {
		String msg = name+ "Good Morning...! ";
		return msg;
	}
	
}
