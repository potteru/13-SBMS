package in.Ashokit.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import in.Ashokit.request.Book;
import io.swagger.annotations.ApiOperation;

@RestController
public class BookRestController {
	@ApiOperation(value = "This method is used to add book into data base")
	@PostMapping(value = "/book",consumes={"application/json"})
	public String addBook(Book book) {
		System.out.println(book);
		return "Success!";
		
	}
}
