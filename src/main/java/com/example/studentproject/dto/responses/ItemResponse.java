package com.example.studentproject.dto.responses;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class ItemResponse {

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
