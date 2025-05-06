package com.umsl.instructor_service;

import jakarta.persistence.*;

@Table
@Entity
public class Instructor {

    @Id @GeneratedValue
    private Long id;

    @Column(name="INSTRUCTOR_NAME")
    private String name;

    @Column(name="OFFICE")
    private String office;

    @Column(name="PHONE")
    private String phone;

    @Column(name="EMAIL")
    private String email;

    protected Instructor() {
    }

    public Instructor(String name, String office,
                      String phone, String email) {
        this.name = name;
        this.office = office;
        this.phone = phone;
        this.email = email;
    }

    public Instructor(Long id, String name, String office,
                      String phone, String email) {
        this(name, office, phone, email);
        this.id = id;
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

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", office='" + office + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
