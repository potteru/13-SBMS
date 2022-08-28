package in.Ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	
	@GetMapping("/home")
	public String home() {
		String msg = "Welcpome to Bank.....";
		return msg;
	}
	
	@GetMapping("/balance")
	public String getBalance() {
		String msg = "Your Balance is 123456 ....";
		return msg;
	}
	
	@GetMapping("/statement")
	public String getSTMT() {
		String msg = " Your Bank statement is ....";
		return msg;
	}
	
	@GetMapping("/myloan")
	public String getMyloan() {
		String msg = "Your loan Amount Balance is RS:4,50,000";
		return msg;
	}
	
	@GetMapping("/contact")
	public String getContact() {
		String msg = "Thankyou for contacting customer care we will get back you soon... ";
		return msg;
	}

}
