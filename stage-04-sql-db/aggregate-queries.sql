-- 전체 학습 기록 개수
SELECT COUNT(*)
FROM study_logs;

-- 전체 공부 시간 합계
SELECT SUM(minutes)
FROM study_logs;

-- 카테고리별 공부 시간 합계
SELECT category, SUM(minutes)
FROM study_logs
GROUP BY category;

-- 카테고리별 학습 기록 개수
SELECT category, COUNT(*)
FROM study_logs
GROUP BY category;

