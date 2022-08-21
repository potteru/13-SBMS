package in.Ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.Ashokit.bindings.Book;

@Controller
public class BookController {
	
	@GetMapping("/book")
	public String loadForm(Model model) {
		Book bookobj = new Book();
		model.addAttribute("book",bookobj);
		return "index";
	}
	@PostMapping("/saveBook")
	public String handleSubmitBtn(Book book,Model model) {
		System.out.println(book);
		
		//db logic
		return "succes";
	}
}
