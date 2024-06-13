package com.example.onlineeducation.service;

import com.example.onlineeducation.entity.Enrollment;
import com.example.onlineeducation.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepository.findAll();
    }

    public Enrollment getEnrollmentById(Long id) {
        return enrollmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Enrollment not found"));
    }

    public Enrollment createEnrollment(Enrollment enrollment) {
        enrollment.setEnrollmentDate(LocalDate.now());
        return enrollmentRepository.save(enrollment);
    }

    public Enrollment updateEnrollment(Long id, Enrollment enrollmentDetails) {
        Enrollment enrollment = getEnrollmentById(id);
        enrollment.setCourseId(enrollmentDetails.getCourseId());
        enrollment.setStudentId(enrollmentDetails.getStudentId());
        enrollment.setProgress(enrollmentDetails.getProgress());
        return enrollmentRepository.save(enrollment);
    }

    public void deleteEnrollment(Long id) {
        enrollmentRepository.deleteById(id);
    }
}
