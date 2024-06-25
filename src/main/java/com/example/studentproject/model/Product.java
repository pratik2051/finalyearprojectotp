package com.example.studentproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productdetails")

public class Product {
    @Id
    @GeneratedValue
    private String id;
    private String productCategory;
    private String productName;
    private Long rating;
    private Long quality;
    private Long maximumProducts;
    private Long minimumProducts;
    private String userName;
    private String emailAddress;
    private Long phoneNumber;


}


