package com.study.stage03.dto;

import com.study.stage03.domain.StudyCategory;

public class StudyLogSummaryResponse {
    private final StudyCategory category;
    private final int totalMinutes;

    public StudyLogSummaryResponse(StudyCategory category, int totalMinutes) {
        this.category = category;
        this.totalMinutes = totalMinutes;
    }

    public StudyCategory getCategory() {
        return category;
    }

    public int getTotalMinutes() {
        return totalMinutes;
    }
}
