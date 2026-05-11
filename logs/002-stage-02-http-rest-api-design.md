# 002. Stage 02 HTTP와 REST API 설계

날짜: 2026-05-12

단계: Stage 02 HTTP와 REST API 설계

## 오늘 한 것

- Stage 01 콘솔 기능을 HTTP API로 변환했다.
- `POST /study-logs` 생성 요청 JSON을 설계했다.
- 생성 성공 응답에 `201 Created`와 응답 JSON을 정의했다.
- `GET /study-logs` 전체 조회 응답을 JSON 배열로 설계했다.
- `GET /study-logs?category=JAVA` 카테고리별 조회 응답을 설계했다.
- `GET /study-logs/summary?category=JAVA` 카테고리별 공부 시간 합계 응답을 설계했다.
- 에러 응답 형식을 정하고, `400 Bad Request`와 `404 Not Found`를 구분했다.

## 새로 이해한 것

- HTTP Method는 요청의 행동을 나타낸다.
- URL은 어떤 자원을 대상으로 요청하는지 나타낸다.
- Query Parameter는 조회 조건을 표현할 때 사용할 수 있다.
- `POST`는 새 데이터를 생성할 때 사용한다.
- `GET`은 데이터를 조회할 때 사용한다.
- 생성 성공에는 `201 Created`가 적절하다.
- 조회 성공에는 `200 OK`가 적절하다.
- 단건 응답은 JSON 객체 `{}`로 표현하고, 목록 응답은 JSON 배열 `[]`로 표현한다.
- 조회 결과가 없어도 요청 자체가 성공했다면 `200 OK`와 빈 배열 `[]`를 반환할 수 있다.
- 합계 조회처럼 계산 결과 하나를 반환하는 API는 배열보다 객체 응답이 자연스럽다.
- JSON에는 날짜 타입이 따로 없기 때문에 `createdAt`은 ISO 8601 형식의 문자열로 표현한다.

## 아직 헷갈리는 것

- URL을 어느 정도까지 세분화해야 REST스럽다고 볼 수 있는지 더 연습이 필요하다.
- `summary` 같은 URL 이름이 항상 좋은 선택인지, 다른 설계 방식은 없는지 궁금하다.
- 에러 응답 형식을 프로젝트마다 어떻게 정하는지 더 보고 싶다.

## 직접 설명해보기

Stage 01에서는 콘솔 메뉴로 공부 기록을 추가하고 조회했다. Stage 02에서는 이 기능들을 HTTP API로 바꾸어 설계했다.

공부 기록 추가는 새 데이터를 만드는 작업이므로 `POST /study-logs`로 설계했다. 클라이언트는 `title`, `category`, `minutes`, `memo`를 JSON body에 담아 보내고, 서버는 저장 후 `id`와 `createdAt`이 포함된 응답을 `201 Created`로 돌려준다.

전체 조회는 `GET /study-logs`로 설계했다. 여러 공부 기록을 반환하므로 응답은 JSON 배열이다. 기록이 없으면 에러가 아니라 빈 배열 `[]`와 `200 OK`를 반환한다.

카테고리별 조회는 `GET /study-logs?category=JAVA`처럼 query parameter로 조건을 전달한다. 조건에 맞는 기록이 없으면 빈 배열을 반환하고, 잘못된 category 값이면 `400 Bad Request`를 반환한다.

카테고리별 시간 합계는 `GET /study-logs/summary?category=JAVA`로 설계했다. 이 API는 목록이 아니라 계산 결과를 반환하므로 `{ "category": "JAVA", "totalMinutes": 100 }` 같은 객체 응답을 사용한다.

에러 응답은 `status`, `error`, `message` 필드를 가진 JSON으로 통일했다.

## 막힌 지점

- GET 요청에는 보통 Request Body를 사용하지 않고, 필요한 조건은 query parameter로 전달한다는 점을 구분했다.
- 요청 JSON과 응답 JSON의 필드가 항상 같을 필요는 없다는 점을 배웠다. 예를 들어 `id`와 `createdAt`은 서버가 만들어 응답에 포함한다.
- `createdAt`을 date 타입으로 적는 대신 JSON 관점에서는 string으로 표현하는 것이 자연스럽다는 점을 배웠다.
- 빈 결과를 404로 볼지, 빈 배열과 200으로 볼지 고민했고, 목록 조회에서는 빈 배열과 200이 자연스럽다는 점을 정리했다.

## 다음에 할 것

- Stage 03에서 Spring Boot 프로젝트를 만들고, 지금 설계한 API를 Controller로 구현한다.
- `RequestDto`와 `ResponseDto`가 오늘 설계한 요청/응답 JSON과 어떻게 연결되는지 확인한다.
- Controller / Service / Repository 계층 분리를 Stage 01의 `Main` / `StudyLogManager` 분리와 연결해서 이해한다.
