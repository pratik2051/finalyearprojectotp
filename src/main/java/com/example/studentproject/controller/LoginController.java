package com.example.studentproject.controller;

import com.example.studentproject.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/api/v1/")
    @PreAuthorize("hasRole('ADMIN')")
    public class LoginController {

        @RestController
        @RequestMapping("/api")
        public class UserController {

            private final UserService userService;
            public UserController(UserService userService) {
                this.userService = userService;
            }

            }
            @PostMapping("/logout")
            public ResponseEntity<?> logout() {
                // Perform logout logic
                // Invalidate token or session
                return ResponseEntity.ok("Logout successful");
            }
        }






