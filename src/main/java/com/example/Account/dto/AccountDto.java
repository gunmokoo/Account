package com.example.Account.dto;

import com.example.Account.domain.Account;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountDto {
    private Long userId;
    private String accountNumber;
    private Long balance;

    private LocalDateTime registerdAt;
    private LocalDateTime unRegisterdAt;

    public static AccountDto fromEntity(Account account){
        return AccountDto.builder()
                .userId(account.getAccountUser().getId())
                .accountNumber(account.getAccountNumber())
                .balance(account.getBalance())
                .registerdAt(account.getRegisteredAt())
                .unRegisterdAt(account.getUnRegisteredAt())
                .build();
    }
}
