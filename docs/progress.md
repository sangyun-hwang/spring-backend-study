# Progress

마지막 업데이트: 2026-05-28

## 현재 상태

- 현재 단계: Stage 08 완료
- 현재 목표: 세션 로그인과 Interceptor 기반 인증 체크를 정리하고, 다음 단계 검색/페이징 학습으로 이동하기
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
| 08 | 로그인과 세션 | Completed | 2026-05 | 세션 로그인, 로그아웃, Interceptor 인증 체크 |
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

- Stage 08: `HttpSession` 기반 로그인 상태 저장
- Stage 08: `session.invalidate()`를 사용한 로그아웃 처리
- Stage 08: `HandlerInterceptor`와 `WebConfig`로 `/mvc/study-logs/**` 접근 제어
- Stage 08: Controller에 반복되던 로그인 체크를 Interceptor로 분리
- Stage 05: JDBC로 MySQL DB에 직접 연결하고 CRUD 구현
- Stage 05: `mapRow()`와 try-with-resources로 JDBC 반복 코드 정리
- Stage 06: MyBatis Mapper로 JDBC 반복 코드 축소
- Stage 06: XML Mapper, 동적 SQL, `<where>`, `<set>`, `resultMap` 학습
- Stage 07: Spring MVC + JSP로 목록/검색 화면 구현
- Stage 07: JSP form submit으로 생성/수정/삭제 처리
- Stage 07: `@Valid`, `BindingResult`를 사용한 JSP form 검증 실패 처리
- Stage 07: REST API 방식과 JSP MVC form 처리 방식의 차이 정리

## 다음 학습 목표

- 업무형 목록 화면에서 검색 조건과 페이지 번호를 함께 다루기
- SQL `LIMIT`, `OFFSET` 기반 페이징 이해
- MyBatis XML에서 검색 조건과 페이징 조건을 함께 조립하기
- JSP에서 검색 조건 유지와 페이지 링크 만들기

## 최근 피드백 요약

- HTTP는 stateless라서 로그인 상태를 유지하려면 세션 같은 별도 저장 방식이 필요하다.
- 세션 로그인에서 서버는 로그인 정보를 저장하고, 브라우저는 세션 ID를 쿠키로 들고 다닌다.
- 로그아웃은 세션 상태를 변경하므로 GET 링크보다 POST 요청으로 처리하는 것이 자연스럽다.
- Interceptor는 Controller 실행 전에 공통 인증 체크를 처리할 수 있다.
- `preHandle()`에서 `false`를 반환하면 Controller 실행이 중단된다.
- MyBatis는 SQL을 없애는 도구가 아니라 JDBC의 반복 실행 절차를 줄여주는 SQL Mapper이다.
- XML Mapper는 긴 SQL, 동적 조건, SI/전자정부 스타일 프로젝트에서 자주 보인다.
- JSP MVC에서는 REST API처럼 JSON을 주고받기보다 서버가 Model 데이터를 JSP에 넘겨 HTML을 렌더링한다.
- HTML form은 기본적으로 GET/POST만 지원하므로 JSP MVC에서는 수정/삭제도 POST + URL 경로로 표현할 수 있다.
- form 검증 실패 시 도메인 객체를 억지로 만들지 말고 request DTO를 다시 JSP에 넘기는 것이 자연스럽다.

## 다음 평가 때 Codex가 확인할 것

- 검색 조건을 query parameter로 유지할 수 있는지
- 페이지 번호와 페이지 크기를 SQL 조회 조건으로 바꿀 수 있는지
- 전체 개수 조회와 목록 조회가 왜 따로 필요한지 설명할 수 있는지
- JSP에서 현재 검색 조건을 유지한 채 페이지 링크를 만들 수 있는지
