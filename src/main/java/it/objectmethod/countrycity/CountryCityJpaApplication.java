package it.objectmethod.countrycity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "it.objectmethod.countrycity")
public class CountryCityJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountryCityJpaApplication.class, args);
	}
}
