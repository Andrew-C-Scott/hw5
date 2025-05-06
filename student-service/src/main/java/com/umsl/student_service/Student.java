package com.umsl.student_service;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Student.java
 *
 * This class represents the Student entity for the application.
 * It maps to the "student" table in the database and stores
 * information about the students in the school
 *
 * Annotations:
 * - @Entity: Marks this class as a JPA entity.
 * - @Table: Specifies that this class maps to a database table.
 * - @Id and @GeneratedValue: Defines the primary key with auto-increment.
 *
 * Author: Andrew Scott
 * Date: 2/21/25
 */

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String major;
    private Integer year;

    public Student() {
    }

    public Student(String name, String major, Integer year) {
        this.name = name;
        this.major = major;
        this.year = year;
    }

    public Student(Long id, String name, String major, Integer year) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", year=" + year +
                '}';
    }
}