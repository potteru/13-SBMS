package in.Ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {

	@GetMapping("/course")
	public ResponseEntity<String> getCourseDetails(@RequestParam("name") String name){
		String msg;
		if("SBMS" .equals(name)) {
			msg = name + " Will start in october 3rd ";
		}
		else if("JRTP".equals(name)) {
			msg = name + " Will start in February 20 ";
		}
		else {
			msg = name + " Please Contact +91 1234567890 for more details";
		}
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
}
