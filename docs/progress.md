# Progress

마지막 업데이트: 2026-06-03

## 현재 상태

- 현재 단계: Stage 12 시작 전
- 최근 완료: Stage 11 DB 기반 로그인과 회원가입
- 다음 목표: 로그인 사용자와 `study_logs` 데이터를 연결하고, 사용자별 데이터 소유권과 예외 처리를 학습하기
- 장기 목표: 프론트엔드 경험을 바탕으로 Java/Spring 풀스택, SI, 전자정부프레임워크 계열 지원이 가능한 포트폴리오 만들기
- 현재 방식: Codex는 코드 작성 대신 커리큘럼, 리뷰, 힌트, 이해도 점검, 커밋/푸시 관리를 담당한다.

## 단계별 진행 현황

| Stage | 주제 | 상태 | 완료일 | 메모 |
| --- | --- | --- | --- | --- |
| 01 | Java 콘솔 기초 | Completed | 2026-05 | 객체, List, 비즈니스 로직 분리 |
| 02 | HTTP와 REST API 설계 | Completed | 2026-05 | REST 요청/응답 설계 |
| 03 | Spring Boot 메모리 CRUD | Completed | 2026-05 | CRUD, Validation, Exception, 계층 분리 |
| 04 | SQL과 데이터베이스 기초 | Completed | 2026-05 | SQL 작성, H2/MySQL 경험 |
| 05 | JDBC로 DB 직접 연결 | Completed | 2026-05 | MySQL datasource, JDBC CRUD, 반복 코드 정리 |
| 06 | MyBatis로 CRUD 구현 | Completed | 2026-05 | Annotation/XML Mapper, 동적 SQL, resultMap |
| 07 | Spring MVC와 JSP | Completed | 2026-05 | JSP 목록/검색/생성/수정/삭제, form 검증 |
| 08 | 세션 로그인과 Interceptor | Completed | 2026-05 | 수동 세션 로그인, 로그아웃, 접근 제어 |
| 09 | 검색, 페이징, 정렬 | Completed | 2026-05 | 검색 조건 유지, LIMIT/OFFSET, 페이지 번호 범위, 정렬 |
| 10 | Spring Security 인증/인가 | Completed | 2026-06 | Security 로그인/로그아웃, CSRF, ADMIN 권한, JSP 권한 표시 |
| 11 | DB 기반 로그인과 회원가입 | Completed | 2026-06 | users 테이블, DbUserDetailsService, 회원가입, 중복 체크, Service 분리 |
| 12 | 예외 처리와 사용자별 데이터 소유권 | Not Started |  | 현재 로그인 사용자와 StudyLog 소유 관계 연결 |
| 13 | 전자정부프레임워크/SI 구조 감각 | Not Started |  | JSP/MyBatis/Spring MVC 구조를 SI 관점으로 정리 |
| 14 | 포트폴리오 미니 프로젝트 정리 | Not Started |  | README, 스크린샷, 실행 방법, 기능 설명 |
| 15 | JPA 선택 확장 | Not Started |  | 선택 과정 |

상태 값:

- Not Started
- In Progress
- Review Requested
- Needs Revision
- Completed

## 최근 완료한 것

- Stage 11: `users` 테이블 스키마 추가
- Stage 11: `AppUser`, `UserMapper`, `UserMapper.xml`로 사용자 조회 구현
- Stage 11: `DbUserDetailsService`로 DB 기반 로그인 연결
- Stage 11: 회원가입 DTO, Mapper insert, JSP form, Controller 구현
- Stage 11: 회원가입 중복 username 처리
- Stage 11: 회원가입 성공/실패 메시지 처리
- Stage 11: 실패 시 username 유지, password 미표시
- Stage 11: `@NotBlank`, `@Size` 기반 회원가입 입력 검증
- Stage 11: 회원가입 로직을 `SignupService`로 분리
- Stage 10: Spring Security 로그인/로그아웃 전환
- Stage 10: USER/ADMIN 권한 구분과 삭제 권한 제한
- Stage 09: 검색/페이징/정렬 목록 화면 구현

## 다음 학습 목표

1. `study_logs`에 사용자 소유자 정보를 연결한다.
2. 로그인한 사용자만 자신의 학습 기록을 조회/수정/삭제하도록 만든다.
3. 다른 사용자의 데이터 접근 시 어떤 응답/화면을 보여줄지 정한다.
4. 중복 가입, 없는 사용자, 비활성 사용자, 없는 데이터 같은 예외 흐름을 정리한다.
5. Stage 12가 끝나면 SI/전자정부 구조 정리와 포트폴리오 README로 넘어간다.

## 최근 피드백 요약

- Spring Security를 사용하면 직접 `session.setAttribute()`로 로그인 상태를 관리하지 않는다.
- `UserDetailsService`는 사용자 정보를 어디서 조회할지 담당한다.
- DB 기반 로그인에서는 `users` 테이블에서 username으로 사용자를 조회한다.
- DB의 password는 BCrypt 해시로 저장해야 하며, 로그인 시 `PasswordEncoder.matches()` 흐름으로 검증된다.
- 회원가입에서는 role과 enabled를 사용자가 보내지 않고 서버 정책으로 정한다.
- 사전 중복 체크는 UX이고, DB UNIQUE 제약은 최종 데이터 무결성 방어선이다.
- Controller는 요청/응답, Service는 비즈니스 로직, Mapper는 DB 접근을 담당한다.
- `@Controller`, `@Service`, `@Mapper`, `@Bean`으로 등록된 객체는 Spring Bean으로 관리되고 생성자 주입을 받을 수 있다.
- JSP form DTO는 `@ModelAttribute` 바인딩을 위해 기본 생성자와 setter가 필요하다.
- 실패 화면에서 username은 유지하고 password는 유지하지 않는 것이 좋다.

## 다음 평가 때 Codex가 확인할 것

- DB 기반 로그인 흐름을 `SecurityFilterChain -> DbUserDetailsService -> UserMapper -> users` 순서로 설명할 수 있는지
- 회원가입 흐름을 `Controller -> Service -> Mapper -> DB` 순서로 설명할 수 있는지
- BCrypt 해시와 평문 비밀번호의 차이를 설명할 수 있는지
- 사용자별 데이터 소유권이 왜 필요한지 설명할 수 있는지
- Controller, Service, Mapper 책임 분리가 유지되는지
