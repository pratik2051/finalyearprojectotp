package com.example.studentproject.controller;

import com.example.studentproject.model.Sales;
import com.example.studentproject.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/auth/sales")
public class SalesController {

    @Autowired
    private SalesService salesService;

    @GetMapping("/allsales")
    public List<Sales> getAllSales() {
        return salesService.getAllSales();
    }

    @GetMapping("byid/{id}")
    public ResponseEntity<Sales> getSaleById(@PathVariable Long id) {
        Optional<Sales> sale = salesService.getSaleById(id);
        return sale.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/addsales")
    public Sales addSale(@RequestBody Sales sales) {
        return salesService.addSale(sales);
    }

    @PutMapping("/updatesales/{id}")
    public ResponseEntity<Sales> updateSale(@PathVariable Long id, @RequestBody Sales salesDetails) {
        Sales updatedSale = salesService.updateSale(id, salesDetails);
        return ResponseEntity.ok(updatedSale);
    }

    @DeleteMapping("/deletesales/{id}")
    public ResponseEntity<Void> deleteSale(@PathVariable Long id) {
        salesService.deleteSale(id);
        return ResponseEntity.noContent().build();
    }
}