package com.revature.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("items")
public class controller {

    Set<String> itemSet = new HashSet<>();


    @GetMapping
    public Set<String> getItemSet() {
        System.out.println("Item set requested");
        return itemSet;
    }

    @GetMapping("/{id}")
    public String getItemSet(@PathVariable String id) {
        System.out.println("Item set requested");
        return id;
    }

    @PutMapping("/{id}")
    public String addItemToItemSet(@PathVariable String id) {
        System.out.println("Item added: "+id);
        itemSet.add(id);
        return "Item added: "+id;
    }

    @DeleteMapping("/{id}")
    public String removeItemFromItemSet(@PathVariable String id) {
        System.out.println("Item removed: "+id);
        itemSet.remove(id);
        return "Item removed: "+id;
    }
}
