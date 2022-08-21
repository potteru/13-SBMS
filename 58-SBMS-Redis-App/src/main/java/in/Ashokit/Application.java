package in.Ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import in.Ashokit.bindings.User;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Bean
	public JedisConnectionFactory jedisConnectionFactory() {
		
		JedisConnectionFactory factory = new JedisConnectionFactory();
		// redis server connection properties
		return factory;
	}
	@Bean
	public RedisTemplate<String, User>  getRedisTemplate(){
		RedisTemplate<String, User> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(jedisConnectionFactory());
		return redisTemplate;
		
	}

}
