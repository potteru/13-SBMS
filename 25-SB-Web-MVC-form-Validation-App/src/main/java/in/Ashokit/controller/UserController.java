package in.Ashokit.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.Ashokit.bindings.User;

@Controller
public class UserController {
	
	@GetMapping("/user")
	public String loadUserForm(Model model) {
		
		User userobj = new User();
		model.addAttribute(userobj);
		
		return "index";
	}
	
	@PostMapping("/saveUser")
	public String saveUser(@Valid User user,BindingResult result,Model model) {
		if(result.hasErrors()) {
			return"index";
		}
		System.out.println(user);
		model.addAttribute("msg", "User added Successfully....!");
		return "dashboard";
	}
	

}
