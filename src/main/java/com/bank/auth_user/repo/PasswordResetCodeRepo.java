package com.bank.auth_user.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.auth_user.entity.PasswordResetCode;

public interface PasswordResetCodeRepo extends JpaRepository<PasswordResetCode,Long> {
    Optional<PasswordResetCode> findByCode(String code);
    void deleteByUserId(Long userId);
}
