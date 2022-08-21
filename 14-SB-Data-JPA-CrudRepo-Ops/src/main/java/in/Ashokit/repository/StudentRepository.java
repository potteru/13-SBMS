package in.Ashokit.repository;

import org.springframework.data.repository.CrudRepository;

import in.Ashokit.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
