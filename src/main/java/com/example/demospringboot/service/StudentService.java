package com.example.demospringboot.service;

import com.example.demospringboot.entity.Student;
import com.example.demospringboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public Student getStudentById(String id) {
        Student student = studentRepository.findById(id).orElse(null);
        return student;
    }

    public void deleteStudentById(String id) {
        studentRepository.deleteById(id);
    }

    public void updateStudent(String id, Student student) {
        studentRepository.save(student);
    }
}