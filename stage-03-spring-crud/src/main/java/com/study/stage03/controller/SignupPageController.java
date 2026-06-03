package com.study.stage03.controller;

import com.study.stage03.dto.SignupRequest;
import com.study.stage03.service.SignupService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupPageController {
    private final SignupService signupService;

    public SignupPageController(SignupService signupService) {
        this.signupService = signupService;
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
            model.addAttribute("signupRequest", request);
            return "auth/signup";
        }

        if (signupService.isUsernameDuplicated(request.getUsername())) {
            model.addAttribute("usernameError", "username already exists");
            model.addAttribute("signupRequest", request);
            return "auth/signup";
        }

        signupService.signup(request);

        return "redirect:/mvc/login?signupSuccess";
    }
}
