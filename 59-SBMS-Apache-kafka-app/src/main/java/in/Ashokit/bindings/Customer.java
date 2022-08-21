package in.Ashokit.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement(name = "customer")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Customer {
	
	private Integer customerId;
	private String customerName;
	private String customerEmail;
	
	public Customer() {
		
	}

}
