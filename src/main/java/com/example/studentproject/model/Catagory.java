package com.example.studentproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "category_tbl")
public class Catagory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    private String name;
    private String description;
}
