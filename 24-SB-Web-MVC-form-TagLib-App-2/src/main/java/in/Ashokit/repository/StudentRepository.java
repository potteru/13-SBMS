package in.Ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Ashokit.bindings.Student;

public interface StudentRepository extends JpaRepository<Student, Serializable> {

	
}
