package com.example.studentproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "inventorycheckitem_tbl")
public class InventoryCheckItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inventoryCheckItemId;

    @ManyToOne
    @JoinColumn(name = "inventory_check_id")
    private InventoryCheck inventoryCheck;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    private int quantityChecked;
    private int discrepancy;

}
