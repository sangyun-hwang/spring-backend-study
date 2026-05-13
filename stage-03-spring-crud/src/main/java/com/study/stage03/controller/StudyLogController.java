package com.study.stage03.controller;

import com.study.stage03.domain.StudyCategory;
import com.study.stage03.domain.StudyLog;
import com.study.stage03.dto.CreateStudyLogRequest;
import com.study.stage03.dto.StudyLogSummaryResponse;
import com.study.stage03.service.StudyLogService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudyLogController {
    private final StudyLogService studyLogService;

    public StudyLogController(StudyLogService studyLogService) {
        this.studyLogService = studyLogService;
    }

    @PostMapping("/study-logs")
    public StudyLog createStudyLog(@Valid @RequestBody CreateStudyLogRequest request) {
        return studyLogService.create(request);
    }

    @GetMapping("/study-logs/sample")
    public StudyLog getStudyLogSample() {
        return studyLogService.getSample();
    }

    @GetMapping("/study-logs")
    public List<StudyLog> getStudyLogs(@RequestParam(required = false) StudyCategory category) {
        return studyLogService.findAll(category);
    }

    @GetMapping("/study-logs/summary")
    public StudyLogSummaryResponse getSummary(@RequestParam StudyCategory category) {
        return studyLogService.getSummary(category);
    }

    @GetMapping("/study-logs/{id}")
    public StudyLog getStudyLog(@PathVariable Long id) {
        return studyLogService.findById(id);
    }
}
