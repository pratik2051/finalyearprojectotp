package com.example.studentproject.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class EmployeeController {

    @RestController
    @RequestMapping("/api/v1/employee")
    @Tag(name = "employee")
    public static class ManagementController {


        @Operation(
                description = "Get endpoint for employee",
                summary = "This is a summary for employee get endpoint",
                responses = {
                        @ApiResponse(
                                description = "Success",
                                responseCode = "200"
                        ),
                        @ApiResponse(
                                description = "Unauthorized / Invalid Token",
                                responseCode = "403"
                        )
                }

        )
        @GetMapping
        public String get() {
            return "GET:: employee controller";
        }
        @PostMapping
        public String post() {
            return "POST:: employee controller";
        }
        @PutMapping
        public String put() {
            return "PUT:: employee controller";
        }
        @DeleteMapping
        public String delete() {
            return "DELETE:: employee controller";
        }
    }
}
