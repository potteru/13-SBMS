package in.Ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Ashokit.dao.UserDao;

@Service
public class UserService {
	public UserService() {
		System.out.println("-----User service constructor-----");
	}
	
	@Autowired
	private UserDao userDao;

	public void saveUser() {
		String status = userDao.saveUser("aadi","aadi@gmail.com",1234567890);
		System.out.println(status);
	}
	
}
