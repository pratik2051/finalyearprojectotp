package com.example.studentproject.controller;

import com.example.studentproject.model.PurchaseOrder;
import com.example.studentproject.service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

    @RestController
    @RequestMapping("/api/v1/auth/purchase-orders")
    public class PurchaseOrderController {

        @Autowired
        private PurchaseOrderService purchaseOrderService;

        @GetMapping
        public ResponseEntity<List<PurchaseOrder>> getAllPurchaseOrders() {
            List<PurchaseOrder> purchaseOrders = purchaseOrderService.getAllPurchaseOrders();
            return ResponseEntity.ok(purchaseOrders);
        }

        @GetMapping("/{id}")
        public ResponseEntity<PurchaseOrder> getPurchaseOrderById(@PathVariable Long id) {
            Optional<PurchaseOrder> purchaseOrderOptional = purchaseOrderService.getPurchaseOrderById(id);
            return purchaseOrderOptional.map(ResponseEntity::ok)
                    .orElseGet(() -> ResponseEntity.notFound().build());
        }

        @PostMapping
        public ResponseEntity<PurchaseOrder> createPurchaseOrder(@RequestBody PurchaseOrder purchaseOrder) {
            PurchaseOrder savedPurchaseOrder = purchaseOrderService.savePurchaseOrder(purchaseOrder);
            return new ResponseEntity<>(savedPurchaseOrder, HttpStatus.CREATED);
        }

        @PutMapping("/{id}")
        public ResponseEntity<PurchaseOrder> updatePurchaseOrder(@PathVariable Long id, @RequestBody PurchaseOrder purchaseOrder) {
            PurchaseOrder updatedPurchaseOrder = purchaseOrderService.updatePurchaseOrder(id, purchaseOrder);
            if (updatedPurchaseOrder != null) {
                return ResponseEntity.ok(updatedPurchaseOrder);
            } else {
                return ResponseEntity.notFound().build();
            }
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deletePurchaseOrder(@PathVariable Long id) {
            boolean deleted = purchaseOrderService.deletePurchaseOrder(id);
            if (deleted) {
                return ResponseEntity.noContent().build();
            } else {
                return ResponseEntity.notFound().build();
            }
        }
    }

