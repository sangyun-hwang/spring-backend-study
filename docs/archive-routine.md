# Learning Archive Routine

이 문서는 `spring-backend-study`에서 공부하면서 생긴 질문을 `learning-archive`에 정리하는 루틴입니다.

참고 레포:

- https://github.com/sangyun-hwang/learning-archive

## 목적

코딩 레포에는 실제 실습 코드와 진행 상황을 남기고, `learning-archive`에는 개념 질문과 이해 내용을 정리한다.

분리 기준:

- `spring-backend-study`: 직접 작성한 코드, 단계별 과제, 리뷰 요청, 진행 상태, 커리큘럼
- `learning-archive`: 개념 정리, 질문과 답변, 헷갈렸던 표현, 나중에 다시 볼 설명

## 기록 타이밍

아래 상황이 생기면 학습 아카이브에 기록한다.

- 처음 듣는 개념을 질문했을 때
- 기존에 알던 개념과 Java/Spring의 차이를 알게 되었을 때
- IntelliJ, Git, Java 문법처럼 반복해서 헷갈릴 수 있는 설정을 해결했을 때
- 한 단계가 끝났고, 배운 내용을 말로 정리할 수 있을 때
- 지원서나 면접에서 설명할 수 있는 문장이 생겼을 때

## 권장 위치

현재는 주제별 문서에 누적한다.

```text
cs/Backend/Java.md
cs/Backend/Spring.md
cs/Backend/Database.md
cs/보안/CSRF.md
```

필요하면 별도 주제 파일을 추가한다.

```text
cs/Backend/SpringSecurity.md
cs/Backend/MyBatis.md
```

## 기록 포맷

```md
## 주제
날짜: YYYY-MM-DD
분류: Java / Spring / Database / Security
상태: 이해 중 / 정리 완료 / 다시 볼 것

### 질문

처음에 궁금했던 내용을 적는다.

### 짧은 답

한두 문장으로 결론을 적는다.

### 내가 이해한 내용

내 말로 다시 설명한다.

### 다시 볼 포인트

- 나중에 헷갈릴 만한 점
- 다음 단계에서 연결되는 개념
```

## Codex와 함께 쓰는 루틴

질문 후 아래처럼 요청한다.

```text
방금 질문한 내용을 learning-archive 포맷으로 정리해줘.
```

또는 챕터 종료 시:

```text
오늘 마무리 정리하고 learning-archive에 남겨줘.
```

## 커밋 메시지

`learning-archive`에 기록할 때는 아래 형식을 권장한다.

```text
[study] Java ArrayList 개념 정리
[study] MyBatis 바인딩 문법 비교 정리
[study] DB 기반 로그인 회원가입 정리
```
