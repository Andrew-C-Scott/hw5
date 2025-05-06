package com.umsl.instructor_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.kafka.core.KafkaTemplate;          // ← new import
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/instructor")
public class InstructorController {

    private final InstructorRepository instructorRepository;
    private final KafkaTemplate<String,String> kafka;      // ← new field

    @Autowired
    public InstructorController(InstructorRepository instructorRepository,
                                KafkaTemplate<String,String> kafka) {
        this.instructorRepository = instructorRepository;
        this.kafka = kafka;                                // ← store it
    }

    @GetMapping
    public List<Instructor> getInstructor() {
        return instructorRepository.findAll();
    }

    @PostMapping
    public void addInstructor(@RequestBody Instructor instructor) {
        instructorRepository.save(instructor);
        kafka.send("instructor-events",                     // ← publish
                "POST:" + instructor.getName());
    }

    @DeleteMapping("/{id}")
    public void deleteInstructor(@PathVariable Long id) {
        Instructor i = instructorRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Instructor not found"));
        instructorRepository.deleteById(id);
        kafka.send("instructor-events",                     // ← publish
                "DELETE:" + i.getName());
    }

    @GetMapping("/{name}")
    public Instructor getByName(@PathVariable String name) {
        return instructorRepository.findByName(name)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Instructor not found"));
    }
}