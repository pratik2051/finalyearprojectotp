package com.example.studentproject.service;

import com.example.studentproject.model.PurchaseOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

;

@Service
@Transactional(readOnly = true)
public class PurchaseOrderService {

    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;

    public PurchaseOrder savePurchaseOrder(PurchaseOrder purchaseOrder) {
        return purchaseOrderRepository.save(purchaseOrder);
    }

    @Transactional(readOnly = true)
    public List<PurchaseOrder> getAllPurchaseOrders() {
        return purchaseOrderRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<PurchaseOrder> getPurchaseOrderById(Long id) {
        return purchaseOrderRepository.findById(id);
    }

    public PurchaseOrder updatePurchaseOrder(Long id, PurchaseOrder updatedPurchaseOrder) {
        Optional<PurchaseOrder> existingPurchaseOrderOptional = purchaseOrderRepository.findById(id);
        if (existingPurchaseOrderOptional.isPresent()) {
            PurchaseOrder existingPurchaseOrder = existingPurchaseOrderOptional.get();
            return purchaseOrderRepository.save(existingPurchaseOrder);
        } else {
            // Handle not found case
            return null;
        }
    }

    public boolean deletePurchaseOrder(Long id) {
        Optional<PurchaseOrder> purchaseOrderOptional = purchaseOrderRepository.findById(id);
        if (purchaseOrderOptional.isPresent()) {
            purchaseOrderRepository.delete(purchaseOrderOptional.get());
            return true;
        } else {
            // Handle not found case
            return false;
        }
    }
}