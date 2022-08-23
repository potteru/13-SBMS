package in.Ashokit.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcomeMsg(@RequestParam("name") String name, Model model) {
		String msgTxt = name + ", Welcome to Ashok IT..!!";
		model.addAttribute("msg", msgTxt);
		return "index";
	}
}
