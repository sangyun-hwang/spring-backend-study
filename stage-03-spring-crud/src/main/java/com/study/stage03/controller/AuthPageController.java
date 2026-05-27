package com.study.stage03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AuthPageController {

    @GetMapping("/mvc/login")
    public String loginPage() {
        return "auth/login";
    }

    @PostMapping("/mvc/login")
    public String login(
            @RequestParam String username,
            @RequestParam String password,
            Model model
    ) {
        if (username.equals("student") && password.equals("1234")) {
            return "redirect:/mvc/study-logs";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "auth/login";
        }
    }
}
