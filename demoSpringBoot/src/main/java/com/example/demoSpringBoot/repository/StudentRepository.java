package com.example.demoSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demoSpringBoot.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}