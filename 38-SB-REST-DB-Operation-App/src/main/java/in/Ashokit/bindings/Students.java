package in.Ashokit.bindings;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import in.Ashokit.entity.Student;
import lombok.Data;

@Data
@XmlRootElement
public class Students {
	
	private List<Student> students;

}
