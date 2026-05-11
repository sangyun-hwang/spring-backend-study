# Study Tracker API Design

## 1. Console Feature to API Mapping

| 콘솔 기능 | HTTP Method | URL | 설명 |
| --- | --- | --- | --- |
| 공부 기록 추가 | POST | /study-logs | 새 공부 기록을 추가한다 |
| 전체 기록 조회 | GET | /study-logs | 모든 공부 기록을 조회한다 |
| 카테고리별 기록 조회 | GET | /study-logs?category=JAVA | JAVA 카테고리 기록만 조회한다 |
| 카테고리별 시간 합계 조회 | GET | /study-logs/summary?category=JAVA | JAVA 카테고리 총 공부 시간을 조회한다 |
