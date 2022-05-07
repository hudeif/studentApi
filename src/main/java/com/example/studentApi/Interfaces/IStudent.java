package com.example.studentApi.Interfaces;

import com.example.studentApi.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudent extends JpaRepository<Student,Integer> {
}
