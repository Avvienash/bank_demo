package com.bank.auth_user.dtos;

import java.time.LocalDateTime;
import java.util.List;

import com.bank.role.entity.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    @JsonIgnore
    private String password;

    private String profilePictureUrl;
    private Boolean active;

    // Prefer RoleDTO if possible
    private List<Role> roles;

    // @JsonManagedReference
    // private List<AccountDTO> accounts;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
