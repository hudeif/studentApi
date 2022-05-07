package com.example.studentApi.Interfaces;

import com.example.studentApi.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourse extends JpaRepository<Course,Integer> {
}

