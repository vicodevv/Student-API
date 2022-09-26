package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(StudentRepository repository){
		return args -> {
			Address address = new Address(
				"Nigeria",
				"Lagos",
				"SW1A 1AA"
			);
			Student student = new Student(
				"Victor", 
				"Omoniyi",
				"vomoniyi2001@gmail.com", 
				Gender.MALE,
				address,
				"Computer Science", 
				LocalDateTime.now()
			);
		repository.insert(student);
		};
	}
}