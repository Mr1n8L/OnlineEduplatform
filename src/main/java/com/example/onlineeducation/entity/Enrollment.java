package com.example.onlineeducation.entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.Data;
//import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long courseId;
    private Long studentId;
    private LocalDate enrollmentDate;
    private int progress;
}
