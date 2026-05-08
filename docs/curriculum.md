# Curriculum

이 문서는 백엔드 학습 전체 흐름을 잊지 않기 위한 기준표입니다.

권장 환경:

- Java 21
- Spring Boot 3.5.x
- Gradle
- H2 또는 MySQL/PostgreSQL
- IntelliJ IDEA
- Postman, curl, 또는 HTTP Client

## Stage 01. Java 콘솔 프로젝트

목표: Spring에 들어가기 전에 객체 분리 감각을 익힌다.

학습 주제:

- class, object, constructor
- collection: `List`, `Map`
- enum
- exception
- package 분리
- 책임을 가진 객체 설계

튜토리얼 목표:

- 콘솔 기반 `StudyLogManager` 구현
- 공부 기록 추가
- 전체 목록 조회
- 카테고리별 조회
- 총 공부 시간 계산
- 잘못된 입력 예외 처리

완료 기준:

- 최소 3개 이상의 클래스로 책임이 나뉘어 있다.
- 사용자 입력과 핵심 로직이 한 클래스에 몰려 있지 않다.
- 왜 클래스를 그렇게 나눴는지 설명할 수 있다.

## Stage 02. HTTP와 REST API 설계

목표: Spring 구현 전에 API 설계 감각을 잡는다.

학습 주제:

- HTTP method
- status code
- JSON
- REST API URL 설계
- request/response body
- 에러 응답

튜토리얼 목표:

- Study Tracker API 명세 작성
- 요청/응답 JSON 예시 작성
- 성공/실패 status code 정리

완료 기준:

- `POST`, `GET`, `PATCH`, `DELETE` API를 설계했다.
- 에러 상황을 3개 이상 정의했다.
- 프론트엔드가 보고 사용할 수 있는 형태로 문서화했다.

## Stage 03. Spring Boot CRUD

목표: DB 없이 메모리 저장소로 REST API를 만든다.

학습 주제:

- Spring Boot 프로젝트 구조
- `@RestController`
- `@GetMapping`, `@PostMapping`, `@PatchMapping`, `@DeleteMapping`
- DTO
- Service
- Repository 역할
- dependency injection

튜토리얼 목표:

- `StudyLog` CRUD API 구현
- `Map<Long, StudyLog>` 기반 메모리 저장소 사용
- Controller / Service / Repository 분리

완료 기준:

- Controller에는 요청/응답 처리만 있다.
- 핵심 비즈니스 로직은 Service에 있다.
- 저장소 접근은 Repository로 분리되어 있다.
- API를 직접 호출해서 결과를 확인했다.

## Stage 04. SQL과 데이터베이스

목표: 백엔드의 데이터 저장 기초를 익힌다.

학습 주제:

- table
- primary key
- column type
- `SELECT`, `INSERT`, `UPDATE`, `DELETE`
- `WHERE`, `ORDER BY`, `COUNT`, `GROUP BY`

튜토리얼 목표:

- `study_logs` 테이블 설계
- SQL로 CRUD 직접 실행
- 카테고리별 공부 시간 합계 쿼리 작성

완료 기준:

- 테이블 DDL을 직접 작성했다.
- CRUD SQL을 직접 작성했다.
- 집계 쿼리를 최소 1개 이상 작성했다.

## Stage 05. Spring Data JPA

목표: Spring Boot API와 DB를 연결한다.

학습 주제:

- Entity
- JpaRepository
- transaction
- DTO 변환
- query method
- 날짜 범위 조회

튜토리얼 목표:

- 메모리 Repository를 JPA Repository로 교체
- DB 기반 CRUD 구현
- 카테고리별 조회
- 날짜 범위 조회

완료 기준:

- Entity와 DTO를 구분했다.
- 수정 로직을 설명할 수 있다.
- JPA Repository가 어떤 일을 대신하는지 설명할 수 있다.

## Stage 06. Validation과 예외 처리

목표: 사용할 수 있는 API 품질을 만든다.

학습 주제:

- `@Valid`
- Bean Validation
- custom exception
- `@RestControllerAdvice`
- 일관된 에러 응답

튜토리얼 목표:

- 제목이 비어 있으면 400
- 공부 시간이 0 이하이면 400
- 없는 ID 조회 시 404
- 에러 응답 구조 통일

완료 기준:

- 성공 응답과 실패 응답을 모두 확인했다.
- 예외를 아무 곳에서나 처리하지 않고 흐름을 정리했다.
- 에러 응답을 프론트엔드 관점에서 설명할 수 있다.

## Stage 07. 인증과 인가

목표: 사용자별 데이터 접근을 구현한다.

학습 주제:

- 회원가입
- 로그인
- password hashing
- session vs JWT 개념
- Spring Security 기본 흐름
- authenticated user

튜토리얼 목표:

- 회원가입
- 로그인
- 내 공부 기록만 조회
- 다른 사용자 기록 접근 차단

완료 기준:

- 비밀번호를 평문 저장하지 않는다.
- 인증과 인가의 차이를 설명할 수 있다.
- 사용자별 데이터 분리가 동작한다.

## Stage 08. 테스트

목표: 내가 만든 코드가 계속 맞는지 확인한다.

학습 주제:

- JUnit
- unit test
- controller test
- repository test
- given/when/then

튜토리얼 목표:

- StudyLog 생성 테스트
- 잘못된 입력 실패 테스트
- 없는 ID 조회 실패 테스트
- 사용자별 조회 테스트

완료 기준:

- 성공 케이스와 실패 케이스가 모두 있다.
- 테스트가 구현 세부사항에 과하게 의존하지 않는다.
- 테스트 실패 메시지를 보고 원인을 추적할 수 있다.

## Stage 09. 프론트엔드 연동 준비

목표: 풀스택에서 쓰기 좋은 API로 다듬는다.

학습 주제:

- CORS
- pagination
- sorting
- filtering
- Swagger/OpenAPI
- API response convention

튜토리얼 목표:

- Swagger 문서 생성
- 페이지네이션 조회
- 날짜/카테고리 필터
- 프론트엔드에서 쓰기 좋은 응답 구조 정리

완료 기준:

- Swagger로 API를 확인할 수 있다.
- 목록 API가 페이지네이션을 지원한다.
- 프론트엔드에서 필요한 데이터 형태를 설명할 수 있다.

## Stage 10. 배포

목표: 내 컴퓨터 밖에서 API가 동작하게 만든다.

학습 주제:

- profile
- environment variable
- build
- Docker 기초
- 배포 플랫폼
- 운영 DB 연결

튜토리얼 목표:

- jar build
- API 서버 배포
- 배포 URL로 CRUD 테스트
- README 정리

완료 기준:

- 배포된 URL로 API가 동작한다.
- 환경변수와 설정 파일의 차이를 설명할 수 있다.
- 배포 과정과 문제 해결 내용을 기록했다.
