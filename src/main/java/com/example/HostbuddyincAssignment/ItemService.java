package com.example.HostbuddyincAssignment;


import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
     ItemRepository itemRepository;

    public String addItem(Item item){
         itemRepository.save(item);
         return "Item added successfully";
    }

    public List<Item> viewItems(){
        return itemRepository.findAll();
    }

    public Item findItemByName(String name){
        Item item= itemRepository.findByName(name);
        return item;
    }
}
