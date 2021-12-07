package com.example.project400;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController //Allows for serving endpoints
public class Project400Application {

	public static void main(String[] args) {
		SpringApplication.run(Project400Application.class, args);
	}

}
