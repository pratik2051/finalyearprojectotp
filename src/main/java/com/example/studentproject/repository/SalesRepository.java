package com.example.studentproject.repository;

import com.example.studentproject.model.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepository extends JpaRepository<Sales, Long> {
    // Custom query methods (if any) can be defined here
}