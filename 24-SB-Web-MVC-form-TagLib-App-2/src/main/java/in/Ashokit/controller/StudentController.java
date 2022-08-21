package in.Ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.Ashokit.bindings.Student;
import in.Ashokit.repository.StudentRepository;
@Repository
@Controller
public class StudentController {
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/student")
	public String loadForm(Model model) {
		Student studentobj = new Student();
		model.addAttribute("student", studentobj);
		return "index";
	}
	@PostMapping("/saveStudent")
	public String saveStudent(Student student,Model model) {
		//System.out.println(student);
		studentRepository.save(student);	
	return "success";
	}

}
