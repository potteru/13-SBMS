package in.ashok.bindings;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	
	@JsonProperty("cId")
	private Integer customerId;
	
	@JsonProperty("cName")
	private String customerName;
	
	@JsonProperty("cEmail")
	private String customerEmail;
	
	@JsonProperty("cAge")
	private Integer customerAge;
	
	private InsurencePolicy policy;
	private Address address;

}
