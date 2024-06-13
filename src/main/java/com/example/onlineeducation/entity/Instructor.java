package com.example.onlineeducation.entity;

import jakarta.persistence.*;
import lombok.Data;
//import javax.persistence.*;

@Entity
@Data
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String bio;
}
