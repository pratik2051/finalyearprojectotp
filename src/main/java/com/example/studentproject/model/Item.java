package com.example.studentproject.model;
import jakarta.persistence.*;
import jdk.jfr.Category;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.parsing.Location;

import java.sql.Date;
@Getter
@Setter
@Entity
@Table(name = "Item_table")
public class Item {
    @Id
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


}
