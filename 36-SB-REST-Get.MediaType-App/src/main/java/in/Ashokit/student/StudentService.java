package in.Ashokit.student;

import org.springframework.stereotype.Service;

import in.Ashokit.response.Student;

@Service
public class StudentService {
	
	public Student getStudent() {
		Student student = new Student(102,"aadi","aadi@gmail.com");
		return student;
	}

}
