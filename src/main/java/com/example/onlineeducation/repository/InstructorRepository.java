package com.example.onlineeducation.repository;

import com.example.onlineeducation.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}
