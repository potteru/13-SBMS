package in.Ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.KafkaListeners;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import in.Ashokit.bindings.Customer;
import in.Ashokit.util.KafkaConstants;

@Service
public class CustomerService {
	
	// This method is Publish the messages to Topic
	@Autowired
	private KafkaTemplate<String, Customer> kafkaTemplate;
	
	public String add(List<Customer> customers) {
		
		if(!customers.isEmpty) {
			for(Customers c : customers) {
				kafkaTemplate.se
				System.out.println("*********** Msg published to kafka Topic *************");
			}
		}
		return "Customer Record added to kafka Queue Successfully";
		
	}
	
	//This message is used to consumer messages from kafka topic
	//@Param
	//@return
	
	@KafkaListeners(topics = KafkaConstants.TOPIC, groupId = KafkaConstants.GROUP_ID, value = { @KafkaListener })
	public Customer listener(Customer c) {
		System.out.println("**** Message Received from Kafka Topic :: "+c);
		return c;
	}

}
