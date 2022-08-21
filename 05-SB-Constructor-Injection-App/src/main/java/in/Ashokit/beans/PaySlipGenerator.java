package in.Ashokit.beans;

import org.springframework.stereotype.Component;

@Component
public class PaySlipGenerator {
	private Printer printer;
	public PaySlipGenerator(Printer printer) {
		System.out.println("------Payslip generator constructor----------");
		this.printer=printer;
	}
	public void generatePayslip() {	
		//  get the details from data base and print
		printer.print();
	}
}
