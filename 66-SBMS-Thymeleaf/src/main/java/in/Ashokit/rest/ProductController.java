package in.Ashokit.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.Ashokit.bindings.Product;

@Controller
public class ProductController {
	
	@GetMapping("/product")
	public ModelAndView loadForm() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("product", new Product());
		mav.setViewName("productView");
		return mav;
	}
	@PostMapping("/product")
	public ModelAndView handleSubmitBtn(Product product) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("successView");
		return mav;
	}
}