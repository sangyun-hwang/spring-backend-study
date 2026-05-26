<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Study Log</title>
</head>
<body>
<h1>Edit Study Log</h1>
<c:if test="${not empty errors}">
    <ul>
        <c:forEach var="error" items="${errors}">
            <li>${error.field}: ${error.defaultMessage}</li>
        </c:forEach>
    </ul>
</c:if>

<form method="post" action="/mvc/study-logs/${id}/edit">
    <label>
        Title
        <input type="text" name="title" value="${request.title}">
    </label>
    <br>

    <label>
        Category
        <select name="category">
            <option value="JAVA" ${request.category == 'JAVA' ? 'selected' : ''}>JAVA</option>
            <option value="SPRING" ${request.category == 'SPRING' ? 'selected' : ''}>SPRING</option>
            <option value="DATABASE" ${request.category == 'DATABASE' ? 'selected' : ''}>DATABASE</option>
        </select>
    </label>
    <br>

    <label>
        Minutes
        <input type="number" name="minutes" value="${request.minutes}">
    </label>
    <br>

    <label>
        Memo
        <textarea name="memo">${request.memo}</textarea>
    </label>
    <br>

    <button type="submit">Update</button>
</form>

<a href="/mvc/study-logs">Back to list</a>
</body>
</html>