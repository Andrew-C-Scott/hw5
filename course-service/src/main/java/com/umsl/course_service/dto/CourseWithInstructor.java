package com.umsl.course_service.dto;

public class CourseWithInstructor {
    private Long   id;
    private String courseNumber;
    private String courseName;
    private Long   capacity;
    private String instructor;  // name
    private String office;
    private String phone;
    private String email;

    // no‐args constructor
    public CourseWithInstructor() { }

    // all‐args constructor (optional)
    public CourseWithInstructor(Long id, String courseNumber, String courseName,
                                Long capacity, String instructor,
                                String office, String phone, String email) {
        this.id           = id;
        this.courseNumber = courseNumber;
        this.courseName   = courseName;
        this.capacity     = capacity;
        this.instructor   = instructor;
        this.office       = office;
        this.phone        = phone;
        this.email        = email;
    }

    // getters & setters for all fields...

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

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}