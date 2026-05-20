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

    @Insert("INSERT INTO study_logs (id, title, category, minutes, memo) VALUES (#{id}, #{title}, #{category}, #{minutes}, #{memo})")
    void save(StudyLog studyLog);

    @Select("SELECT COALESCE(MAX(id), 0) + 1 FROM study_logs")
    Long getNextId();

    @Update("UPDATE study_logs SET title = #{title}, category = #{category}, minutes = #{minutes}, memo = #{memo} WHERE id = #{id}")
    int update(StudyLog studyLog);

    @Delete("DELETE FROM study_logs WHERE id = #{id}")
    int delete(Long id);
}

