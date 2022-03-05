package com.careerdevs.HelloInternet.controllers;

import org.springframework.web.bind.annotation.GetMapping;#RestController
public class RootController {

     @GetMapping ("/")

    private String  rootRoute(){
        return "you requested the route code";
    }
}
