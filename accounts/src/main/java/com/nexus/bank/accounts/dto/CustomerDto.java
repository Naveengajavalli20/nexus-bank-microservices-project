package com.nexus.bank.accounts.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class CustomerDto {

    @NotEmpty(message = "Please provide Name")
    @Size(min = 5, max = 25, message = "The length of the name should be between 5 and 25")
    private String name;

    @NotEmpty(message = "Please provide email address")
    @Email(message = "please provide valid email address")
    private String email;

    @Pattern(regexp = "($|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
