package com.example.demospringboot.repository;

import com.example.demospringboot.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, String> {

}
