package com.example.studentproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name = "teachers_tbl")
public class Teachers {
    @Id
    private int id;
    private String name;
    private String subject;
    private Date stardate;
}
