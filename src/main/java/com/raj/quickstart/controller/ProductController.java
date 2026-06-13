package com.raj.quickstart.controller;

import com.raj.quickstart.model.Product;
import com.raj.quickstart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductController {


    @Autowired
    ProductService service;
    @GetMapping("/products")
    public List<Product> getProducts(){

        return service.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductbyId(@PathVariable int id){
        return service.getProductbyId(id);
    }

    @PostMapping("/product")
    public ResponseEntity<ApiResponse> addProduct(@RequestBody Product prod){
        try{
            service.addProduct(prod);

            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(new ApiResponse("Product Created Successfully"));
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(new ApiResponse("Failed to add product"));
        }
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Product Prod){
        System.out.println(Prod);
        service.updateProduct(Prod);
    }
}
