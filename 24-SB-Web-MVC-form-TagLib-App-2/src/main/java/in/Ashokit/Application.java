package in.Ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Ashokit.bindings.Student;
import in.Ashokit.controller.StudentController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StudentController studentController = context.getBean(StudentController.class);
		Student student = new Student();
		studentController.saveStudent(student,null);
		
	}

}
