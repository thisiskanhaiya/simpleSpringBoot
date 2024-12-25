package com.project.simpleSpringboot.simpleSpringBoot.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.simpleSpringboot.simpleSpringBoot.model.Product;
import com.project.simpleSpringboot.simpleSpringBoot.service.Productservice;

@RestController
@RequestMapping("/products")
public class Productscontroller {
    @Autowired
    Productservice productservice;

    @GetMapping
    public List<Product> getProducts() {
        return productservice.getproducts();
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productservice.addProduct(product);
    }

    @GetMapping("/{id}")
    public Product getProductbyId(@PathVariable int id){
        System.out.println("id is "+id);
        return productservice.getProductById(id);
    }
    @PutMapping
    public Product updateProduct(@RequestBody Product product) {
        return productservice.updateProduct(product);
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id) {
        productservice.deleteProduct(id);
    }
}
