# Progress

마지막 업데이트: 2026-06-07

## 현재 상태

- 현재 단계: Stage 13 시작 전
- 최근 완료: Stage 12 예외 처리와 사용자별 데이터 소유권
- 다음 목표: 지금까지 만든 JSP/MyBatis/Spring MVC 구조를 SI/전자정부프레임워크 관점으로 정리하기
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
| 12 | 예외 처리와 사용자별 데이터 소유권 | Completed | 2026-06 | 현재 로그인 사용자와 StudyLog 소유 관계 연결 |
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

- Stage 12: `study_logs.user_id`와 `users.id` 외래키 관계 추가
- Stage 12: 기존 StudyLog 데이터에 사용자 소유자 정보 보정
- Stage 12: 로그인 사용자 기준으로 목록/상세/생성/수정/삭제 제한
- Stage 12: `findByIdAndUserId`, `WHERE id = #{id} AND user_id = #{userId}`로 소유권 검증
- Stage 12: MVC와 MyBatis REST 양쪽에 사용자별 데이터 소유권 적용
- Stage 12: 남의 데이터와 없는 데이터를 같은 예외 흐름으로 처리하는 이유 정리
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

1. JSP + MyBatis + Spring MVC 구조를 SI/전자정부프레임워크 관점에서 설명할 수 있게 정리한다.
2. Controller, Service, Mapper, JSP, XML Mapper의 요청 흐름을 다시 그린다.
3. 공통 코드, 공통 메시지, 공통 예외 처리 같은 업무형 프로젝트 구조를 학습한다.
4. 지금 프로젝트를 포트폴리오 README로 정리하기 위한 설명 문장을 준비한다.
5. Stage 13 이후 포트폴리오 미니 프로젝트 정리로 넘어간다.

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
- 사용자별 데이터 소유권은 개인정보 보호와 데이터 격리를 위해 필요하다.
- `study_logs.user_id`는 각 학습 기록의 소유자를 나타내며 `users.id`를 참조한다.
- 생성 시 `user_id`는 form/JSON에서 받지 않고 서버의 현재 로그인 사용자 기준으로 정한다.
- 목록 조회에는 `WHERE user_id = #{userId}` 조건이 필요하다.
- 수정/삭제에는 `WHERE id = #{id} AND user_id = #{userId}` 조건이 필요하다.
- 없는 데이터와 남의 데이터는 보안상 같은 예외로 처리할 수 있다.
- 화면에서 버튼을 숨기는 것은 UX이고, 서버/DB 조건으로 막는 것이 실제 보안이다.

## 다음 평가 때 Codex가 확인할 것

- 사용자별 데이터 소유권 흐름을 `Authentication -> UserMapper -> userId -> StudyLogMapper` 순서로 설명할 수 있는지
- `findById(id)`와 `findByIdAndUserId(id, userId)`의 차이를 설명할 수 있는지
- 외래키와 `NOT NULL` 컬럼 추가 시 기존 데이터 보정이 필요한 이유를 설명할 수 있는지
- MVC와 REST 양쪽에서 소유권 검증이 빠지면 어떤 문제가 생기는지 설명할 수 있는지
- Stage 13에서 JSP/MyBatis/Spring MVC 구조를 SI 관점으로 연결할 수 있는지
