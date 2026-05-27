# Progress

마지막 업데이트: 2026-05-27

## 현재 상태

- 현재 단계: Stage 08 시작 전
- 현재 목표: Spring MVC + JSP form 처리까지 마무리하고, 다음 단계로 세션 기반 로그인 흐름 학습 시작하기
- 장기 목표: 프론트엔드 경험을 바탕으로 Java/Spring 풀스택, SI, 전자정부프레임워크 계열 지원이 가능한 포트폴리오 만들기
- 현재 방식: Codex는 코드 작성 대신 커리큘럼, 리뷰, 힌트, 이해도 점검을 담당

## 단계별 진행 현황

| Stage | 주제 | 상태 | 완료일 | 메모 |
| --- | --- | --- | --- | --- |
| 01 | Java 콘솔 기초 | Completed | 2026-05 | 객체, List, 비즈니스 로직 분리 |
| 02 | HTTP와 REST API 설계 | Completed | 2026-05 | REST 요청/응답 설계 |
| 03 | Spring Boot 메모리 CRUD | Completed | 2026-05 | CRUD, Validation, Exception, 계층 분리 |
| 04 | SQL과 데이터베이스 기초 | Completed | 2026-05 | SQL 작성, H2 Console 실행, MySQL 설치 |
| 05 | JDBC로 DB 직접 연결 | Completed | 2026-05 | MySQL datasource, JDBC CRUD, 반복 코드 정리 |
| 06 | MyBatis로 CRUD 구현 | Completed | 2026-05 | Annotation Mapper, XML Mapper, 동적 SQL, resultMap |
| 07 | Spring MVC와 JSP | Completed | 2026-05 | JSP 목록/검색/생성/수정/삭제, form 검증 |
| 08 | 로그인과 세션 | In Progress |  | 세션 기반 로그인 흐름 학습 예정 |
| 09 | 검색, 페이징, 업무형 CRUD | Not Started |  | 목록 화면 실무 패턴 |
| 10 | 전자정부프레임워크 감각 익히기 | Not Started |  | Spring MVC/JSP/MyBatis 구조 이해 |
| 11 | 포트폴리오 미니 프로젝트 | Not Started |  | 지원서용 결과물 |
| 12 | JPA 선택 확장 | Not Started |  | 선택 과정 |

상태 값:

- Not Started
- In Progress
- Review Requested
- Needs Revision
- Completed

## 최근 완료한 것

- Stage 05: JDBC로 MySQL DB에 직접 연결하고 CRUD 구현
- Stage 05: `mapRow()`와 try-with-resources로 JDBC 반복 코드 정리
- Stage 06: MyBatis Mapper로 JDBC 반복 코드 축소
- Stage 06: XML Mapper, 동적 SQL, `<where>`, `<set>`, `resultMap` 학습
- Stage 07: Spring MVC + JSP로 목록/검색 화면 구현
- Stage 07: JSP form submit으로 생성/수정/삭제 처리
- Stage 07: `@Valid`, `BindingResult`를 사용한 JSP form 검증 실패 처리
- Stage 07: REST API 방식과 JSP MVC form 처리 방식의 차이 정리

## 다음 학습 목표

- HTTP가 기본적으로 상태를 기억하지 않는다는 점 이해
- 세션과 쿠키의 역할 구분
- JSP 로그인 화면 만들기
- `HttpSession`에 로그인 상태 저장하기
- 로그아웃 처리하기
- 로그인하지 않은 사용자의 생성/수정/삭제 접근 제한하기

## 최근 피드백 요약

- MyBatis는 SQL을 없애는 도구가 아니라 JDBC의 반복 실행 절차를 줄여주는 SQL Mapper이다.
- XML Mapper는 긴 SQL, 동적 조건, SI/전자정부 스타일 프로젝트에서 자주 보인다.
- JSP MVC에서는 REST API처럼 JSON을 주고받기보다 서버가 Model 데이터를 JSP에 넘겨 HTML을 렌더링한다.
- HTML form은 기본적으로 GET/POST만 지원하므로 JSP MVC에서는 수정/삭제도 POST + URL 경로로 표현할 수 있다.
- form 검증 실패 시 도메인 객체를 억지로 만들지 말고 request DTO를 다시 JSP에 넘기는 것이 자연스럽다.

## 다음 평가 때 Codex가 확인할 것

- 세션과 쿠키의 관계를 설명할 수 있는지
- 로그인 요청 후 서버가 무엇을 저장하고 브라우저가 무엇을 들고 다니는지 설명할 수 있는지
- `HttpSession`을 Controller에서 어떻게 사용하는지 이해했는지
- 로그인/로그아웃 후 redirect 흐름을 설명할 수 있는지
- 인증과 인가의 차이를 본인 말로 구분할 수 있는지
