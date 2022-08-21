package in.Ashokit.bindings;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="STUDENT_REG")
public class Student {
	
	@Id
	@GeneratedValue
	private Integer sid;
	
	@Column(name = "STUDENT_NAME")
	private String name;
	
	@Column(name = "STUDENT_EMAIL")
	private String email;
	
	@Column(name = "STUDENT_PHONE")
	private Double phone;
	
	@Column(name = "STUDENT_GENDER")
	private String gender;
	
	@Column(name = "STUDENT_COURSE")
	private String course;

	@OrderColumn
	@ElementCollection
	@CollectionTable(name = "STUDENT_TIMINGS",joinColumns = @JoinColumn(name = "sid"))
	private String[] timings;
	

}
