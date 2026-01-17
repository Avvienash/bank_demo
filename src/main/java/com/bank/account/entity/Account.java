package com.bank.account.entity;

import java.math.BigDecimal;
import java.util.Currency;

import com.bank.auth_user.entity.User;
import com.bank.enums.AccountStatus;
import com.bank.enums.AccountType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@Table(name="accounts")
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false,unique=true,length=15)
    private String accountNumber;

    @Column(nullable=false,precision=19,scale=2)
    @Default
    private BigDecimal balance = BigDecimal.ZERO;

    @Enumerated(EnumType.STRING)
    @Column(nullable=false)
    private AccountType accountType;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    @Enumerated(EnumType.STRING)
    private Currency currency;

    @Enumerated(EnumType.STRING)
    private AccountStatus status;

    // @OneToMany(mappedBy="account",cascade=CascadeType.ALL,orphanRemoval=true,fetch=FetchType.LAZY)
    // @Default
    // private List<Transaction> transactions = new ArrayList<>();
}
