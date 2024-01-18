package com.health.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
public class ApnaFainanceAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApnaFainanceAppApplication.class, args);
	}

}
