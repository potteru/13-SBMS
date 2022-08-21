package in.Ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import in.Ashokit.entity.Student;
import in.Ashokit.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		
		//List<Student> students = studentRepository.findAll();
		
		//List<Student> students = studentRepository.findAll(Sort.by("studentAge").ascending());
		
		/*Student student = new Student();
		student.setStudentAge(20);
		List<Student> students = studentRepository.findAll(Example.of(student));
		*/
		
		int page = 1;
		Page<Student> pagable = studentRepository.findAll(PageRequest.of(page -1, 2));
		List<Student> students = pagable.getContent();
		
		for(Student s : students) {
			System.out.println(s);
		}
		
		
	
	}

}
