package in.Ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Ashokit.entity.InsurancePlan;

public interface InsurancePlanRepository extends JpaRepository<InsurancePlan, Serializable> {
	

}
