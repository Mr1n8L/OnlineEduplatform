package com.example.onlineeducation.repository;

import com.example.onlineeducation.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
