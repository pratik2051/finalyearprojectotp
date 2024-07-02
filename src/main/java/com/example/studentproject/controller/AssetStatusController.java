package com.example.studentproject.controller;

import com.example.studentproject.model.AssetStatus;
import com.example.studentproject.service.AssetStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/asset-statuses")
public class AssetStatusController {

    @Autowired
    private AssetStatusService assetStatusService;

    @GetMapping("/getallassetstatus")
    public List<AssetStatus> getAllAssetStatuses() {
        return assetStatusService.getAllAssetStatuses();
    }

    @GetMapping("/getassetstsus{id}")
    public AssetStatus getAssetStatusById(@PathVariable Long id) {
        return assetStatusService.getAssetStatusById(id);
    }

    @PostMapping("/createassetststus")
    public AssetStatus createAssetStatus(@RequestBody AssetStatus assetStatus) {
        return assetStatusService.saveAssetStatus(assetStatus);
    }

    @PutMapping("/updateassetststus{id}")
    public AssetStatus updateAssetStatus(@PathVariable Long id, @RequestBody AssetStatus assetStatus) {
        AssetStatus existingAssetStatus = assetStatusService.getAssetStatusById(id);
        if (existingAssetStatus != null) {
            existingAssetStatus.setStatus(assetStatus.getStatus());
            return assetStatusService.saveAssetStatus(existingAssetStatus);
        } else {
            return null;
        }
    }

    @DeleteMapping("/delassetstatus{id}")
    public void deleteAssetStatus(@PathVariable Long id) {
        assetStatusService.deleteAssetStatus(id);
    }
}