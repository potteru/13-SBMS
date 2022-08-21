package in.Ashokit;

import java.util.Arrays;
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
		//Student student = studentRepository.findByStudentAge(20);// for single matching
		//System.out.println(student);
		//List<Student> students = studentRepository.findByStudentAge(20);
		
		//List<Student> students = studentRepository.findByStudentAgeGreaterThanEqual(20);
		//List<Student> students = studentRepository.findByStudentAgeLessThanEqual(19);
		
	//	List<Student> students = studentRepository.findByStudentAgeIn(Arrays.asList(20,30));
		 
		// If data base matched then only we will out put
		//List<Student> students = studentRepository.findByStudentNameAndStudentAge("shiva", 32);
		
		List<Student> students = studentRepository.findByStudentNameOrStudentAge("shiva", 30);
		
		for(Student student : students) {
			System.out.println(student);
		}
	}
}
