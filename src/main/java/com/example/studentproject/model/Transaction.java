package com.example.studentproject.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "transaction_tbl")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String transactionType;
    private int quantity;
    private Date date;
    private String remarks;


}
