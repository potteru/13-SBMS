package in.Ashokit;

import org.springframework.stereotype.Component;

@Component("Excel")
public class ExcelReport implements IReport{

	@Override
	public void generateReport() {
		System.out.println("--Excel Report generated--");
	}
}
