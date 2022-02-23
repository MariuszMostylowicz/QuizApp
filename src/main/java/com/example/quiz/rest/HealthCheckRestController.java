package com.example.quiz.rest;

import com.example.quiz.dto.HealthcheckDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class HealthCheckRestController {

    @GetMapping
    public HealthcheckDto healthcheck() {
        HealthcheckDto dto = new HealthcheckDto(true,"It's working");
        return dto;
    }
}
