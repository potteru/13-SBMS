package in.Ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.Ashokit.response.QuoteResponse;
import in.Ashokit.service.QuoteClientService;

@RestController
public class QuoteRestController {
	@Autowired
	private QuoteClientService service;
	@GetMapping("/quote")
	public QuoteResponse getRandomQuote() {
		
		return service.invokeRandomQuoteApi();
	}
	

}
