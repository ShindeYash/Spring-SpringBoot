package com.yash.simpleWebApp.services;


import com.yash.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.yash.simpleWebApp.model.Product;

@Service
public class ProductService {

//    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Iphone", 50000),
//            new Product(102, "Canon Camera", 70000),
//            new Product(103,"Shure Mic",10000)));

    @Autowired
    ProductRepo jpaObj;

    public List<Product> getProducts(){
        return jpaObj.findAll();
    }

    public Product getProductById(int prodId){
        return jpaObj.findById(prodId).orElse(new Product());
    }


    public void addProduct(Product prod){
        jpaObj.save(prod);
    }

    public void updateProduct(Product prod){
        jpaObj.save(prod);
    }

    public void deleteProduct(int id){
        jpaObj.deleteById(id);
    }



}
