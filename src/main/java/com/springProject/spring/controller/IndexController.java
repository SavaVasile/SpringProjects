package com.springProject.spring.controller;

import com.springProject.spring.model.School;
import com.springProject.spring.model.Student;
import com.springProject.spring.repositories.SchoolRepository;
import com.springProject.spring.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class IndexController {

    private SchoolRepository schoolRepository;
    private StudentRepository studentRepository;

    @Autowired
    public IndexController(SchoolRepository schoolRepository, StudentRepository studentRepository) {
        this.schoolRepository = schoolRepository;
        this.studentRepository = studentRepository;
    }

    @GetMapping("/")
    public String getIndex(Model model) {
        Iterable<School> schools = schoolRepository.findAll();
        Iterable<Student> students= studentRepository.findAll();
        model.addAttribute("schools", schools);
        model.addAttribute("students",students);
        return "index.html";
    }
}
