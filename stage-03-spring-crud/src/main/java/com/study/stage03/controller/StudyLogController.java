package com.study.stage03.controller;

import com.study.stage03.domain.StudyCategory;
import com.study.stage03.domain.StudyLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/study-logs")
    public List<StudyLog> getStudyLogs() {
        return List.of(
                new StudyLog(
                        1L,
                        "Java class practice",
                        StudyCategory.JAVA,
                        60,
                        "field and constructor"),
                new StudyLog(
                        2L,
                        "Java array practice",
                        StudyCategory.JAVA,
                        40,
                        "array basics"),
                new StudyLog(
                        3L,
                        "Spring controller practice",
                        StudyCategory.SPRING,
                        50,
                        "RestController and GetMapping")
        );
    }
}
