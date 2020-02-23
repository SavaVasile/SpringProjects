package com.springProject.spring.controller;

import com.springProject.spring.model.Student;
import com.springProject.spring.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.Optional;


@Controller
@RequestMapping("/student")
public class StudentController {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /*@GetMapping("/")
    public String getIndex(Model model) {
        Iterable<Student> students = studentRepository.findAll();
        model.addAttribute("students", students);
        return "index";
    }*/

    @GetMapping("/add/")
    @NotBlank(message = "Field required")
    public String getAdd(Model model) {
        model.addAttribute("student", new Student());
        return "addStudent.html";
    }

    @PostMapping("/add/")
    public String proccessAddStudent(@Valid Student student, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            return "addStudent";
        }
        studentRepository.save(student);
        return "redirect:/";
    }


    @GetMapping("/edit/{id}/")
    @NotBlank(message = "Field required")
    public String proccessAddStudentEdit(@PathVariable Long id, Model model) {
        Optional<Student> student = studentRepository.findById(id);
        if (!student.isPresent()) {
            return "redirect:/";
        }
        model.addAttribute("student", student.get());
        return "editStudent.html";
    }

    @PostMapping("/edit/")
    public String proccessIdStudent(@Valid Student student,BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            return "editStudent";
        }
        studentRepository.save(student);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}/")
    public String proccessDeleteStudent(@PathVariable Long id) {
        studentRepository.deleteById(id);
        return "redirect:/";
    }

}
