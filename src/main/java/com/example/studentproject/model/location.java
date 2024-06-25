package com.example.studentproject.model;

import jakarta.persistence.*;
import jdk.jfr.Enabled;

@Entity
@Table(name="location_tbl")
public class location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long locationId;
    private String name;
    private String description;

}
