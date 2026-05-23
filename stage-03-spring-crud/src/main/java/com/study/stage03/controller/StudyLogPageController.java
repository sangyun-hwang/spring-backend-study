package com.study.stage03.controller;

import com.study.stage03.domain.StudyCategory;
import com.study.stage03.mapper.StudyLogMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudyLogPageController {
    private final StudyLogMapper studyLogMapper;

    public StudyLogPageController(StudyLogMapper studyLogMapper) {
        this.studyLogMapper = studyLogMapper;
    }

    @GetMapping("/mvc/study-logs")
    public String studyLogListPage(
            @RequestParam(required = false) String title,
            @RequestParam(required = false) StudyCategory category,
            Model model
    ) {
        model.addAttribute("message", "Model data is working.");
        model.addAttribute("logs", studyLogMapper.search(title, category));
        model.addAttribute("title", title);
        model.addAttribute("category", category);
        return "study-log/list";
    }
}
