package com.careerdevs.HelloInternet.controllers;


import com.careerdevs.HelloInternet.HelloInternetApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/nasa")
public class NasaController {


        private static String myNasaKey = "N5ltZZMg0SKW5mRRZd6ydZsKGNPBxIx5QCi85gee";

        private static String nasaApodEndpoint = "https://api.nasa.gov/planetary/apod?api_key=" + myNasaKey;

        @GetMapping("/apod")



        public static Object getApodHandler (RestTemplate restTemplate) {
                     return restTemplate.getForObject(nasaApodEndpoint, Object.class);
                }

    public static String getNasaApodEndpoint() {
        return  nasaApodEndpoint;
            }


}










