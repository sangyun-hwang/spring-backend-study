# Spring Backend Study

프론트엔드 경험을 바탕으로 Java/Spring 백엔드, 풀스택, SI/전자정부프레임워크 계열 지원을 준비하기 위한 개인 학습 레포입니다.

이 레포의 목적은 결과물을 빠르게 만드는 것이 아니라, 직접 구현하고 설명할 수 있는 힘을 쌓는 것입니다. Codex는 코드를 대신 작성하지 않고, 커리큘럼 설계, 단계별 점검, 코드 리뷰, 막혔을 때 힌트 제공 역할을 합니다.

## 학습 방향

- Java/Spring 백엔드의 기본 요청 흐름을 직접 구현한다.
- DB, SQL, JDBC, MyBatis를 통해 업무형 CRUD를 익힌다.
- JSP/Spring MVC를 통해 서버 렌더링 화면도 경험한다.
- 전자정부프레임워크/SI 계열에서 자주 만나는 구조에 익숙해진다.
- 최종적으로 지원서에 쓸 수 있는 작은 업무형 풀스택 프로젝트를 만든다.

## 현재 목표

`Study Tracker` 업무형 웹 애플리케이션을 단계적으로 만든다.

최종적으로 포함할 개념:

- Java 객체지향 기초
- HTTP와 REST API
- Spring Boot
- Controller / Service / Repository 계층 분리
- Validation과 예외 처리
- SQL과 관계형 데이터베이스
- JDBC
- MyBatis
- Spring MVC
- JSP
- 로그인과 세션
- 검색과 페이징
- 전자정부프레임워크 구조 감각
- JPA 선택 확장

## 현재 진행 상황

- Stage 01: Java 콘솔 기초 완료
- Stage 02: HTTP / REST API 설계 완료
- Stage 03: Spring Boot 메모리 CRUD 완료
- Stage 04: SQL / DB 기초 진행 예정

## 커밋 메시지 규칙

개인 학습 레포이므로 커밋 기록을 나중에 읽기 쉽게 한국어로 작성합니다.

형식:

```text
[태그] 변경 내용
```

자주 쓰는 태그:

- `[init]`: 레포 초기 설정, 프로젝트 시작
- `[docs]`: 문서, 커리큘럼, 기록 양식 변경
- `[study]`: 학습 진행 기록 추가
- `[stage-01]`: Java 콘솔 기초 작업
- `[stage-02]`: HTTP/REST API 설계 작업
- `[stage-03]`: Spring Boot CRUD 작업
- `[stage-04]`: SQL/DB 작업
- `[fix]`: 오타, 실수, 동작 수정

## 권장 폴더 구조

```text
.
├── README.md
├── docs
│   ├── curriculum.md
│   ├── progress.md
│   ├── understanding-map.md
│   └── review-request-template.md
├── logs
│   └── 000-template.md
├── stage-01-java-console
├── stage-02-http-rest
├── stage-03-spring-crud
├── stage-04-sql-db
├── stage-05-jdbc
├── stage-06-mybatis
├── stage-07-spring-mvc-jsp
├── stage-08-session-auth
├── stage-09-business-crud
├── stage-10-egov-style
├── stage-11-portfolio
└── stage-12-jpa
```

## Codex에게 점검 요청하는 방식

예시:

```text
[Stage 04 - SQL CRUD 완료]

내가 이해한 것:
- 테이블은 객체 목록과 비슷하지만, 행과 열로 데이터를 저장한다.
- Repository가 하던 저장/조회 역할을 SQL이 실제 DB에 수행한다.

헷갈리는 것:
- primary key와 Java 객체 id의 관계

작성한 파일:
- stage-04-sql-db/schema.sql
- stage-04-sql-db/study-log-queries.sql
```

Codex는 기본적으로 코드를 대신 작성하지 않고, 리뷰와 힌트 중심으로 도와줍니다.
