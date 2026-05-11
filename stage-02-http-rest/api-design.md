# Study Tracker API Design

## 1. Console Feature to API Mapping

| 콘솔 기능 | HTTP Method | URL | 설명 |
| --- | --- | --- | --- |
| 공부 기록 추가 | POST | /study-logs | 새 공부 기록을 추가한다 |
| 전체 기록 조회 | GET | /study-logs | 모든 공부 기록을 조회한다 |
| 카테고리별 기록 조회 | GET | /study-logs?category=JAVA | JAVA 카테고리 기록만 조회한다 |
| 카테고리별 시간 합계 조회 | GET | /study-logs/summary?category=JAVA | JAVA 카테고리 총 공부 시간을 조회한다 |

## 2. Create Study Log Request

### Endpoint

POST /study-logs

### Request Body

```json
{
  "title": "Java class practice",
  "category": "JAVA",
  "minutes": 60,
  "memo": "field and constructor"
}
```

### Request Fields

| Field | Type | Required | Description |
| --- | --- | --- | --- |
| title | string | yes | 공부 기록 제목 |
| category | string | yes | 공부 카테고리. JAVA, GIT, SPRING, DATABASE, ETC 중 하나 |
| minutes | number | yes | 공부 시간. 0보다 커야 한다 |
| memo | string | no | 공부 기록 메모 |

