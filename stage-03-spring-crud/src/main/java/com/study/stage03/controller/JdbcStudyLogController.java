package com.study.stage03.controller;

import com.study.stage03.domain.StudyCategory;
import com.study.stage03.domain.StudyLog;
import com.study.stage03.dto.CreateStudyLogRequest;
import com.study.stage03.dto.UpdateStudyLogRequest;
import com.study.stage03.repository.JdbcStudyLogRepository;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("/jdbc-study-logs/{id}")
    public StudyLog getJdbcStudyLog(@PathVariable Long id) {
        return jdbcStudyLogRepository.findById(id);
    }

    @PostMapping("/jdbc-study-logs")
    public StudyLog createJdbcStudyLog(@Valid @RequestBody CreateStudyLogRequest request) {
        Long nextId = jdbcStudyLogRepository.getNextId();

        StudyLog studyLog = new StudyLog(
                nextId,
                request.getTitle(),
                request.getCategory(),
                request.getMinutes(),
                request.getMemo()
        );

        return jdbcStudyLogRepository.save(studyLog);
    }

    @PatchMapping("/jdbc-study-logs/{id}")
    public StudyLog updateJdbcStudyLog(
            @PathVariable Long id,
            @RequestBody UpdateStudyLogRequest request
    ) {
        StudyLog studyLog = jdbcStudyLogRepository.findById(id);

        String title = request.getTitle() == null
                ? studyLog.getTitle()
                : request.getTitle();

        StudyCategory category = request.getCategory() == null
                ? studyLog.getCategory()
                : request.getCategory();

        int minutes = request.getMinutes() == null
                ? studyLog.getMinutes()
                : request.getMinutes();

        String memo = request.getMemo() == null
                ? studyLog.getMemo()
                : request.getMemo();

        StudyLog updatedLog = new StudyLog(
                studyLog.getId(),
                title,
                category,
                minutes,
                memo
        );

        return jdbcStudyLogRepository.update(updatedLog);
    }

    @DeleteMapping("/jdbc-study-logs/{id}")
    public ResponseEntity<Void> deleteJdbcStudyLog(@PathVariable Long id) {
        jdbcStudyLogRepository.delete(id);

        return ResponseEntity.noContent().build();
    }
}
