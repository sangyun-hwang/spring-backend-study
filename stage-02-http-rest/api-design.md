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

## 3. Create Study Log Response

### Status Code

201 Created

> **왜 201 Created인가요?**
>
> HTTP status code는 요청 결과를 숫자로 알려주는 약속입니다.
>
> ```text
> 200 OK       요청 성공
> 201 Created  새 데이터 생성 성공
> 400 Bad Request  클라이언트 요청이 잘못됨
> 404 Not Found    대상이 없음
> 500 Internal Server Error 서버 내부 문제
> ```

### Response Body

```json
{
  "id": 1,
  "title": "Java class practice",
  "category": "JAVA",
  "minutes": 60,
  "memo": "field and constructor",
  "createdAt": "2026-05-11T10:30:00+09:00"
}
```

### Response Fields

| Field | Type | Description |
| --- | --- | --- |
| id | number | 서버가 생성한 공부 기록 ID |
| title | string | 공부 기록 제목 |
| category | string | 공부 카테고리 |
| minutes | number | 공부 시간 |
| memo | string | 공부 기록 메모 |
| createdAt | string | 공부 기록 생성 시간. ISO 8601 형식 |

## 4. Get Study Logs Response

### Endpoint

GET /study-logs

### Status Code

200 OK

### Response Body

```json
[
  {
    "id": 1,
    "title": "Java class practice",
    "category": "JAVA",
    "minutes": 60,
    "memo": "field and constructor",
    "createdAt": "2026-05-11T10:30:00+09:00"
  },
  {
    "id": 2,
    "title": "Java array practice",
    "category": "JAVA",
    "minutes": 40,
    "memo": "array basics",
    "createdAt": "2026-05-11T11:20:00+09:00"
  }
]
```

### Empty Response Body

```json
[]
```

공부 기록이 없어도 요청 자체는 성공했으므로 `200 OK`를 반환한다.

### Response Fields

| Field | Type | Description |
| --- | --- | --- |
| id | number | 서버가 생성한 공부 기록 ID |
| title | string | 공부 기록 제목 |
| category | string | 공부 카테고리 |
| minutes | number | 공부 시간 |
| memo | string | 공부 기록 메모 |
| createdAt | string | 공부 기록 생성 시간. ISO 8601 형식 |

## 5. Get Study Logs By Category Response

### Endpoint

GET /study-logs?category=[category]

### Status Code

200 OK

### Query Parameters

| Name | Type | Required | Description |
| --- | --- | --- | --- |
| category | string | yes | 조회할 공부 카테고리. JAVA, GIT, SPRING, DATABASE, ETC 중 하나 |

### Response Body

```json
[
  {
    "id": 1,
    "title": "Java class practice",
    "category": "JAVA",
    "minutes": 60,
    "memo": "field and constructor",
    "createdAt": "2026-05-11T10:30:00+09:00"
  },
  {
    "id": 2,
    "title": "Java array practice",
    "category": "JAVA",
    "minutes": 40,
    "memo": "array basics",
    "createdAt": "2026-05-11T11:20:00+09:00"
  }
]
```

### Empty Response Body

```json
[]
```

조건에 맞는 공부 기록이 없어도 요청 자체는 성공했으므로 `200 OK`를 반환한다.

### Note

잘못된 category 값이 들어오면 `400 Bad Request`를 반환한다.

## 6. Get Total Study Minutes By Category Response

### Endpoint

GET /study-logs/summary?category=[category]

### Status Code

200 OK

### Query Parameters

| Name | Type | Required | Description |
| --- | --- | --- | --- |
| category | string | yes | 합계를 조회할 공부 카테고리. JAVA, GIT, SPRING, DATABASE, ETC 중 하나 |

### Response Body

```json
{
  "category": "JAVA",
  "totalMinutes": 100
}
```

### Empty Category Response Body

```json
{
  "category": "SPRING",
  "totalMinutes": 0
}
```

조건에 맞는 공부 기록이 없어도 합계는 `0`으로 응답한다.

### Response Fields

| Field | Type | Description |
| --- | --- | --- |
| category | string | 합계를 조회한 공부 카테고리 |
| totalMinutes | number | 해당 카테고리의 총 공부 시간 |

### Note

잘못된 category 값이 들어오면 `400 Bad Request`를 반환한다.
