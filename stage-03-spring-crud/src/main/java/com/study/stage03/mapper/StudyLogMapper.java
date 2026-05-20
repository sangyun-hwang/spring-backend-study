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

    @Update("UPDATE study_logs SET title = #{title}, category = #{category}, minutes = #{minutes}, memo = #{memo} WHERE id = #{id}")
    int update(StudyLog studyLog);

    @Delete("DELETE FROM study_logs WHERE id = #{id}")
    int delete(Long id);
}

