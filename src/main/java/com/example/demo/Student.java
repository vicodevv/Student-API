package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Data
@Document
public class Student {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private Gender gender;
    private Address address;
    private List<String> courses;
    private LocalDateTime createdAt;

    public Student(String firstName, 
                    String lastName, 
                    String email,
                    Gender gender,
                    Address address,
                    List<String> courses,
                    LocalDateTime createdAt) {

            this.firstname = firstName;
            this.lastname = lastName;
            this.email = email;
            this.gender = gender;
            this.address = address;
            this.courses = courses;
            this.createdAt = createdAt;
    }
}
