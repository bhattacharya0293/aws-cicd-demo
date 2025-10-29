package com.example.aws_cicd_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aws")
public class ProductController {

    @GetMapping("/display")
    public String helloWorld(){
        return "Hello AWS CICD";
    }
}
