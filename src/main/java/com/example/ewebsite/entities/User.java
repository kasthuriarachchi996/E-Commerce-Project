package com.example.ewebsite.entities;

import com.example.ewebsite.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private UserRole userRole;
    private byte[] img;
}
