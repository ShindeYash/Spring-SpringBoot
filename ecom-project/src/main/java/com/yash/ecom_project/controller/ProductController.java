package com.yash.ecom_project.controller;

import com.yash.ecom_project.model.Product;
import com.yash.ecom_project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String greet(){
        return "Hello World";
    }



    @GetMapping("/products")
    public List<Product> getAllProduct(){
        List<Product> products = service.getAllProducts();
        System.out.println("Products returned to API: " + products);
        return products;
    }
}
