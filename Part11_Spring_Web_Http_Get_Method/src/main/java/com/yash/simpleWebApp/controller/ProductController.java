package com.yash.simpleWebApp.controller;

import com.yash.simpleWebApp.model.Product;
import com.yash.simpleWebApp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
public class ProductController {

    @Autowired
    ProductService obj;

// For Get Request annotations we can use any of the following 3.

    @RequestMapping("/product")
//    @RequestMapping(value = "/product", method = RequestMethod.GET)
//    @GetMapping("/product")
    public List<Product> getProdectDetails(){
        return obj.getProducts();
    }

    @RequestMapping("/product/{prodID}")
    public Product getProductById(@PathVariable int prodID){
        return obj.getProductById(prodID);
    }
}
