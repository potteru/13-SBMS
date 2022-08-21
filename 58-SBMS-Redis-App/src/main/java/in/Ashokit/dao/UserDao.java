package in.Ashokit.dao;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import in.Ashokit.bindings.User;

@Repository
public class UserDao {
	
	private HashOperations<String, String, User> hashOps;
	
	public UserDao(RedisTemplate<String, User> redisTemplate) {
	 hashOps = redisTemplate.opsForHash();
		
	}
	public void saveUser(User user) {
		hashOps.put("USER", user.getId(), user);
	}
	public User GetUserById(String userId) {
		return hashOps.get("USER", userId);
	}

}
