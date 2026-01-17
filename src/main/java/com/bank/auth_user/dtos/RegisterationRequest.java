package com.bank.auth_user.dtos;

import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RegisterationRequest {

    @NotBlank(message="Firstname is requires")
    private String firstName;

    private String lastName;

    private String phoneNumber;

    @NotBlank(message="email is required")
    @Email
    private String Email;

    private List<String> roles;

    @NotBlank(message= "Password is required")
    private String password;
}
