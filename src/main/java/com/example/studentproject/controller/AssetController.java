package com.example.studentproject.controller;

import com.example.studentproject.model.Asset;
import com.example.studentproject.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/assets")
public class AssetController {

    private final AssetService assetService;

    @Autowired
    public AssetController(AssetService assetService) {
        this.assetService = assetService;
    }

    @GetMapping("/getallasset")
    public List<Asset> getAllAssets() {
        return assetService.findAll();
    }

    @GetMapping("/getbyid/{id}")
    public ResponseEntity<Asset> getAssetById(@PathVariable Long id) {
        return assetService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/createasset")
    public Asset createAsset(@RequestBody Asset asset) {
        return assetService.save(asset);
    }

    @PutMapping("/updateasset/{id}")
    public ResponseEntity<Asset> updateAsset(@PathVariable Long id, @RequestBody Asset asset) {
        if (!assetService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        asset.setId(Math.toIntExact(id));
        Asset updatedAsset = assetService.save(asset);
        return ResponseEntity.ok(updatedAsset);
    }

    @DeleteMapping("/deletAsset/{id}")
    public ResponseEntity<Void> deleteAsset(@PathVariable Long id) {
        if (!assetService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        assetService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}