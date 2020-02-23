package com.springProject.spring.repositories;
import com.springProject.spring.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findByCnp(String cnp);
    List<Student>findByName(String name);
    List<Student>findById(int id);

}
