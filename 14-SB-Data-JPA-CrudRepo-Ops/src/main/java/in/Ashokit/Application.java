package in.Ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Ashokit.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		//System.out.println(studentRepository.getClass());
		/*
		 * Student student = new Student(121,"prasad","prasad@gmail.com",22); Student
		 * student1 = new Student(122,"rajendra","rajendra@gmail.com",24); Student
		 * student2 = new Student(123,"Kumar","kumar@gmail.com",20);
		 */
		//studentRepository.save(student);
		//List<Student> studentsList = Arrays.asList(student,student1,student2);
		
		//studentRepository.saveAll(studentsList);
		//System.out.println("Record inserted ....!");
		
		System.out.println("Record counts :: "+ studentRepository.count());
		
		//System.out.println("Student Record :: "+ studentRepository.findById(121));
		
		/*List<Integer>idslist = Arrays.asList(101,102,103);
		Iterable<Student> students = studentRepository.findAllById(idslist);
		
		for(Student student :students) {
			System.out.println(student);
		}*/
		
		System.out.println("Is student Record present :: ? = "+ studentRepository.existsById(121));
		studentRepository.deleteById(101);
		
		
	
	}

}
