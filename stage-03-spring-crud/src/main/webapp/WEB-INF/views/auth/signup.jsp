<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Signup</title>
</head>
<body>
<h1>Signup</h1>

<c:if test="${not empty usernameError}">
    <p>${usernameError}</p>
</c:if>
<c:if test="${not empty errors}">
    <ul>
        <c:forEach var="error" items="${errors}">
            <li>${error.field}: ${error.defaultMessage}</li>
        </c:forEach>
    </ul>
</c:if>


<form method="post" action="/mvc/signup">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">

    <label>
        Username
        <input type="text" name="username" value="${signupRequest.username}">
    </label>
    <br>

    <label>
        Password
        <input type="password" name="password">
    </label>
    <br>

    <button type="submit">Signup</button>
</form>

<a href="/mvc/login">Login</a>
</body>
</html>