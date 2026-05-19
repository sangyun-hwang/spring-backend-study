package com.study.stage03.controller;

import com.study.stage03.domain.StudyCategory;
import com.study.stage03.domain.StudyLog;
import com.study.stage03.mapper.StudyLogMapper;
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
    public List<StudyLog> getStudyLogs(@RequestParam(required = false) StudyCategory category) {
        if (category == null) {
            return studyLogMapper.findAll();
        }

        return studyLogMapper.findByCategory(category);
    }

    @GetMapping("/{id}")
    public StudyLog getStudyLog(@PathVariable Long id) {
        return studyLogMapper.findById(id);
    }

}
