package in.Ashokit.rest;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {
	@GetMapping("/course/{name}")
	public ResponseEntity<String> getcourseInfo(@PathVariable String name){
		String msg = null;
		if("SBMS".equals(msg)){
			msg = name + "will start in october 3rd ";
		}
		else if("JRTP".equals(msg)) {
			msg = name + "JRTP will start on february 14th ";
		}
		else {
			msg = "Please contact admin for more information "+name;
		}
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/course/{name}/{mode}")
	public ResponseEntity<String> getcourseDetails(@PathVariable String name,@PathVariable String mode){
		
		System.out.println(mode);
		System.out.println("Get course details(): called ");
		
		String msg = null;
		if("SBMS".equals(name) && "online".equals(mode)){
			msg = name + "will start in october 3rd ";
		}
		else if("JRTP".equals(name)) {
			msg = name + "JRTP will start on february 14th ";
		}
		else {
			msg = "Please contact admin for more information "+name;
		}
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
}
