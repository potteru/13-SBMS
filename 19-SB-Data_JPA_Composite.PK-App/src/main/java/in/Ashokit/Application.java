package in.Ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Ashokit.entity.Book;
import in.Ashokit.repository.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		/*
		 * Book b = new Book(); b.setBId(105); b.setIsbn("ISBN005");
		 * b.setPrice(1001.00);
		 * 
		 * BookRepository bookRepository = context.getBean(BookRepository.class);
		 * bookRepository.save(b); System.out.println("Record inserted ....!");
		 */
		
		Book b = new Book();
		b.setBId(102);
		b.setIsbn("ISBN002");
		b.setPrice(2000.45);
		BookRepository bookRepository = context.getBean(BookRepository.class);
		bookRepository.save(b);	
	}
}
