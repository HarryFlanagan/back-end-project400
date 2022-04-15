package com.example.project400;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@RestController //Allows for serving endpoints
@Configuration
@EnableSwagger2
public class Project400Application {

	public static void main(String[] args) {
		SpringApplication.run(Project400Application.class, args);
	}

}
