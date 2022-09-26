package com.example.demo;

import java.time.ZonedDateTime;
import java.util.List;

import lombok.Data;

@Data
public class Student {
    private String firstname;
    private String lastname;
    private String email;
    private Gender gender;
    private Address address;
    private List<String> courses;
    private ZonedDateTime createdAt;
}
