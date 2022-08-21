package in.Ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Entity
@Table(name="STUDENT_DTLS")
@Data
@XmlRootElement
public class Student {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="STUDENT_ID")
	private Integer sid;
	
	@Column(name="STUDENT_NAME")
	private String sname;
	
	@Column(name="STUDENT_EMAIL")
	private String semail;
	
	@Column(name="STUDENT_AGE")
	private Integer sage;

}
