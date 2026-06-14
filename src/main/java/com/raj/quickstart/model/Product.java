package com.raj.quickstart.model;


import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor


@Entity
public class Product {

    @Id
    private int prodId;
    private String prodName;
    private int price;

    public Product() {

    }
}
