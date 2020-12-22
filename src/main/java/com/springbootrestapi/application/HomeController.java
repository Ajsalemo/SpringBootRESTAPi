package com.springbootrestapi.application;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan("com.springbootrestapi.application.controllers")
public class HomeController {
    @Value("${app.version}")
    private String appVersion;
    public static void main(String[] args) {
        SpringApplication.run(HomeController.class, args);
    }

    @GetMapping("/")
    public Map hello() {
        Map map = new HashMap<String, String>();
        map.put("SpringBootRestAPi - application version: ", appVersion);
        return map;
    }
}