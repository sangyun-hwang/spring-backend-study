package com.study.stage03.controller;

import com.study.stage03.domain.StudyCategory;
import com.study.stage03.domain.StudyLog;
import com.study.stage03.dto.CreateStudyLogRequest;
import com.study.stage03.dto.UpdateStudyLogRequest;
import com.study.stage03.exception.StudyLogNotFoundException;
import com.study.stage03.mapper.StudyLogMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/mvc/study-logs/new")
    public String newStudyLogPage() {
        return "study-log/new";
    }

    @PostMapping("/mvc/study-logs")
    public String createStudyLog(@ModelAttribute CreateStudyLogRequest request) {
        StudyLog studyLog = new StudyLog(
                studyLogMapper.getNextId(),
                request.getTitle(),
                request.getCategory(),
                request.getMinutes(),
                request.getMemo()
        );

        studyLogMapper.save(studyLog);

        return "redirect:/mvc/study-logs";
    }

    @GetMapping("/mvc/study-logs/{id}/edit")
    public String editStudyLogPage(@PathVariable Long id, Model model) {
        StudyLog studyLog = studyLogMapper.findById(id);

        if (studyLog == null) {
            throw new StudyLogNotFoundException();
        }

        model.addAttribute("log", studyLog);

        return "study-log/edit";
    }

    @PostMapping("/mvc/study-logs/{id}/edit")
    public String updateStudyLog(
            @PathVariable Long id,
            @ModelAttribute UpdateStudyLogRequest request
    ) {
        StudyLog studyLog = studyLogMapper.findById(id);

        if (studyLog == null) {
            throw new StudyLogNotFoundException();
        }

        studyLogMapper.updatePartial(id, request);

        return "redirect:/mvc/study-logs";
    }

    @PostMapping("/mvc/study-logs/{id}/delete")
    public String deleteStudyLog(@PathVariable Long id) {
        int deleteRows = studyLogMapper.delete(id);

        if (deleteRows == 0) {
            throw new StudyLogNotFoundException();
        }

        return "redirect:/mvc/study-logs";
    }
}
