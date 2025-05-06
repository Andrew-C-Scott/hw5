package com.umsl.student_service;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * StudentRepository.java
 *
 * This interface serves as the repository for managing Student entities.
 * It extends JpaRepository, providing built-in CRUD operations for the Student table.
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

public interface StudentRepository extends JpaRepository<Student,Long> {
}