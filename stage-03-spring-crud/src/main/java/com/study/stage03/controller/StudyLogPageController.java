package com.study.stage03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudyLogPageController {

    @GetMapping("/mvc/study-logs")
    public String studyLogListPage() {
        return "study-log/list";
    }
}
