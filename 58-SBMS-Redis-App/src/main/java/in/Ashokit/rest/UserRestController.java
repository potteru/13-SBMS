package in.Ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import in.Ashokit.bindings.User;
import in.Ashokit.dao.UserDao;

@RestController
public class UserRestController {
	
	@Autowired
	private UserDao userDao;
	
	@PostMapping("/user")
	public String saveUser(@PathVariable User user) {
		userDao.saveUser(user);
		return "success";
	}
	@GetMapping("/user/{userid}")
	private User getUser(String userId) {
		return userDao.GetUserById(userId);
		
	}

}
