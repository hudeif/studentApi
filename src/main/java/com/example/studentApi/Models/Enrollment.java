package com.example.studentApi.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date date;

    @ManyToOne(optional = false)
    @JoinColumn(name = "course_id",referencedColumnName = "id")
    @JsonIgnoreProperties(value = {"enrollments", "handler","hibernateLazyInitializer"}, allowSetters = true)
    private Course course;

    @ManyToOne(optional = false)
    @JoinColumn(name = "student_id",referencedColumnName = "id")
    @JsonIgnoreProperties(value = {"enrollments", "handler","hibernateLazyInitializer"}, allowSetters = true)
    private Student student;

    public Enrollment() {
    }

    public Enrollment(Integer id, Date date, Course course, Student student) {
        this.id = id;
        this.date = date;
        this.course = course;
        this.student = student;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
