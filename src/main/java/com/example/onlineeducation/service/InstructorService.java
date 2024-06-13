package com.example.onlineeducation.service;

import com.example.onlineeducation.entity.Instructor;
import com.example.onlineeducation.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService {

    @Autowired
    private InstructorRepository instructorRepository;

    public List<Instructor> getAllInstructors() {
        return instructorRepository.findAll();
    }

    public Instructor getInstructorById(Long id) {
        return instructorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Instructor not found"));
    }

    public Instructor createInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    public Instructor updateInstructor(Long id, Instructor instructorDetails) {
        Instructor instructor = getInstructorById(id);
        instructor.setName(instructorDetails.getName());
        instructor.setEmail(instructorDetails.getEmail());
        instructor.setBio(instructorDetails.getBio());
        return instructorRepository.save(instructor);
    }

    public void deleteInstructor(Long id) {
        instructorRepository.deleteById(id);
    }
}
