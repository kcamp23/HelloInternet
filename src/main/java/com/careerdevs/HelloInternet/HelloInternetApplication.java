package com.careerdevs.HelloInternet;

import com.careerdevs.HelloInternet.controllers.NasaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.RestTemplate;


import java.io.IOException;

@SpringBootApplication
public class HelloInternetApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloInternetApplication.class, args);


	}


//	public static void main(String[] args) throws IOException {
//		//GetAndPost.MyGETRequest();
//		//GetAndPost.MyPOSTRequest();
//	}
}
