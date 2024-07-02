package com.example.studentproject.service;

import com.example.studentproject.model.Asset;

import java.util.List;
import java.util.Optional;

public interface AssetService {
    List<Asset> findAll();
    Optional<Asset> findById(Long id);
    Asset save(Asset asset);
    void deleteById(Long id);

}