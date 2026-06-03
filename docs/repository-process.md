# Repository Process

이 문서는 `spring-backend-study`와 `learning-archive`를 함께 관리하는 기준입니다.

## 저장소 역할

| Repository | 역할 | 커밋 타이밍 |
| --- | --- | --- |
| `spring-backend-study` | 실습 코드, 단계별 과제, 커리큘럼, 진행표 | 문제 하나 완료 후 점검이 끝날 때 |
| `learning-archive` | 개념 정리, 질문 답변, 다시 볼 설명 | 개념 챕터 종료 또는 중요한 질문을 정리할 때 |

## 기본 학습 루프

1. Codex가 문제를 제시한다.
2. 사용자가 직접 코드를 작성한다.
3. Codex가 코드/이해도를 점검한다.
4. 필요한 수정은 사용자가 직접 적용한다.
5. 문제가 완료되면 Codex가 커밋한다.
6. 챕터 종료 시 Codex가 learning-archive에 개념 정리를 추가한다.
7. 하루 종료 또는 챕터 종료 시 두 저장소를 푸시한다.

## Codex 작업 원칙

- 사용자가 학습 중인 코드는 직접 고치지 않는다.
- 오타, formatting, 문서 정리, 커밋/푸시, 진행표 관리는 Codex가 도울 수 있다.
- 코드 수정이 필요하면 원인과 수정 방향을 먼저 설명하고 사용자가 직접 적용한다.
- 문제 하나가 끝나면 커밋한다.
- 커밋 메시지는 한국어로 작성하고 `[stage-XX]`, `[docs]`, `[study]` 태그를 사용한다.

## 커밋 메시지 예시

```text
[stage-11] 회원가입 입력 길이 검증 추가
[stage-11] 회원가입 로직 서비스 분리
[docs] 커리큘럼과 진행 현황 정리
[study] DB 기반 로그인 회원가입 정리
```

## 푸시 기준

- 사용자가 명시적으로 푸시를 요청하면 즉시 푸시한다.
- 하루 학습 종료 시 푸시한다.
- 챕터가 완료되면 두 저장소 모두 푸시한다.

## learning-archive 기록 기준

`learning-archive`에는 실습 코드가 아니라 개념을 남긴다.

주요 위치:

```text
cs/Backend/Java.md
cs/Backend/Spring.md
cs/Backend/Database.md
cs/보안/CSRF.md
```

기록 대상:

- 새로 배운 개념
- 헷갈렸던 질문
- Java/Spring과 프론트엔드 경험의 차이
- 챕터 마무리 정리
- 면접/지원서에서 설명할 수 있는 문장

## 현재 활성 커리큘럼

- 현재 완료: Stage 11 DB 기반 로그인과 회원가입
- 다음 단계: Stage 12 예외 처리와 사용자별 데이터 소유권
- 장기 목표: Stage 14 포트폴리오 정리 후 필요하면 Stage 15 JPA 선택 확장
