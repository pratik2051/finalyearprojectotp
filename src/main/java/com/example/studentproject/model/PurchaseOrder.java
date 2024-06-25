package com.example.studentproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "purchaseorder_tbl")
public class PurchaseOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long purchaseOrderItemId;

    @ManyToOne
    @JoinColumn(name = "purchase_order_id")
    private PurchaseOrder purchaseOrder;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    private int quantity;
    private double unitPrice;
    private double totalPrice;



}
