package com.liuze.majiang.contoller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("/health-check")
    public String healthCheck(){
        return applicationName + "-health-true";
    }

}
