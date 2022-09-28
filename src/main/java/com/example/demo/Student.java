package com.example.demo;

import java.time.LocalDateTime;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Data
@Document
public class Student {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    @Indexed(unique = true)
    private String email;
    private Gender gender;
    private Address address;
    private String department;
    private LocalDateTime createdAt;

    public Student(String firstName, 
                    String lastName, 
                    String email,
                    Gender gender,
                    Address address,
                    String department,
                    LocalDateTime createdAt) {

            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.gender = gender;
            this.address = address;
            this.department = department;
            this.createdAt = createdAt;
    }
}
