package com.bank.auth_user.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class ResetPasswordRequest {
    // will be used to request for forgot password
    private  String email;
    private String code;
    private String newPassword;
}
