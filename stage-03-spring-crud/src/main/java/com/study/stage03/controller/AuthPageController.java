package com.study.stage03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AuthPageController {

    @GetMapping("/mvc/login")
    public String loginPage() {
        return "auth/login";
    }
}
