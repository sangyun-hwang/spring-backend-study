package com.study.stage03.controller;

import com.study.stage03.dto.SignupRequest;
import com.study.stage03.mapper.UserMapper;
import jakarta.validation.Valid;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupPageController {
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    public SignupPageController(UserMapper userMapper, PasswordEncoder passwordEncoder) {
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/mvc/signup")
    public String signupPage() {
        return "auth/signup";
    }

    @PostMapping("/mvc/signup")
    public String signup(
            @Valid @ModelAttribute SignupRequest request,
            BindingResult bindingResult,
            Model model
    ) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getFieldErrors());
            return "auth/signup";
        }

        String encodedPassword = passwordEncoder.encode(request.getPassword());

        userMapper.save(
                request.getUsername(),
                encodedPassword,
                "ROLE_USER",
                true
        );

        return "redirect:/mvc/login";
    }
}
