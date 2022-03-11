package com.jeyaprabakar.advancedprogramming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TechmartBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechmartBackendApplication.class, args);
	}

}
