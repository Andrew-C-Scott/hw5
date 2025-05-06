package com.umsl.course_service;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Course.java
 * <p>
 * This class represents the Course entity for the application.
 * It maps to the "course" table in the database and stores
 * information about courses such as course number, course name, and capacity.
 * <p>
 * Annotations:
 * - @Entity: Marks this class as a JPA entity.
 * - @Table: Specifies that this class maps to a database table.
 * - @Id and @GeneratedValue: Defines the primary key with auto-increment.
 * <p>
 * Author: Andrew Scott
 * Date: 2/20/25
 */
@Entity
@Table
public class Course {
    @Id
    @GeneratedValue
    private Long id;
    private String courseNumber;
    private String courseName;
    private Long capacity;
    private String instructor;

    public Course() {
    }

    public Course(Long id, String courseNumber, String courseName, Long capacity, String instructor) {
        this.id = id;
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.capacity = capacity;
        this.instructor = instructor;
    }

    public Course(String courseNumber, String courseName, Long capacity, String instructor) {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.capacity = capacity;
        this.instructor = instructor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public String getInstructor() {return instructor;}

    public void setInstructor(String instructor) {this.instructor = instructor;}

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseNumber='" + courseNumber + '\'' +
                ", courseName='" + courseName + '\'' +
                ", capacity=" + capacity +
                ", instructor='" + instructor + '\'' +
                '}';
    }
}

