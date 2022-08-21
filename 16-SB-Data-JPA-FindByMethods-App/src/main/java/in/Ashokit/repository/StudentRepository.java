package in.Ashokit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.Ashokit.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
		
	// select * from student_dtls where student_age = age
	public Student findByStudentAge(Integer age);// for single matched data
	
	// select * from student_dtls where student_age = age
	//public List<Student> findByStudentAge(Integer age);
	
	//select * from student_dtls where student_age >=20;
	public List<Student> findByStudentAgeGreaterThanEqual(Integer age);
	
	//select * from student_dtls where student_age <= 19;
   public List<Student> findByStudentAgeLessThanEqual(Integer age);
	
	//select * from student_dtls where student_age in (20,30);
	public List<Student> findByStudentAgeIn(List<Integer> age);
	
	//select * from student_dtls where student_name = "shiva" and student_age = 32;
	public List<Student> findByStudentNameAndStudentAge(String name,Integer age);
	
	//select * from student_dtls where student_name = "shiva" or student_age = 32;
	public List<Student> findByStudentNameOrStudentAge(String name,Integer age);
	
}
