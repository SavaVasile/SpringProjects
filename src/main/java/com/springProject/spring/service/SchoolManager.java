package com.springProject.spring.service;

import com.springProject.spring.model.School;
import com.springProject.spring.model.Student;
import com.springProject.spring.repositories.SchoolRepository;
import com.springProject.spring.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class SchoolManager {
    @Autowired
    private SchoolRepository schoolRepository;
    @Autowired
    private StudentRepository studentRepository;

    public SchoolRepository getSchoolRepository() {
        return schoolRepository;
    }

    public void setSchoolRepository(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void saveData() {

        Student student = new Student();

        student.setCnp("195213032190");
        student.setName("BlaBla");

        Student student2 = new Student();

        student2.setCnp("195210998190");
        student2.setName("BlaBla31");
        School school = new School();

        school.setAddress("str. Stanga dupa Dreapta");
        school.setName("Bla School");

        School school2 = new School();

        school2.setAddress("str. Dreapta dupa Stanga");
        school2.setName("BlaBla School");

        schoolRepository.save(school);
        schoolRepository.save(school2);

        studentRepository.save(student);
        studentRepository.save(student2);
    }

    public void saveAll(List<Student> readStudents) {
        studentRepository.saveAll(readStudents);
    }

   /* public void saveAllSchools(List<School> readSchools) {
        schoolRepository.saveAll(readSchools);
    }*/
}
