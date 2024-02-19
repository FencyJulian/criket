package com.fency.criket.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.fency.criket.repositories")
@ComponentScan(basePackages = "com.fency.criket.controllers")
public class CriketApplication {

	public static void main(String[] args) {
		SpringApplication.run(CriketApplication.class, args);
	}
}
