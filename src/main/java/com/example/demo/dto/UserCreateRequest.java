package com.example.demo.dto.request;

import lombok.Data;

@Data
public class UserCreateRequest {
    private String name;
    private String email;
}