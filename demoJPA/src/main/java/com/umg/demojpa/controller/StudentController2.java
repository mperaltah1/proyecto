package com.umg.demojpa.controller;

import com.umg.demojpa.entity.Student;
import com.umg.demojpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/estudiantes")
public class StudentController2 {
    @Autowired
    StudentService studentService;

    @GetMapping
    public String getStudents(Model model) {
        List<Student> students = studentService.getStudents();
        model.addAttribute("students", students);
        return "estudiantes";
    }

    @PostMapping
    public String saveStudent(Student student){
        studentService.saveStudent(student);
        return "redirect:/estudiantes";
    }
}
