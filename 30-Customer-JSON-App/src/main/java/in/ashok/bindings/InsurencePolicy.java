package in.ashok.bindings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsurencePolicy {
	
	private String policyName;
	private String startDate;
	private String endDate;
	private Double premiumamt;
	
}
