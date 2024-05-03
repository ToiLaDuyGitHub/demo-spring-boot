package com.example.demospringboot.controller;

import com.example.demospringboot.entity.Student;
import com.example.demospringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/students")
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping(value = "/students/{id}")
    public Student getStudent(@PathVariable String id) {
        return studentService.getStudentById(id);
    }

    @PostMapping(value = "/students")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @PutMapping(value = "/students/{id}")
    public void updateStudent(@PathVariable String id, @RequestBody Student student) {
        studentService.updateStudent(id, student);
    }

    @DeleteMapping(value = "/students/{id}")
    public void deleteStudent(@PathVariable String id) {
        studentService.deleteStudentById(id);
    }
}
