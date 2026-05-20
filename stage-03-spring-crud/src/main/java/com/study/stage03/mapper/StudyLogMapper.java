package com.study.stage03.mapper;

import com.study.stage03.domain.StudyCategory;
import com.study.stage03.domain.StudyLog;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudyLogMapper {
    List<StudyLog> findAll();

    StudyLog findById(Long id);

    List<StudyLog> findByCategory(StudyCategory category);

    void save(StudyLog studyLog);

    Long getNextId();

    int update(StudyLog studyLog);

    int delete(Long id);
}

