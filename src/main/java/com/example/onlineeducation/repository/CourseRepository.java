package com.example.onlineeducation.repository;

import com.example.onlineeducation.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
