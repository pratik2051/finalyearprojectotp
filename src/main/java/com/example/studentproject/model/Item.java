package com.example.studentproject.model;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "Item_table")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private int id;
    private String itemname;
    private Long quantity;
    private String description;
    private Integer itemnumber;
    private Date expiredate;
    private Date purchasedate;
    private String catagory;
    private String supplier;
    private Double unitprice;
    private Double totalvalue;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getItemnumber() {
        return itemnumber;
    }

    public void setItemnumber(Integer itemnumber) {
        this.itemnumber = itemnumber;
    }

    public Date getExpiredate() {
        return expiredate;
    }

    public void setExpiredate(Date expiredate) {
        this.expiredate = expiredate;
    }

    public Date getPurchasedate() {
        return purchasedate;
    }

    public void setPurchasedate(Date purchasedate) {
        this.purchasedate = purchasedate;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }

    public Double getTotalvalue() {
        return totalvalue;
    }

    public void setTotalvalue(Double totalvalue) {
        this.totalvalue = totalvalue;
    }
}
