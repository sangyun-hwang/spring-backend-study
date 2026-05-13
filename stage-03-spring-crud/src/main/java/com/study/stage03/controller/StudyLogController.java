package com.study.stage03.controller;

import com.study.stage03.domain.StudyCategory;
import com.study.stage03.domain.StudyLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudyLogController {
    @GetMapping("/study-logs/sample")
    public StudyLog getStudyLogSample() {
        return new StudyLog(
                1L,
                "Java class practice",
                StudyCategory.JAVA,
                60,
                "field and constructor");
    }
}
