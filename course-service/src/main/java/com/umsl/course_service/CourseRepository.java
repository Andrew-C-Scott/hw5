package com.umsl.course_service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * CourseRepository.java
 *
 * This interface serves as the repository for managing Course entities.
 * It extends JpaRepository, providing built-in CRUD operations for the Course table.
 *
 * Features:
 * - Inherits methods like save(), findById(), findAll(), deleteById(), etc.
 * - Spring Data JPA handles database interactions.
 *
 * Annotations:
 * - @Repository: Spring automatically detects JpaRepository interfaces.
 *
 * Author: Andrew Scott
 * Date: 2/22/25
 */

public interface CourseRepository extends JpaRepository<Course,Long> {
}