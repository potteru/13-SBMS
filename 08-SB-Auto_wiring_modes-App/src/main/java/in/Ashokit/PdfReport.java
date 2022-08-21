package in.Ashokit;

import org.springframework.stereotype.Component;

@Component("pdf")
public class PdfReport implements IReport {

	@Override
	public void generateReport() {
		System.out.println("--Pdf reprt generated--");
	}
}
