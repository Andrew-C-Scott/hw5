package com.umsl.course_service;
import com.umsl.course_service.dto.InstructorDto;
import com.umsl.course_service.client.InstructorClient;
import com.umsl.course_service.dto.CourseWithInstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

/**
 * CourseController.java
 * <p>
 * This class serves as the REST controller for managing courses.
 * It provides API endpoints for retrieving, adding, and deleting courses,
 * as well as initializing the course table with default data at application startup.
 * <p>
 * Endpoints:
 * - GET /course          : Returns all courses from the database.
 * - POST /course         : Adds a new course to the database.
 * - DELETE /course/{id}  : Deletes a course by its ID.
 * <p>
 * Annotations:
 * - @RestController      : Marks this class as a Spring REST Controller.
 * - @RequestMapping      : Defines the base URL for course-related endpoints.
 * - @Autowired          : Injects the CourseRepository dependency.
 * <p>
 * Author: Andrew Scott
 * Date: 2/22/25
 */

@RestController
@RequestMapping("/course")
public class CourseController {

    private final CourseRepository courseRepository;
    private final InstructorClient instrClient;

    @Autowired
    public CourseController(CourseRepository courseRepository, InstructorClient instrClient) {
        this.courseRepository = courseRepository;
        this.instrClient = instrClient;
    }

    @GetMapping
    public List<Course> getCourse() {
        return courseRepository.findAll();
    }

    @PostMapping
    public void addCourse(@RequestBody Course course) {
        courseRepository.save(course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public CourseWithInstructor getById(@PathVariable Long id) {
        // a) load course
        Course course = courseRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Course not found"));

        // b) call instructor-service via Feign
        InstructorDto instr = instrClient.getByName(course.getInstructor());                instrClient.getByName(course.getInstructor());
        if (instr == null) {
            throw new ResponseStatusException(
                    HttpStatus.SERVICE_UNAVAILABLE, "Instructor not found");
        }

        // c) assemble and return DTO
        CourseWithInstructor out = new CourseWithInstructor();
        out.setId(course.getId());
        out.setCourseNumber(course.getCourseNumber());
        out.setCourseName(course.getCourseName());
        out.setCapacity(course.getCapacity());
        out.setInstructor(instr.getName());
        out.setOffice(instr.getOffice());
        out.setPhone(instr.getPhone());
        out.setEmail(instr.getEmail());
        return out;
    }
}