package com.study.stage03.mapper;

import com.study.stage03.domain.StudyCategory;
import com.study.stage03.domain.StudyLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudyLogMapper {
    @Select("SELECT id, title, category, minutes, memo FROM study_logs")
    List<StudyLog> findAll();

    @Select("SELECT id, title, category, minutes, memo FROM study_logs WHERE id = #{id}")
    StudyLog findById(Long id);

    @Select("SELECT id, title, category, minutes, memo FROM study_logs WHERE category = #{category}")
    List<StudyLog> findByCategory(StudyCategory category);
}

