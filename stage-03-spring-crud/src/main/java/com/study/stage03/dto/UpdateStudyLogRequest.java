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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(StudyCategory category) {
        this.category = category;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
