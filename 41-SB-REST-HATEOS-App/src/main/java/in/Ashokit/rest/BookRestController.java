package in.Ashokit.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.Ashokit.bindings.Book;

@RestController
public class BookRestController {
	
	@GetMapping(value = "/book/{isbn}", produces = "application/json")
	public Book getBookInfo(@PathVariable("isbn") String isbn) {
		// logic
		Book b = new Book(isbn,"spring",500.00,"Author");
		Link withRel = WebMvcLinkBuilder.linkTo(
						WebMvcLinkBuilder.methodOn(BookRestController.class)
						.getAllBooks())
						.withRel("All-Books");
		b.add(withRel);
		return b;
	}
	@GetMapping(value="/books",produces = "application/json")
	private List<Book> getAllBooks() {
		Book b1 = new Book("ISBN001","spring",400.00,"Author");
		Book b2 = new Book("ISBN002","spring",600.00,"Author");
		Book b3 = new Book("ISBN003","spring",800.00,"Author");
		List<Book> books = Arrays.asList(b1,b2,b3);
		return books;
	}
}
