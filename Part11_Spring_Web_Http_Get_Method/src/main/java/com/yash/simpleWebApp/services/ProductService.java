package com.yash.simpleWebApp.services;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

import com.yash.simpleWebApp.model.Product;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(new Product(101, "Iphone", 50000),
            new Product(102, "Canon Camera", 70000),
            new Product(103,"Shure Mic",10000));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId){
        for(int i = 0; i < products.toArray().length; i++){
            if(products.get(i).getProdID() == prodId){
                return products.get(i);
            }
        }
        return new Product(0, "Not Found", 0);
    }

}
