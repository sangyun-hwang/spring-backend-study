package com.study.stage03.mapper;

import com.study.stage03.domain.StudyCategory;
import com.study.stage03.domain.StudyLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface StudyLogMapper {
    @Select("SELECT id, title, category, minutes, memo FROM study_logs")
    List<StudyLog> findAll();

    @Select("SELECT id, title, category, minutes, memo FROM study_logs WHERE id = #{id}")
    StudyLog findById(Long id);

    @Select("SELECT id, title, category, minutes, memo FROM study_logs WHERE category = #{category}")
    List<StudyLog> findByCategory(StudyCategory category);

    @Insert("INSERT INTO study_logs (id, title, category, minutes, memo) VALUES (#{id}, #{title}, #{category}, #{minutes}, #{memo})")
    void save(StudyLog studyLog);

    @Select("SELECT COALESCE(MAX(id), 0) + 1 FROM study_logs")
    Long getNextId();

    @Update("UPDATE study_logs SET title = #{title}, category = #{category}, minutes = #{minutes}, memo = #{memo} WHERE id = #{id}")
    int update(StudyLog studyLog);
}

