package com.example.studentproject.service;

import com.example.studentproject.model.AssetCategory;
import com.example.studentproject.repository.AssetCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetCatagoryService {
    @Autowired
    private AssetCategoryRepository assetCategoryRepository;

    public List<AssetCategory> getAllAssetCategories() {
        return assetCategoryRepository.findAll();
    }

    public AssetCategory getAssetCategoryById(Long id) {
        return assetCategoryRepository.findById(id).orElse(null);
    }

    public AssetCategory saveAssetCategory(AssetCategory assetCategory) {
        return assetCategoryRepository.save(assetCategory);
    }

    public void deleteAssetCategory(Long id) {
        assetCategoryRepository.deleteById(id);
    }
}
