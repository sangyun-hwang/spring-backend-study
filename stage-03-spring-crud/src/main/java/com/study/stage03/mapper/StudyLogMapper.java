package com.study.stage03.mapper;

import com.study.stage03.domain.StudyCategory;
import com.study.stage03.domain.StudyLog;
import com.study.stage03.dto.UpdateStudyLogRequest;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudyLogMapper {
    List<StudyLog> search(
            @Param("title") String title,
            @Param("category") StudyCategory category
    );

    StudyLog findById(Long id);

    void save(StudyLog studyLog);

    Long getNextId();

    int updatePartial(
            @Param("id") Long id,
            @Param("request") UpdateStudyLogRequest request
    );

    int delete(Long id);

    List<StudyLog> searchPage(
            @Param("title") String title,
            @Param("category") StudyCategory category,
            @Param("size") int size,
            @Param("offset") int offset
    );
}

