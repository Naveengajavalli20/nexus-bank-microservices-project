package com.nexus.bank.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

    @Pattern(regexp = "($|[0-9]{10})", message = "Account number must be 10 digits")
    @NotEmpty(message = "Account number can not be empty or null")
    private Long accountNumber;

    @NotEmpty(message = "Account type can not be null/empty")
    private String accountType;

    @NotEmpty(message = "Branch address can not be null/Empty")
    private String branchAddress;
}
