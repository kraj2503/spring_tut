package com.raj.quickstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class dev {


    @Autowired
//    @Qualifier("laptop")
    @Qualifier("desktop")
    private Computer comp;

    public void build() {

        comp.compile();


        System.out.println("build dev");
    }
}
