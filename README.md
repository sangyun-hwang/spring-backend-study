# Spring Backend Study

프론트엔드 경험을 바탕으로 Java/Spring 백엔드, 풀스택, SI/전자정부프레임워크 계열 지원을 준비하기 위한 개인 학습 레포입니다.

이 레포의 목적은 결과물을 빠르게 만드는 것이 아니라, 직접 구현하고 설명할 수 있는 힘을 쌓는 것입니다. Codex는 코드를 대신 작성하지 않고, 커리큘럼 설계, 단계별 점검, 코드 리뷰, 막혔을 때 힌트 제공, 커밋/푸시 관리를 담당합니다.

## 학습 방향

- Java/Spring 백엔드의 기본 요청 흐름을 직접 구현한다.
- DB, SQL, JDBC, MyBatis를 통해 업무형 CRUD를 익힌다.
- JSP/Spring MVC를 통해 서버 렌더링 화면도 경험한다.
- Spring Security로 인증/인가 흐름을 구현한다.
- 전자정부프레임워크/SI 계열에서 자주 만나는 구조에 익숙해진다.
- 최종적으로 지원서에 쓸 수 있는 작은 업무형 풀스택 프로젝트를 만든다.

## 현재 목표

`Study Tracker` 업무형 웹 애플리케이션을 단계적으로 만든다.

현재까지 구현/학습한 핵심 개념:

- Java 객체지향 기초
- HTTP와 REST API
- Spring Boot
- Controller / Service / Repository / Mapper 계층 분리
- Validation과 예외 처리
- SQL과 관계형 데이터베이스
- JDBC
- MyBatis XML Mapper와 동적 SQL
- Spring MVC
- JSP / JSTL
- 세션 로그인과 Interceptor
- Spring Security 인증/인가
- DB 기반 로그인과 회원가입
- 검색, 페이징, 정렬
- 사용자별 데이터 소유권

## 현재 진행 상황

- Stage 01: Java 콘솔 기초 완료
- Stage 02: HTTP / REST API 설계 완료
- Stage 03: Spring Boot 메모리 CRUD 완료
- Stage 04: SQL / DB 기초 완료
- Stage 05: JDBC로 MySQL CRUD 구현 완료
- Stage 06: MyBatis, XML Mapper, 동적 SQL 완료
- Stage 07: Spring MVC + JSP form CRUD 완료
- Stage 08: 세션 로그인과 Interceptor 완료
- Stage 09: 검색, 페이징, 정렬 완료
- Stage 10: Spring Security 인증/인가 완료
- Stage 11: DB 기반 로그인과 회원가입 완료
- Stage 12: 예외 처리와 사용자별 데이터 소유권 완료
- Stage 13: 전자정부프레임워크/SI 구조 감각 예정

상세 진행표: [docs/progress.md](docs/progress.md)
커리큘럼: [docs/curriculum.md](docs/curriculum.md)
두 저장소 운영 규칙: [docs/repository-process.md](docs/repository-process.md)

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
- `[stage-01]` ~ `[stage-15]`: 단계별 실습 작업
- `[fix]`: 오타, 실수, 동작 수정

## 현재 폴더 구조

```text
.
├── README.md
├── docs
│   ├── curriculum.md
│   ├── progress.md
│   ├── repository-process.md
│   ├── archive-routine.md
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
├── stage-09-search-pagination
├── stage-10-spring-security
├── stage-11-db-auth-signup
├── stage-12-error-ownership
├── stage-13-egov-style
├── stage-14-portfolio
└── stage-15-jpa
```

참고: 실제 Spring Boot 애플리케이션 코드는 현재 `stage-03-spring-crud` 안에서 계속 확장하고 있습니다. 이후 Stage 폴더들은 학습 단계와 산출물 구분을 위한 자리입니다.

## Codex에게 점검 요청하는 방식

예시:

```text
[Stage 11 - 문제 15 완료]

내가 이해한 것:
- 사전 중복 체크는 사용자에게 자연스럽게 오류 메시지를 보여주기 위한 UX 방어다.
- DB UNIQUE 제약은 최종 데이터 무결성 방어선이다.

헷갈리는 것:
- 동시에 같은 username으로 가입할 때 예외 처리를 어떻게 해야 하는지

작성한 파일:
- SignupPageController.java
- signup.jsp
```

Codex는 기본적으로 코드를 대신 작성하지 않고, 리뷰와 힌트 중심으로 도와줍니다.
