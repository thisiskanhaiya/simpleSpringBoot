package com.project.simpleSpringboot.simpleSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.simpleSpringboot.simpleSpringBoot.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
