package com.example.demo;

import java.time.LocalDateTime;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(StudentRepository repository, MongoTemplate mongoTemplate){
		return args -> {
			Address address = new Address(
				"Nigeria",
				"Lagos",
				"SW1A 1AA"
			);
			String email = "vomoniyi2001@gmail.com";
			Student student = new Student(
				"Victor", 
				"Omoniyi",
				email, 
				Gender.MALE,
				address,
				"Computer Science", 
				LocalDateTime.now()
			);
			repository.findStudentbyEmail(email)
				.ifPresentOrElse(s ->{
					System.out.println(s + "already exists");  
				}, ()->{
					System.out.println("Inserting Student" + student);
					repository.insert(student);
				});
		
		};

	}
	//	Query query = new Query();
		//	query.addCriteria(Criteria.where("email").is(email));
			
		//	List<Student> students = MongoTemplate.find(query, Student.class);
		//	if (students.size() > 1){
		//		throw new IllegalStateException("Student already exists" + email);
		//	}
		//	if (students.isEmpty()){
		//		System.out.println("Inserting Student" + student);
		//		repository.insert(student);
		//	}
		//	else{ 
		//		System.out.println(student + "already exists");  
		//	}
		//	repository.insert(student);
		//		repository.save(student);
}