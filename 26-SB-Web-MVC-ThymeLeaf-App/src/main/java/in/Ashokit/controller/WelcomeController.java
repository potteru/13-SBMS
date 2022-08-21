package in.Ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg(Model model) {
		
		String msgtx = "Welcome to Ashokit...!";
		model.addAttribute("msg", msgtx);
		return "index";
	}

}
