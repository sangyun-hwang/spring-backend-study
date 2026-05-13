package com.study.stage03.repository;

import com.study.stage03.domain.StudyCategory;
import com.study.stage03.domain.StudyLog;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudyLogRepository {
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

    public StudyLog save(StudyLog studyLog) {
        logs.add(studyLog);

        return studyLog;
    }

    public List<StudyLog> findAll() {
        return logs;
    }
}
