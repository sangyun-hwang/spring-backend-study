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
<c:if test="${not empty error}">
    <p>${error}</p>
</c:if>
<form method="post" action="/mvc/login">
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
