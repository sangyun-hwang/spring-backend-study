package com.study.stage03.controller;

import com.study.stage03.domain.StudyCategory;
import com.study.stage03.domain.StudyLog;
import com.study.stage03.dto.StudyLogSummaryResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudyLogController {
    private final List<StudyLog> logs = new ArrayList<>(List.of(
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
    ));


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
    public List<StudyLog> getStudyLogs(@RequestParam(required = false) StudyCategory category) {
        if (category == null) {
            return logs;
        }

        List<StudyLog> filteredLogs = new ArrayList<>();

        for (StudyLog log : logs) {
            if (log.getCategory().equals(category)) {
                filteredLogs.add(log);
            }
        }

        return filteredLogs;
    }

    @GetMapping("/study-logs/summary")
    public StudyLogSummaryResponse getSummary(@RequestParam StudyCategory category) {
        int totalMinutes = 0;

        for (StudyLog log : logs) {
            if (log.getCategory().equals(category)) {
                totalMinutes += log.getMinutes();
            }
        }

        return new StudyLogSummaryResponse(category, totalMinutes);
    }
}
