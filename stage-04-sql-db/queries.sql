-- 전체 조회
SELECT *
FROM study_logs;

-- id로 단건 조회
SELECT *
FROM study_logs
WHERE id = 1;

-- 카테고리별 조회
SELECT *
FROM study_logs
WHERE category = 'JAVA';

-- 공부 시간이 긴 순서로 정렬
SELECT *
FROM study_logs
ORDER BY minutes DESC;
