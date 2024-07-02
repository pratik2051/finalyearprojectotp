package com.example.studentproject.controller;

import com.example.studentproject.model.Supplier;
import com.example.studentproject.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/suppliers")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping
    public List<Supplier> getAllSuppliers() {
        return supplierService.getAllSuppliers();
    }

    @GetMapping("/{id}")
    public Supplier getSupplierById(@PathVariable Long id) {
        return supplierService.getSupplierById(id);
    }

    @PostMapping
    public Supplier createSupplier(@RequestBody Supplier supplier) {
        return supplierService.saveSupplier(supplier);
    }

    @PutMapping("/updatesupplier{id}")
    public Supplier updateSupplier(@PathVariable Long id, @RequestBody Supplier supplier) {
        Supplier existingSupplier = supplierService.getSupplierById(id);
        if (existingSupplier != null) {
            existingSupplier.setName(supplier.getName());
            existingSupplier.setAssets(supplier.getAssets());
            return supplierService.saveSupplier(existingSupplier);
        } else {
            return null;
        }
    }

    @DeleteMapping("/delsupplier{id}")
    public void deleteSupplier(@PathVariable Long id) {
        supplierService.deleteSupplier(id);
    }
}




