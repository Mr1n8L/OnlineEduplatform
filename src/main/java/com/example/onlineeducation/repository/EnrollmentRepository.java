package com.example.onlineeducation.repository;

import com.example.onlineeducation.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
