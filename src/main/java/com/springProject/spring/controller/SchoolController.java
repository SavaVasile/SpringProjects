package com.springProject.spring.controller;

import com.springProject.spring.model.School;
import com.springProject.spring.repositories.SchoolRepository;
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
@RequestMapping("/school")
public class SchoolController {
    private final SchoolRepository schoolRepository;

    @Autowired
    public SchoolController(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }


    @GetMapping("/add/")
    @NotBlank(message = "Field required")
    public String getAddSchool(Model model) {
        model.addAttribute("school", new School());
        return "addSchool.html";
    }

    @PostMapping("/add/")
    public String proccessAddSchool(@Valid School school, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "addSchool";
        }
        schoolRepository.save(school);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}/")
    @NotBlank(message = "Field required")
    public String proccessAddSchoolEdit(@PathVariable Long id, Model model) {
        Optional<School> school = schoolRepository.findById(id);
        if (!school.isPresent()) {
            return "redirect:/";
        }
        model.addAttribute("school", school.get());
        return "editSchool.html";
    }

    @PostMapping("/edit/")
    public String proccessIdSchool(@Valid School school, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "editStudent";
        }
        schoolRepository.save(school);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}/")
    public String proccessDeleteSchool(@PathVariable Long id) {
        schoolRepository.deleteById(id);
        return "redirect:/";
    }

}
