package com.umsl.instructor_service;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface InstructorRepository extends JpaRepository<Instructor,Long> {
    Optional<Instructor> findByName(String name);
}
