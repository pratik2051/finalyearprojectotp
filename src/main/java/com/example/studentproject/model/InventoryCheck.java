package com.example.studentproject.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "inventorycheck_tbl")
public class InventoryCheck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inventoryCheckId;

    private Date date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String remarks;
}
