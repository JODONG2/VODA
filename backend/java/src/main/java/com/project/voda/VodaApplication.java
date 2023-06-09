package com.project.voda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class VodaApplication {

	public static void main(String[] args) {

		SpringApplication.run(VodaApplication.class, args);

	}

}
