package com.study.stage03.controller;

import com.study.stage03.domain.StudyCategory;
import com.study.stage03.domain.StudyLog;
import com.study.stage03.dto.CreateStudyLogRequest;
import com.study.stage03.dto.UpdateStudyLogRequest;
import com.study.stage03.exception.StudyLogNotFoundException;
import com.study.stage03.mapper.StudyLogMapper;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mybatis-study-logs")
public class MyBatisStudyLogController {
    private final StudyLogMapper studyLogMapper;


    public MyBatisStudyLogController(StudyLogMapper studyLogMapper) {
        this.studyLogMapper = studyLogMapper;
    }

    @GetMapping
    public List<StudyLog> getStudyLogs(
            @RequestParam(required = false) String title,
            @RequestParam(required = false) StudyCategory category
    ) {
        return studyLogMapper.search(title, category);
    }

    @GetMapping("/{id}")
    public StudyLog getStudyLog(@PathVariable Long id) {
        return studyLogMapper.findById(id);
    }

    @PostMapping
    public StudyLog createStudyLog(@Valid @RequestBody CreateStudyLogRequest request) {
        StudyLog studyLog = new StudyLog(
                studyLogMapper.getNextId(),
                request.getTitle(),
                request.getCategory(),
                request.getMinutes(),
                request.getMemo()
        );

        studyLogMapper.save(studyLog);

        return studyLog;
    }

    @PatchMapping("/{id}")
    public StudyLog updateStudyLog(
            @PathVariable Long id,
            @Valid @RequestBody UpdateStudyLogRequest request
    ) {
        StudyLog existingStudyLog = studyLogMapper.findById(id);

        if (existingStudyLog == null) {
            throw new StudyLogNotFoundException();
        }

        studyLogMapper.updatePartial(id, request);

        return studyLogMapper.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteStudyLog(@PathVariable Long id) {
        int deleteRows = studyLogMapper.delete(id);

        if (deleteRows == 0) {
            throw new StudyLogNotFoundException();
        }
    }
}
