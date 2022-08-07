package com.devcamp.devkurly.controller;

import com.devcamp.devkurly.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final TestService testService;

    public HomeController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/")
    public String home() {


        return "home";
    }


}
