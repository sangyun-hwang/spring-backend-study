# StudyLog Table Design

## 1. DB가 필요한 이유

1. 데이터 영구 저장
2. 조건 검색과 정렬
3. 수정/삭제/집계의 편의성
4. 여러 데이터 사이의 관계 관리

## 2. StudyLog 객체와 테이블 비교

Java의 StudyLog 필드:
- id: StudyLog 객체를 구분하는 값
- title: StudyLog 객체의 제목
- category: StudyLog 객체의 학습 분야
- minutes: StudyLog 객체의 공부 시간
- memo: StudyLog 객체의 메모

DB의 study_logs 컬럼:
- id: 각 row를 구분하는 primary key
- title: 제목을 저장하는 컬럼
- category: 학습 분야를 저장하는 컬럼
- minutes: 공부 시간을 저장하는 컬럼
- memo: 메모를 저장하는 컬럼


## 3. 각 컬럼의 역할

- id: 각 학습 기록을 구분하는 고유 번호
- title: 학습 기록 제목
- category: 학습 분야
- minutes: 공부한 시간
- memo: 메모


## 4. 메모리 List와 DB 테이블의 차이

List<StudyLog>: 서버 종료시 데이터 휘발됨
study_logs table: 서버를 껐다 켜도 데이터 유지


## 5. 헷갈리는 점

-
