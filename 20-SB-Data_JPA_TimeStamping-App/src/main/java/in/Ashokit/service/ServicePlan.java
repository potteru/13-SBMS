package in.Ashokit.service;

import org.springframework.stereotype.Service;

import in.Ashokit.entity.InsurancePlan;
import in.Ashokit.repository.InsurancePlanRepository;
@Service
public class ServicePlan {
	
	private InsurancePlanRepository planRepo;
	
	public void savePlan(){
		
		InsurancePlan plan = new InsurancePlan();
		plan.setPlanName("SNAP");
		plan.setPremiumAmt(50000.00);
		planRepo.save(plan);
	}
}
