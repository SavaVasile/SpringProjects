package com.springProject.spring.repositories;

import com.springProject.spring.model.Student;

public interface StudentRepository extends Repository<Student> {

    Student findByFirstName();

    Student findByCnp(String cnp);

    @Override
    Student findById(int id);

    @Override
    void modify(Student student);

    @Override
    void create(Student student);

    @Override
    void delete(Student student);
}
