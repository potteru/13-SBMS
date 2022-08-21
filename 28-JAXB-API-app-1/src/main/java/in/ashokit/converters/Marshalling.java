package in.ashokit.converters;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import in.ashokit.bindings.Address;
import in.ashokit.bindings.Student;

public class Marshalling {
	
	public static void main(String[] args) throws JAXBException {
		
		Address addr = new Address("atp","ap","india");
		Student student = new Student();
		student.setStudentId(10);
		student.setStudentName("adimurthy");
		student.setStudentAge(30);
		student.setStudentRank(5);
		student.setAddress(addr);
		
		JAXBContext context = JAXBContext.newInstance(Student.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(student,System.out);
	}
}
