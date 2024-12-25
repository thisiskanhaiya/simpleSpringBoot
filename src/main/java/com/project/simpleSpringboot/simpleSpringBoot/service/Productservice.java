package com.project.simpleSpringboot.simpleSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.simpleSpringboot.simpleSpringBoot.model.Product;
import com.project.simpleSpringboot.simpleSpringBoot.repository.ProductRepo;

@Service
public class Productservice {

    @Autowired
    ProductRepo productRepo;
    public List<Product> getproducts() {
        return productRepo.findAll();
    }
    public Product addProduct(Product product) {
        productRepo.save(product);
        return product;
    }
    public Product getProductById(int id) {
        System.out.println(productRepo.findById(id));
        return productRepo.findById(id).orElse(null);
    }
    public Product updateProduct(Product product) {
        productRepo.save(product);
        return product;
    }
    public void deleteProduct(int id) {
        productRepo.deleteById(id);
    }
   

}
