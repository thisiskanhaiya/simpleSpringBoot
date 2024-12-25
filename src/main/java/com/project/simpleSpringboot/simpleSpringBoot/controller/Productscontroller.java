package com.project.simpleSpringboot.simpleSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Productscontroller {
    @GetMapping("/products")
    public String getProducts() {
        return "Hello World";
    }
}
