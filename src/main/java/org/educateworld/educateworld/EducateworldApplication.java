package org.educateworld.educateworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"org.educateworld.educateworld.model"})
public class EducateworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(EducateworldApplication.class, args);
	}
}
