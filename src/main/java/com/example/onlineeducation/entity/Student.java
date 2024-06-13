package com.example.onlineeducation.entity;

import lombok.Data;
//import javax.persistence.*;
import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private LocalDate enrolledDate;
}
