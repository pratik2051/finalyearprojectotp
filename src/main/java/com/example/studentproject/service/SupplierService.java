//package com.example.studentproject.service;
//
//import com.example.studentproject.exception.ResourceNotFoundException;
//import com.example.studentproject.model.Supplier;
//import com.example.studentproject.repository.SupplierRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class SupplierService {
//
//    @Autowired
//    private SupplierRepository supplierRepository;
//
//    public Supplier saveSupplier(Supplier supplier) {
//        return supplierRepository.save(supplier);
//    }
//
//    public List<Supplier> getAllSuppliers() {
//        return supplierRepository.findAll();
//    }
//
//    public Optional<Supplier> getSupplierById(Long id) {
//        return supplierRepository.findById(id);
//    }
//
//    public Supplier updateSupplier(Long id,å Supplier supplierDetails) {
//        Supplier supplier = supplierRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Supplier not found for this id :: " + id));
//å
//        supplier.setName(supplierDetails.getName());
//        supplier.setContactPerson(supplierDetails.getContactPerson());
//        supplier.setAddress(supplierDetails.getAddress());
//        supplier.setPhone(supplierDetails.getPhone());
//        supplier.setEmail(supplierDetails.getEmail());
//
//        return supplierRepository.save(supplier);
//    }
//
//    public void deleteSupplier(Long id) {
//        Supplier supplier = supplierRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Supplier not found for this id :: " + id));
//        supplierRepository.delete(supplier);
//    }
//}
