package com.raj.quickstart.controller;

import com.raj.quickstart.model.Product;
import com.raj.quickstart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ProductController {


    @Autowired
    ProductService service;
    @RequestMapping("/products")
    public List<Product> getProducts(){

        return service.getProducts();
    }

    @RequestMapping("/products/{id}")
    public Product getProductbyId(@PathVariable int id){
        return service.getProductbyId(id);
    }
}
