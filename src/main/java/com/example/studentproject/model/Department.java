package com.example.studentproject.model;

import jakarta.persistence.*;

@Entity
@Table(name="department_tbl")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentId;
    private String name;
    private String description;
    private Long managerId;

}
