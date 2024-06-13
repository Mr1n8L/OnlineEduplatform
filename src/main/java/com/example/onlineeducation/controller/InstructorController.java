package com.example.onlineeducation.controller;

import com.example.onlineeducation.entity.Instructor;
import com.example.onlineeducation.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instructors")
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    @GetMapping
    public List<Instructor> getAllInstructors() {
        return instructorService.getAllInstructors();
    }

    @GetMapping("/{id}")
    public Instructor getInstructorById(@PathVariable Long id) {
        return instructorService.getInstructorById(id);
    }

    @PostMapping
    public Instructor createInstructor(@RequestBody Instructor instructor) {
        return instructorService.createInstructor(instructor);
    }

    @PutMapping("/{id}")
    public Instructor updateInstructor(@PathVariable Long id, @RequestBody Instructor instructorDetails) {
        return instructorService.updateInstructor(id, instructorDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteInstructor(@PathVariable Long id) {
        instructorService.deleteInstructor(id);
    }
}
