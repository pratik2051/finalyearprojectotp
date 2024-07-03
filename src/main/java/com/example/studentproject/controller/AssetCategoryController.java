package com.example.studentproject.controller;

import com.example.studentproject.model.AssetCategory;
import com.example.studentproject.service.AssetCatagoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/asset-categories")
public class AssetCategoryController {

    @Autowired
    private AssetCatagoryService assetCategoryService;

    @GetMapping("/GetassetCatagory")
    public List<AssetCategory> getAllAssetCategories() {
        return assetCategoryService.getAllAssetCategories();
    }

    @GetMapping("/getasset/{id}")
    public AssetCategory getAssetCategoryById(@PathVariable Long id) {
        return assetCategoryService.getAssetCategoryById(id);
    }

    @PostMapping("/saveassetcatagory")
    public AssetCategory createAssetCategory(@RequestBody AssetCategory assetCategory) {
        return assetCategoryService.saveAssetCategory(assetCategory);
    }

    @PutMapping("/updateassetcatagory/{id}")
    public AssetCategory updateAssetCategory(@PathVariable Long id, @RequestBody AssetCategory assetCategory) {
        AssetCategory existingAssetCategory = assetCategoryService.getAssetCategoryById(id);
        if (existingAssetCategory != null) {
            existingAssetCategory.setName(assetCategory.getName());
            return assetCategoryService.saveAssetCategory(existingAssetCategory);
        } else {
            return null;
        }
    }

    @DeleteMapping("/deleteassetcatagory/{id}")
    public void deleteAssetCategory(@PathVariable Long id) {
        assetCategoryService.deleteAssetCategory(id);
    }
}