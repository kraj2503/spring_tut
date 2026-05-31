package com.raj.quickstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class dev {


    @Autowired
    private Laptop laptop;

    public void build() {

        laptop.compile();


        System.out.println("build dev");
    }
}
