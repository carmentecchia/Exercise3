package com.example.Exercise3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//scrivi una applicazione web Spring Boot con:
//NameController dove si mappa il parametro name per:
//restituire il nome alla chiamata GET
//restuiture il nome al contrario (es. da John a nhoJ, usando StringBuilder) alla chiamata POST
//testare le chiamate del API endpoint usando Postman
@SpringBootApplication
public class Exercise3Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercise3Application.class, args);
	}

}
