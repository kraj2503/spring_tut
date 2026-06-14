package com.raj.quickstart.service;

import com.raj.quickstart.model.Product;
import com.raj.quickstart.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Laptop", 50000), new Product(111, "PC", 50000), new Product(102, "desktop", 5432))
//
//    );

    public List<Product> getProducts() {
        return repo.findAll();

    }

    public Product getProductbyId(int prodId) {
//        return products.stream().filter(x -> x.getProdId() == prodId).findFirst().get();

        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod) {
//        products.add(prod);
        System.out.println(prod.toString());
        repo.save(prod);
    }

    public void updateProduct(Product prod) {

//        int index = 0;
//
//        for (Product p : products) {
//            if (p.getProdId() == prod.getProdId()) {
//                products.set(index, prod);
//                return;
//            }
//            index++;
//        }

        repo.save(prod);
    }


    //    public void deleteProduct(int prodId) {
//
//        int index = 0;
//
//        for (Product p : products) {
//
//            if (p.getProdId() == prodId) {
//                products.remove(index);
//                return;
//            }
//
//            index++;
//        }
//    }
    public void deleteProduct(int prodId) {
//        products.removeIf(p -> p.getProdId() == prodId);
        repo.deleteById(prodId);
    }
}
