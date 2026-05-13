package com.study.stage03.domain;

public class StudyLog {
    private final Long id;
    private final String title;
    private final StudyCategory category;
    private final int minutes;
    private final String memo;

    public StudyLog(Long id, String title, StudyCategory category, int minutes, String memo) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("title must not be blank");
        }

        if (minutes <= 0) {
            throw new IllegalArgumentException("minutes must be greater than 0");
        }

        if (category == null) {
            throw new IllegalArgumentException("category must not be null");
        }

        this.id = id;
        this.title = title;
        this.category = category;
        this.minutes = minutes;
        this.memo = memo;
    }

    public Long getId() {
        return id;
    }

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
