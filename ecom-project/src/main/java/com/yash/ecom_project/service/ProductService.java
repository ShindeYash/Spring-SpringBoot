package com.yash.ecom_project.service;

import com.yash.ecom_project.model.Product;
import com.yash.ecom_project.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Product> getAllProducts() {
       return repo.findAll();
    }
}
