-- id가 1인 학습 기록의 공부 시간 수정
UPDATE study_logs
SET minutes = 90
WHERE id = 1;

-- id가 2인 학습 기록의 제목과 메모 수정
UPDATE study_logs
SET title = 'Java ArrayList practice',
    memo = 'ArrayList and for-each'
WHERE id = 2;

-- id가 3인 학습 기록 삭제
DELETE FROM study_logs
WHERE id = 3;

-- WHERE 없이 UPDATE/DELETE를 실행하면 모든 row가 영향을 받을 수 있다.