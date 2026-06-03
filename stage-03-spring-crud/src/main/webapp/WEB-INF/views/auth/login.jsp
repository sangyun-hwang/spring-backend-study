<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<h1>Login</h1>
<c:if test="${param.signupSuccess != null}">
    <p>회원가입이 완료되었습니다. 로그인해주세요.</p>
</c:if>
<c:if test="${param.error != null}">
    <p>아이디 또는 비밀번호가 올바르지 않습니다.</p>
</c:if>

<c:if test="${param.logout != null}">
    <p>로그아웃되었습니다.</p>
</c:if>
<form method="post" action="/mvc/login">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
    <label>
        Username
        <input type="text" name="username">
    </label>
    <br>

    <label>
        Password
        <input type="password" name="password">
    </label>
    <br>

    <button type="submit">Login</button>
</form>
</body>
</html>
