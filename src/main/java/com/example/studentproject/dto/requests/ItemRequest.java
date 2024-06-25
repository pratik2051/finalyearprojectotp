package com.example.studentproject.dto.requests;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class ItemRequest {
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
