package com.example.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/walmart")
public class ProductController {

    @Autowired
    private ProductRepo repo;

    @PostMapping("/save")
    public String saveProduct(@RequestBody Product p){
        repo.save(p);
        return "New Product has been saved successfully";
    }
    @GetMapping("/get/{id}")
    public Optional<Product> getProduct(@PathVariable("id") Long id){

    return repo.findById(id);
    }

    @GetMapping("/get")
    public List<Product>getProducts(){
    return repo.findAll();
    }
}
