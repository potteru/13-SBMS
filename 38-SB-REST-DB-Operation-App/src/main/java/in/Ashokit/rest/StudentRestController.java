package in.Ashokit.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.Ashokit.bindings.Students;
import in.Ashokit.entity.Student;
import in.Ashokit.repository.StudentRepository;

@RestController
public class StudentRestController {
	@Autowired
	private StudentRepository studentrepo;

	@PostMapping(value = "/add-student", consumes = { "application/json", "application/xml" })
	public ResponseEntity<String> addStudent(@RequestBody Student student) {
		String msg = null;
		Student save = studentrepo.save(student);
		if (save.getSid() != null) {
			msg = "Student saved ";
		} else {
			msg = "Failed to Save!";
		}
		return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}

	@GetMapping(value = "/student/{sId}", produces = { "application/json", "aplication/xml" })
	public ResponseEntity<Student> getStudentById(@PathVariable Integer sId) {

		Optional<Student> findById = studentrepo.findById(sId);
		if (findById.isPresent()) {
			Student student = findById.get();
			return new ResponseEntity<>(student, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping(value = "/student", produces = { "application/xml", "application/json" })
	public ResponseEntity<Students> getStudentByAge(@RequestParam Integer sage) {
		
		List<Student> studentsList = studentrepo.findBySageGreaterThanEqual(sage);
		
		Students students = new Students();
		students.setStudents(studentsList);
		return new ResponseEntity<>(students, HttpStatus.OK);

	}
}
