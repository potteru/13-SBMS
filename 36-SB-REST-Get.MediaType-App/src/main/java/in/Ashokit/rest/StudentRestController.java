package in.Ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.Ashokit.response.Student;
import in.Ashokit.student.StudentService;

@RestController
public class StudentRestController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping(value = {"/student"},produces = {"application/json","application/xml"})
	public ResponseEntity<Student> getStudent(){
		Student student = studentService.getStudent();
		return  new ResponseEntity<Student>(student,HttpStatus.OK);
	}
}
