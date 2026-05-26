package com.study.stage03.dto;

import com.study.stage03.domain.StudyCategory;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class UpdateStudyLogRequest {
    @NotBlank
    private String title;

    @NotNull
    private StudyCategory category;

    @Min(1)
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
