package com.study.stage03.controller;

import com.study.stage03.domain.StudyCategory;
import com.study.stage03.domain.StudyLog;
import com.study.stage03.dto.CreateStudyLogRequest;
import com.study.stage03.dto.UpdateStudyLogRequest;
import com.study.stage03.exception.StudyLogNotFoundException;
import com.study.stage03.mapper.StudyLogMapper;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
            Model model,
            HttpSession session,
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        int offset = (page - 1) * size;

        model.addAttribute("page", page);
        model.addAttribute("size", size);
        model.addAttribute("offset", offset);

        Object loginUser = session.getAttribute("loginUser");
        model.addAttribute("loginUser", loginUser);

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
    public String createStudyLog(
            @Valid @ModelAttribute CreateStudyLogRequest request,
            BindingResult bindingResult,
            Model model
    ) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("request", request);
            model.addAttribute("errors", bindingResult.getFieldErrors());
            return "study-log/new";
        }

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
    public String editStudyLogPage(
            @PathVariable Long id,
            Model model
    ) {
        StudyLog studyLog = studyLogMapper.findById(id);

        if (studyLog == null) {
            throw new StudyLogNotFoundException();
        }

        model.addAttribute("id", id);
        model.addAttribute("request", studyLog);

        return "study-log/edit";
    }

    @PostMapping("/mvc/study-logs/{id}/edit")
    public String updateStudyLog(
            @PathVariable Long id,
            @Valid @ModelAttribute UpdateStudyLogRequest request,
            BindingResult bindingResult,
            Model model
    ) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getFieldErrors());
            model.addAttribute("id", id);
            model.addAttribute("request", request);

            return "study-log/edit";
        }

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
