package com.study.stage03.controller;

import com.study.stage03.domain.StudyCategory;
import com.study.stage03.domain.StudyLog;
import com.study.stage03.repository.JdbcStudyLogRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JdbcStudyLogController {
    private final JdbcStudyLogRepository jdbcStudyLogRepository;

    public JdbcStudyLogController(JdbcStudyLogRepository jdbcStudyLogRepository) {
        this.jdbcStudyLogRepository = jdbcStudyLogRepository;
    }

    @GetMapping("/jdbc-study-logs")
    public List<StudyLog> getJdbcStudyLogs(
            @RequestParam(required = false) StudyCategory category
    ) {
        if (category == null) {
            return jdbcStudyLogRepository.findAll();
        }

        return jdbcStudyLogRepository.findByCategory(category);
    }


}
