package com.example.studentproject.service;


import com.example.studentproject.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    // Create
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    // Read
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Optional<Item> getItemById(int id) {
        return itemRepository.findById(id);
    }

    // Update
    public Item updateItem(Item item) {
        return itemRepository.save(item);
    }

    // Delete
    public void deleteItem(int id) {
        itemRepository.deleteById(id);
    }
}
