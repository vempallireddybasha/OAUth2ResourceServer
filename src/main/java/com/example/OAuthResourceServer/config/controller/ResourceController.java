package com.example.OAuthResourceServer.config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("api/v1")
public class ResourceController {

    @GetMapping("/users")
    public String[] users() {
        return new String[]{"vempalli","reddybasha"," yasmin"};
    }
}
