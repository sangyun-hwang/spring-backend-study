package com.study.stage03.service;

import com.study.stage03.domain.StudyCategory;
import com.study.stage03.domain.StudyLog;
import com.study.stage03.dto.CreateStudyLogRequest;
import com.study.stage03.dto.StudyLogSummaryResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudyLogService {
    private final List<StudyLog> logs = new ArrayList<>(List.of(
            new StudyLog(
                    1L,
                    "Java class practice",
                    StudyCategory.JAVA,
                    60,
                    "field and constructor"
            ),
            new StudyLog(
                    2L,
                    "Java array practice",
                    StudyCategory.JAVA,
                    40,
                    "array basics"
            ),
            new StudyLog(
                    3L,
                    "Spring controller practice",
                    StudyCategory.SPRING,
                    50,
                    "RestController and GetMapping"
            )
    ));

    public StudyLog create(CreateStudyLogRequest request) {
        Long nextId = (long) (logs.size() + 1);

        StudyLog studyLog = new StudyLog(
                nextId,
                request.getTitle(),
                request.getCategory(),
                request.getMinutes(),
                request.getMemo()
        );

        logs.add(studyLog);

        return studyLog;
    }

    public StudyLog getSample() {
        return new StudyLog(
                1L,
                "Java class practice",
                StudyCategory.JAVA,
                60,
                "field and constructor");
    }

    public List<StudyLog> findAll(StudyCategory category) {
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

    public StudyLogSummaryResponse getSummary(StudyCategory category) {
        int totalMinutes = 0;

        for (StudyLog log : logs) {
            if (log.getCategory().equals(category)) {
                totalMinutes += log.getMinutes();
            }
        }

        return new StudyLogSummaryResponse(category, totalMinutes);
    }
}
