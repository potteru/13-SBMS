package in.Ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "INSURENCE_PLANS")
public class InsurancePlan {
	
	@Id
	@SequenceGenerator(name = "plan_seq", sequenceName = "paln_id_seq",allocationSize = 1)
	@GeneratedValue(generator = "plan_seq", strategy = GenerationType.SEQUENCE)
	@Column(name = "PLAN_ID")
	private Integer planId;
	
	@Column(name = "PLAN_NAME")
	private String planName;
	
	@Column(name = "PLAN_AMT")
	private Double premiumAmt;
	
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate createdDate;
	
	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDate updatedDate;
	
	
	public InsurancePlan() {

	}

	public InsurancePlan(String planName, Double premiumAmt) {
		super();
		this.planName = planName;
		this.premiumAmt = premiumAmt;
	}

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Double getPremiumAmt() {
		return premiumAmt;
	}

	public void setPremiumAmt(Double premiumAmt) {
		this.premiumAmt = premiumAmt;
	}

	@Override
	public String toString() {
		return "InsurancePlan [planId=" + planId + ", planName=" + planName + ", premiumAmt=" + premiumAmt + "]";
	}
	
}
