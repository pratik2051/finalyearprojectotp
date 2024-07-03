package com.example.studentproject.controller;

import com.example.studentproject.model.Item;
import com.example.studentproject.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    // Create
    @PostMapping("/create")
    public Item createItem(@RequestBody Item item) {
        return itemService.saveItem(item);
    }

    // Read all items
    @GetMapping("/getall")
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    // Read item by ID
    @GetMapping("getbyid/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable int id) {
        Optional<Item> item = itemService.getItemById(id);
        return item.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Update
    @PutMapping("putbyid/{id}")
    public ResponseEntity<Item> updateItem(@PathVariable int id, @RequestBody Item itemDetails) {
        Optional<Item> item = itemService.getItemById(id);
        if (item.isPresent()) {
            Item existingItem = item.get();
            existingItem.setItemname(itemDetails.getItemname());
            existingItem.setQuantity(itemDetails.getQuantity());
            existingItem.setDescription(itemDetails.getDescription());
            existingItem.setItemnumber(itemDetails.getItemnumber());
            existingItem.setExpiredate(itemDetails.getExpiredate());
            existingItem.setPurchasedate(itemDetails.getPurchasedate());
            existingItem.setCatagory(itemDetails.getCatagory());
            existingItem.setSupplier(itemDetails.getSupplier());
            existingItem.setUnitprice(itemDetails.getUnitprice());
            existingItem.setTotalvalue(itemDetails.getTotalvalue());
            Item updatedItem = itemService.updateItem(existingItem);
            return ResponseEntity.ok(updatedItem);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete
    @DeleteMapping("/delbyid/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable int id) {
        Optional<Item> item = itemService.getItemById(id);
        if (item.isPresent()) {
            itemService.deleteItem(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}