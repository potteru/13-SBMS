package in.Ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Ashokit.entity.InsurancePlan;
import in.Ashokit.repository.InsurancePlanRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		InsurancePlan plan =new InsurancePlan("Jeevan Annand",58000.00);
		InsurancePlanRepository planRepository = context.getBean(InsurancePlanRepository.class);
		planRepository.save(plan);
		
		System.out.println("Plan Inserted ...!");

	}

}
