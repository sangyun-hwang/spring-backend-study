package com.study.stage03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudyLogPageController {

    @GetMapping("/mvc/study-logs")
    public String studyLogListPage(Model model) {
        model.addAttribute("message", "Model data is working.");
        return "study-log/list";
    }
}
