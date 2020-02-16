package com.springProject.spring.repositories.impl;

import com.springProject.spring.model.Student;
import org.springframework.stereotype.Repository;
import com.springProject.spring.repositories.StudentRepository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class DefaultStudentRepository extends DefaultRepository<Student> implements StudentRepository  {


    @Override
    public Student findByFirstName() {
        return null;
    }

    public Student findByCnp(String cnp) {
        for (Student s : entityList) {
            if (s.getCnp().equals(cnp)) {
                return s;
            }
        }
        return null;
    }



}
