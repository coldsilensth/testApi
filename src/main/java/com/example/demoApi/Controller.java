package com.example.demoApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/data")
    public String getData() {
        return "This is my API data!";
    }
}
