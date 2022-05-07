package com.example.studentApi.Interfaces;

import com.example.studentApi.Models.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEnrollment extends JpaRepository<Enrollment,Integer> {
}
