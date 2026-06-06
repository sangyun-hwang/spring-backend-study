package com.study.stage03.controller;

import com.study.stage03.domain.AppUser;
import com.study.stage03.domain.StudyCategory;
import com.study.stage03.domain.StudyLog;
import com.study.stage03.dto.CreateStudyLogRequest;
import com.study.stage03.dto.UpdateStudyLogRequest;
import com.study.stage03.exception.StudyLogNotFoundException;
import com.study.stage03.mapper.StudyLogMapper;
import com.study.stage03.mapper.UserMapper;
import jakarta.validation.Valid;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mybatis-study-logs")
public class MyBatisStudyLogController {
    private final StudyLogMapper studyLogMapper;
    private final UserMapper userMapper;

    public MyBatisStudyLogController(StudyLogMapper studyLogMapper, UserMapper userMapper) {
        this.studyLogMapper = studyLogMapper;
        this.userMapper = userMapper;
    }

    @GetMapping
    public List<StudyLog> getStudyLogs(
            @RequestParam(required = false) String title,
            @RequestParam(required = false) StudyCategory category,
            Authentication authentication
    ) {
        AppUser currentUser = userMapper.findByUsername(authentication.getName());

        return studyLogMapper.search(title, category, currentUser.getId());
    }

    @GetMapping("/{id}")
    public StudyLog getStudyLog(
            @PathVariable Long id,
            Authentication authentication
    ) {
        AppUser currentUser = userMapper.findByUsername(authentication.getName());
        StudyLog studyLog = studyLogMapper.findByIdAndUserId(id, currentUser.getId());

        if (studyLog == null) {
            throw new StudyLogNotFoundException();
        }

        return studyLog;
    }

    @PostMapping
    public StudyLog createStudyLog(
            @Valid @RequestBody CreateStudyLogRequest request,
            Authentication authentication
    ) {
        AppUser currentUser = userMapper.findByUsername(authentication.getName());

        StudyLog studyLog = new StudyLog(
                studyLogMapper.getNextId(),
                request.getTitle(),
                request.getCategory(),
                request.getMinutes(),
                request.getMemo(),
                currentUser.getId()
        );

        studyLogMapper.save(studyLog);

        return studyLog;
    }

    @PatchMapping("/{id}")
    public StudyLog updateStudyLog(
            @PathVariable Long id,
            @Valid @RequestBody UpdateStudyLogRequest request,
            Authentication authentication
    ) {
        AppUser currentUser = userMapper.findByUsername(authentication.getName());

        StudyLog existingStudyLog = studyLogMapper.findByIdAndUserId(id, currentUser.getId());

        if (existingStudyLog == null) {
            throw new StudyLogNotFoundException();
        }

        int updatedRows = studyLogMapper.updatePartial(id, currentUser.getId(), request);

        if (updatedRows == 0) {
            throw new StudyLogNotFoundException();
        }

        return studyLogMapper.findByIdAndUserId(id, currentUser.getId());
    }

    @DeleteMapping("/{id}")
    public void deleteStudyLog(
            @PathVariable Long id,
            Authentication authentication
    ) {
        AppUser currentUser = userMapper.findByUsername(authentication.getName());

        int deleteRows = studyLogMapper.delete(id, currentUser.getId());

        if (deleteRows == 0) {
            throw new StudyLogNotFoundException();
        }
    }
}
