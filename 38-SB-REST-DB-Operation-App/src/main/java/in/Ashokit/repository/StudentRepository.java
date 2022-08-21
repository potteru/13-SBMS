package in.Ashokit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Ashokit.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> findBySageGreaterThanEqual(Integer sage);
	

}
