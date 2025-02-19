package com.fmahadybd.book.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RegistrationRequest {
 @NotNull(message = "Firstname is mandatory")
    @NotBlank(message = "First name will not be blank")
    private String firstname;

    @NotNull(message="Lastname is mandatory")
    @NotBlank(message="Last name will not be blank")
    private String lastname;


    @NotNull(message = "Email is mandatory")
    @Email(message = "Email is not formatted")
    @NotBlank(message = "Email is not be null")
    private String email;

    @NotNull(message = "Password needs")
    @NotBlank(message = "Password is mandatory")
    @Size(min = 8, message = "Password must be longger then 8 character")
    private String password;
}
