package com.example.studentproject.repository;

import com.example.studentproject.model.AssetStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetStatusRepository extends JpaRepository<AssetStatus, Long> {
}