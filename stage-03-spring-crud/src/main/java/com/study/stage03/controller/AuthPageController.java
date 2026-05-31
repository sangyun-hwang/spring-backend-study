package com.study.stage03.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AuthPageController {

    @GetMapping("/mvc/login")
    public String loginPage(HttpSession session) {
        Object loginUser = session.getAttribute("loginUser");

        if (loginUser != null) {
            return "redirect:/mvc/study-logs";
        }

        return "auth/login";
    }

    @PostMapping("/mvc/login")
    public String login(
            @RequestParam String username,
            @RequestParam String password,
            Model model,
            HttpSession session
    ) {
        if ("student".equals(username) && "1234".equals(password)) {
            session.setAttribute("loginUser", username);

            return "redirect:/mvc/study-logs";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "auth/login";
        }
    }

//    @PostMapping("/mvc/logout")
//    public String logout(HttpSession session) {
//        session.invalidate();
//        return "redirect:/mvc/login";
//    }
}
