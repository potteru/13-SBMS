package in.Ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_DTLS")
public class Student {
	
	@Id
	@Column(name="STUDENT_ID")
	private Integer student_id;
	
	@Column(name="STUDENT_NAME")
	private String student_name;

	@Column(name="STUDENT_EMAIL")
	private String student_email;
	
	@Column(name="STUDENT_AGE")
	private Integer student_age;
	
	public Student() {

	}

	public Student(Integer student_id, String student_name, String student_email, Integer student_age) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_email = student_email;
		this.student_age = student_age;
	}

	public Integer getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_email() {
		return student_email;
	}

	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}

	public Integer getStudent_age() {
		return student_age;
	}

	public void setStudent_age(Integer student_age) {
		this.student_age = student_age;
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_email="
				+ student_email + ", student_age=" + student_age + "]";
	}
	

}
