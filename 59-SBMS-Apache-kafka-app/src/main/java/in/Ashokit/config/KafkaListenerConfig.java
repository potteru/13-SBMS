package in.Ashokit.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.connect.json.JsonDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import in.Ashokit.bindings.Customer;
import in.Ashokit.util.KafkaConstants;

@Configuration
public class KafkaListenerConfig {
	@Bean
	public ConsumerFactory<String, Customer>consumerFactory(){
		Map<String, Object> properties = new HashMap<>();
		properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, KafkaConstants.HOST);
		properties.put(ConsumerConfig.GROUP_ID_CONFIG, KafkaConstants.GROUP_ID);
		properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		
		return new DefaultKafkaConsumerFactory<>(properties,new StringDeserializer(),new JsonDeserializer());)
	}
	
	@Bean
	public ConcurentKafkaListenerContainerFactory<String,Customer> kafkaListenerContainerFactory(){
		
		ConcurentKafkaListenerContainerFactory<String,Customer> factory = new ConcurentKafkaListenerContainerFactory();
		factory.setConsumerFactory(consumerFactory());
		return factory;
		
		
	}

}
