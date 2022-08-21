package in.Ashokit.properties;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
//@Data
@ConfigurationProperties(prefix = "myapp")
@EnableConfigurationProperties
@Configuration
public class AppProperties {
	
	private Map<String,String> messages = new HashMap<>();

	public AppProperties() {

	}
	
	public AppProperties(Map<String, String> messages) {
		super();
		this.messages = messages;
	}

	public Map<String, String> getMessages() {
		return messages;
	}

	public void setMessages(Map<String, String> messages) {
		this.messages = messages;
	} 
	
	

}
