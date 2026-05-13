package com.study.stage03.service;

import com.study.stage03.domain.StudyCategory;
import com.study.stage03.domain.StudyLog;
import com.study.stage03.dto.CreateStudyLogRequest;
import com.study.stage03.dto.StudyLogSummaryResponse;
import com.study.stage03.repository.StudyLogRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudyLogService {
    private final StudyLogRepository studyLogRepository;

    public StudyLogService(StudyLogRepository studyLogRepository) {
        this.studyLogRepository = studyLogRepository;
    }

    public StudyLog create(CreateStudyLogRequest request) {
        Long nextId = (long) (studyLogRepository.findAll().size() + 1);

        StudyLog studyLog = new StudyLog(
                nextId,
                request.getTitle(),
                request.getCategory(),
                request.getMinutes(),
                request.getMemo()
        );

        return studyLogRepository.save(studyLog);
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
        List<StudyLog> logs = studyLogRepository.findAll();

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
        List<StudyLog> logs = studyLogRepository.findAll();
        int totalMinutes = 0;

        for (StudyLog log : logs) {
            if (log.getCategory().equals(category)) {
                totalMinutes += log.getMinutes();
            }
        }

        return new StudyLogSummaryResponse(category, totalMinutes);
    }

    public StudyLog findById(Long id) {
        return studyLogRepository.findById(id);
    }
}
