package com.example.studentproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "supplier_tbl")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long supplierId;
    private String name;
    private String contactPerson;
    private String address;
    private String Phone;
    private String email;

}
