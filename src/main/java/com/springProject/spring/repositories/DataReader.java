package com.springProject.spring.repositories;

import com.springProject.spring.model.School;
import com.springProject.spring.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class DataReader {

    public List<Student> readStudents() {
        Scanner scanner = new Scanner(System.in);
        int studentCount = scanner.nextInt();

        List<Student> result = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            /*System.out.println("Enter name: ");
            String studentName = scanner.next();
            System.out.println("Enter CNP: ");
            String cnp = scanner.next();*/
            result.add(Student.newStudent()
                    .cnp("2141241241424")
                    .email("myEmail@gmail.com")
                    .name("Name")
                    .gender("Male")
                    .age(24).build());
            /*Student student = new Student();
            student.setName(studentName);
            student.setCnp(cnp);
            result.add(student);*/
        }
        return result;

    }

    /*public List<School> readSchools() {
        Scanner scanner = new Scanner(System.in);
        int schoolCount = scanner.nextInt();

        List<School> schools = new ArrayList<>();
        for (int i = 0; i < schoolCount; i++) {
            System.out.println("Enter name: ");
            String schoolName = scanner.next();
            System.out.println("Enter Address: ");
            String address = scanner.next();
            School school = new School();
            school.setName(schoolName);
            school.setAddress(address);
            schools.add(school);
        }
        return schools;
    }*/

}
