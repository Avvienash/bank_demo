package com.bank.auth_user.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UpdatePasswordRequest {
    
    @NotBlank(message="New Password is required")
    private String NewPassword;

    @NotBlank(message="Old Password is required")
    private String OldPassword;
}
