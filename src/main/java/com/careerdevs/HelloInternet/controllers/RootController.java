package com.careerdevs.HelloInternet.controllers;

            import org.springframework.web.bind.annotation.RestController;
            import org.springframework.web.bind.annotation.GetMapping;
@RestController
            public class RootController {
    @GetMapping ("/")


    public String  rootRoute(){
        return "you requested the route code";
    }
}
