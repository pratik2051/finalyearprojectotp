package com.example.studentproject.controller;

import com.example.studentproject.dto.requests.ForgotPasswordRequest;
import com.example.studentproject.dto.responses.GeneralAPIResponse;
import com.example.studentproject.dto.responses.UserProfile;
import com.example.studentproject.service.AuthenticationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/profile")
public class ProfileController {
    private final AuthenticationService authenticationService;


    @Operation(summary = "My Profile", description = "Retrieve user profile information.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK: User profile retrieved successfully",
                    content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = UserProfile.class))),
            @ApiResponse(responseCode = "404", description = "Not Found: User not found",
                    content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = GeneralAPIResponse.class))),

    })
    @PostMapping("/myProfile")
    public ResponseEntity<?> myProfile(@Valid @RequestBody ForgotPasswordRequest forgotPasswordRequest){
        log.info("My profile request received for email {}", forgotPasswordRequest.getEmail());
        return authenticationService.myProfile(forgotPasswordRequest);
    }

}
