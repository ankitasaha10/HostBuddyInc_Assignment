package com.example.HostbuddyincAssignment;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping("/additem")
    public String addItem(@RequestBody Item item){
        return itemService.addItem(item);
    }

    @GetMapping("")
    public List<Item> viewItems(){
        return itemService.viewItems();
    }

    @GetMapping("/search")
    public Item findItemByName(@RequestParam String name){
        return itemService.findItemByName(name);
    }
}
