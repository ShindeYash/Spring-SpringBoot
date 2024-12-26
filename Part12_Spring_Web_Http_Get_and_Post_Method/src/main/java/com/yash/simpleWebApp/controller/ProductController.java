package com.yash.simpleWebApp.controller;

import com.yash.simpleWebApp.model.Product;
import com.yash.simpleWebApp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
public class ProductController {

    @Autowired
    ProductService serviceObj;

// For Get Request annotations we can use any of the following 3.


    @GetMapping("/product")
    public List<Product> getProdectDetails(){
        return serviceObj.getProducts();
    }

    @GetMapping("/product/{prodID}")
    public Product getProductById(@PathVariable int prodID){
        return serviceObj.getProductById(prodID);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product prod){
        serviceObj.addProduct(prod);
    }


}
