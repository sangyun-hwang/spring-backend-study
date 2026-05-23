package com.study.stage03.controller;

import com.study.stage03.mapper.StudyLogMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudyLogPageController {
    private final StudyLogMapper studyLogMapper;

    public StudyLogPageController(StudyLogMapper studyLogMapper) {
        this.studyLogMapper = studyLogMapper;
    }

    @GetMapping("/mvc/study-logs")
    public String studyLogListPage(Model model) {
        model.addAttribute("message", "Model data is working.");
        model.addAttribute("logs", studyLogMapper.search(null, null));
        return "study-log/list";
    }
}
