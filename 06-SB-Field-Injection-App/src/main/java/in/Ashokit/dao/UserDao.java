package in.Ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public UserDao() {
		System.out.println("-----Dao calss Constructor----");
	}
	public String saveUser(String string, String string2, int i) {

		return "User saved";
	
	}
}
