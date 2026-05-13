package com.study.stage03.exception;

public class StudyLogNotFoundException extends RuntimeException {
    public StudyLogNotFoundException() {
        super("학습 기록을 찾을 수 없습니다.");
    }
}
