package com.example.studentproject;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableCaching
@EnableAsync
@EnableRetry
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class StudentProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentProjectApplication.class, args);
    }

    }

