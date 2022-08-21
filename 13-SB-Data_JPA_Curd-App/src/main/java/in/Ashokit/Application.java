package in.Ashokit;

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
		//System.out.println(studentRepository.getClass());
		
		Student student = new Student(102,"Shiva","shiva@gmail.com",34);
		studentRepository.save(student);
		
		System.out.println("Record inserted ....!");
		
	}

}
