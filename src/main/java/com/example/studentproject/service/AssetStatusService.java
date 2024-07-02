package com.example.studentproject.service;

import com.example.studentproject.model.AssetStatus;
import com.example.studentproject.repository.AssetStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetStatusService {

    @Autowired
    private AssetStatusRepository assetStatusRepository;

    public List<AssetStatus> getAllAssetStatuses() {
        return assetStatusRepository.findAll();
    }

    public AssetStatus getAssetStatusById(Long id) {
        return assetStatusRepository.findById(id).orElse(null);
    }

    public AssetStatus saveAssetStatus(AssetStatus assetStatus) {
        return assetStatusRepository.save(assetStatus);
    }

    public void deleteAssetStatus(Long id) {
        assetStatusRepository.deleteById(id);
    }
}