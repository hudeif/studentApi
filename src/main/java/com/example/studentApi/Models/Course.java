package com.example.studentApi.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    @OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
//    @JsonIgnoreProperties(value = {"course", "handler","hibernateLazyInitializer"}, allowSetters = true)
    private List<Enrollment> enrollments;

    public Course() {
    }

    public Course(Integer id, String title, List<Enrollment> enrollments) {
        this.id = id;
        this.title = title;
        this.enrollments = enrollments;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }
}
