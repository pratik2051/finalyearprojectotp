package com.example.studentproject.dto.requests;

import com.example.studentproject.model.Gender;
import com.example.studentproject.model.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterRequest {
    @NotBlank(message = "First name can't be blank")
    private String firstName;
    @NotBlank(message = "Last name can't be blank")
    private String lastName;
    @NotBlank(message = "Email can't be blank")
    @Email(message = "Invalid email entered")
    private String email;
    @NotBlank(message = "Password can't be blank")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$", message = "Password must contain at least 8 characters, one uppercase, one lowercase and one number")
    private String password;
    @NotNull(message ="Please choose your gender")
    private Gender gender;
    @Pattern(regexp = "^\\+\\d{1,3}\\d{10}$", message = "Invalid phone number, please enter in the format +(code)XXXXXXXXXX")
    private String phoneNumber;
    @NotNull(message = "Please choose a role")
    private Role role;
}
