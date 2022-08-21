package in.Ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Ashokit.entity.Student;
import in.Ashokit.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		
	//	List<Student> students = studentRepository.getStudentsByAge(20);
		
		/*List<Student> students = studentRepository.getStudents();
		
		for(Student student : students) {
			System.out.println(student);
		}*/
		
		
		//studentRepository.deleteStudentByAge(20);
		
		
	}
}
