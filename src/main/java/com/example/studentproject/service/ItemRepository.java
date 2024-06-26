package com.example.studentproject.service;

import com.example.studentproject.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
    // Custom query methods can be defined here if needed
    List<Item> findByItemname(String itemname);
    List<Item> findByCatagory(String catagory);
    List<Item> findBySupplier(String supplier);
}