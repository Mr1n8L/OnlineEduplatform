package com.example.onlineeducation.controller;

import com.example.onlineeducation.entity.Enrollment;
import com.example.onlineeducation.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @GetMapping
    public List<Enrollment> getAllEnrollments() {
        return enrollmentService.getAllEnrollments();
    }

    @GetMapping("/{id}")
    public Enrollment getEnrollmentById(@PathVariable Long id) {
        return enrollmentService.getEnrollmentById(id);
    }

    @PostMapping
    public Enrollment createEnrollment(@RequestBody Enrollment enrollment) {
        return enrollmentService.createEnrollment(enrollment);
    }

    @PutMapping("/{id}")
    public Enrollment updateEnrollment(@PathVariable Long id, @RequestBody Enrollment enrollmentDetails) {
        return enrollmentService.updateEnrollment(id, enrollmentDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteEnrollment(@PathVariable Long id) {
        enrollmentService.deleteEnrollment(id);
    }
}
