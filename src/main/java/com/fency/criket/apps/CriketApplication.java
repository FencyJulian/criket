package com.fency.criket.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CriketApplication {

	public static void main(String[] args) {
		SpringApplication.run(CriketApplication.class, args);
	}

	@GetMapping("/")
	ResponseEntity<String> postMethod(){
		System.out.println("Server uses Get Method");
		return ResponseEntity.status(200).body("Working Perfectly");
	}

}
