package com.raj.quickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {

    @GetMapping(path = "/")
    public String Homepage(){
        return "this is homepage";
    }
}
