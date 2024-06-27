package com.example.studentproject.service;

import com.example.studentproject.model.Sales;
import com.example.studentproject.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalesService {

    @Autowired
    private SalesRepository salesRepository;

    public List<Sales> getAllSales() {
        return salesRepository.findAll();
    }

    public Optional<Sales> getSaleById(Long id) {
        return salesRepository.findById(id);
    }

    public Sales addSale(Sales sales) {
        return salesRepository.save(sales);
    }

    public Sales updateSale(Long id, Sales salesDetails) {
        Sales sales = salesRepository.findById(id).orElseThrow(() -> new RuntimeException("Sale not found"));
        sales.setProductId(salesDetails.getProductId());
        sales.setQuantity(salesDetails.getQuantity());
        sales.setSaleDate(salesDetails.getSaleDate());
        sales.setTotalPrice(salesDetails.getTotalPrice());
        return salesRepository.save(sales);
    }

    public void deleteSale(Long id) {
        salesRepository.deleteById(id);
    }
}