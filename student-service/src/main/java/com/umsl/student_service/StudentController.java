package com.umsl.student_service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * StudentController.java
 *
 * This class serves as the REST controller for managing students.
 * It provides API endpoints for retrieving, adding, and deleting students,
 * as well as initializing the student table with default data at application startup.
 *
 * Endpoints:
 * - GET /student         : Returns all students from the database.
 * - POST /student        : Adds a new student to the database.
 * - DELETE /student/{id} : Deletes a student by their ID.
 *
 * Annotations:
 * - @RestController      : Marks this class as a Spring REST Controller.
 * - @RequestMapping      : Defines the base URL for student-related endpoints.
 * - @Autowired          : Injects the StudentRepository dependency.
 * - @PostConstruct      : Initializes the database with default students.
 *
 * Author: Andrew Scott
 * Date: 2/22/25
 */


@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping
    public List<Student> getStudents() {
        //return all student info
        return studentRepository.findAll();
    }

    @PostMapping
    public void addStudent(@RequestBody Student student) {
        studentRepository.save(student);
    }
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentRepository.deleteById(id);
    }


}