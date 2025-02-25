package com.example.cosmosdbapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CosmosdbappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CosmosdbappApplication.class, args);
	}

}
