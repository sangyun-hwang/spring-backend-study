package com.study.stage03.dto;

import com.study.stage03.domain.StudyCategory;

public class UpdateStudyLogRequest {
    private String title;
    private StudyCategory category;
    private Integer minutes;
    private String memo;

    public String getTitle() {
        return title;
    }

    public StudyCategory getCategory() {
        return category;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public String getMemo() {
        return memo;
    }
}
