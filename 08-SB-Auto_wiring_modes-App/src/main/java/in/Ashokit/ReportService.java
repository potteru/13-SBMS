package in.Ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
	@Autowired
	@Qualifier("Excel")
	private IReport reportGenerator1;
	
	@Autowired
	@Qualifier("pdf")
	private IReport reportGenerator2;
	
	public void excelreport() {
		reportGenerator1.generateReport();
	}
	public void pdfreport() {
		reportGenerator2.generateReport();
	}

}
