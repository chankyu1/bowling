package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	// The following main method uses Spring Boot to launch an application on a browser without having any web engine installed
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
