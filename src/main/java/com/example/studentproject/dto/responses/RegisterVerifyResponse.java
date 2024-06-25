package com.example.studentproject.dto.responses;

import com.example.studentproject.model.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterVerifyResponse {
    private String accessToken ;
    private String refreshToken ;
    private String firstName ;
    private String lastName ;
    private String email ;
    private Role role;
    private boolean isVerified;
}
