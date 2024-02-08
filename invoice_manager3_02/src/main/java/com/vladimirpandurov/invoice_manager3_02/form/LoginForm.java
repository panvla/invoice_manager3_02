package com.vladimirpandurov.invoice_manager3_02.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class LoginForm {
    @NotEmpty(message = "Email cannot be empty")
    @Email(message = "Invalid email. please enter a valid email address")
    private String email;
    @NotEmpty(message = "Password cannot be empty")
    private String password;

}
