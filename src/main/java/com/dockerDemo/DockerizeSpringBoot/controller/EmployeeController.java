package com.dockerDemo.DockerizeSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @GetMapping("/get-all")
    public String getAllEmployees() {
        return "Hello World Sai Hlyan Phyoe";
    }
}
