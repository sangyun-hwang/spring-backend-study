package com.study.stage03.dto;

import com.study.stage03.domain.StudyCategory;

public class CreateStudyLogRequest {
    private String title;
    private StudyCategory category;
    private int minutes;
    private String memo;

    public String getTitle() {
        return title;
    }

    public StudyCategory getCategory() {
        return category;
    }

    public int getMinutes() {
        return minutes;
    }

    public String getMemo() {
        return memo;
    }
}
