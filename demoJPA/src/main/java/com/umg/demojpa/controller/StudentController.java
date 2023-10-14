package com.umg.demojpa.controller;

import com.umg.demojpa.entity.Student;
import com.umg.demojpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/students")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/{carne}")
    public Optional<Student> getStudent(@PathVariable Integer carne) {
        return studentService.getStudent(carne);
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student newStudent){
        return studentService.saveStudent(newStudent);
    }

    @DeleteMapping("/{carne}")
    public void deleteStudent(@PathVariable Integer carne){
        studentService.deleteStudent(carne);
    }
}
