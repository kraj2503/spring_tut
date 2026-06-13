package com.raj.quickstart.service;

import com.raj.quickstart.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {


    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Laptop", 50000), new Product(111, "PC", 50000), new Product(102, "desktop", 5432))

    );


    public List<Product> getProducts() {
        return products;
    }

    public Product getProductbyId(int prodId) {
        return products.stream().filter(x -> x.getProdId() == prodId).findFirst().get();
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }
}
