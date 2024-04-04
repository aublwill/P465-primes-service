package edu.iu.aublwill.primesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"edu.iu.aublwill.primesservice.repository"})
public class PrimesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimesServiceApplication.class, args);
	}

}
