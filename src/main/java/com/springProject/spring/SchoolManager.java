package com.springProject.spring;

import com.springProject.spring.model.School;
import com.springProject.spring.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.springProject.spring.repositories.SchoolRepository;
import com.springProject.spring.repositories.StudentRepository;


@Component
public class SchoolManager {

    private final SchoolRepository schoolRepository;
    private final StudentRepository studentRepository;
    @Autowired
    public SchoolManager(SchoolRepository schoolRepository, StudentRepository studentRepository) {
        this.schoolRepository = schoolRepository;
        this.studentRepository = studentRepository;
    }

    public void saveData() {
        Student student = new Student();
        student.setId(1);
        student.setCnp("195213032190");
        student.setFirstName("Bla");
        student.setLastName("BlaBla");

        Student student2 = new Student();
        student.setId(2);
        student.setCnp("195210998190");
        student.setFirstName("Bla2");
        student.setLastName("BlaBla31");
        School school = new School();
        school.setId(1);
        school.setAddress("str. Stanga dupa Dreapta");
        school.setName("Bla School");

        School school2 = new School();
        school.setId(2);
        school.setAddress("str. Dreapta dupa Stanga");
        school.setName("BlaBla School");

        schoolRepository.create(school);
        schoolRepository.create(school2);
        studentRepository.create(student);
        studentRepository.create(student2);
    }
}
