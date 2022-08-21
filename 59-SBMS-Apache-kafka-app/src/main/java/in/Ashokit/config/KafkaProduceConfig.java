package in.Ashokit.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.kafka.connect.json.JsonSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import in.Ashokit.bindings.Customer;
import in.Ashokit.util.KafkaConstants;

@Configuration
@EnableKafka
public class KafkaProduceConfig {
	
	//This method is used to kafka producer config details
	//@return
	@Bean
	public ProducerFactory<String, Customer> producerFactory(){
		
		Map<String,Object> configProperties = new HashMap<String,Object>();
		configProperties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, KafkaConstants.HOST);
		configProperties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		configProperties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		
		return new DefaultKafkaProducerFactory<>(configProperties);
	}
	
	// This method is used to create kafkaTemplate bean object
	// @return
	@Bean(name = "KafkaTemplate")
	public KafkaTemplate<String, Customer> kafkaTemplate(){
		
		return new KafkaTemplate<>(producerFactory());
	}

}
