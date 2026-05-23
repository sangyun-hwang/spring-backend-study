<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Study Logs</title>
</head>
<body>
<h1>Study Logs</h1>
<form method="get" action="/mvc/study-logs">
    <label>
        Title
        <input type="text" name="title" value="${title}">
    </label>

    <label>
        Category
        <select name="category">
            <option value="">All</option>
            <option value="JAVA" ${category == 'JAVA' ? 'selected' : ''}>JAVA</option>
            <option value="SPRING" ${category == 'SPRING' ? 'selected' : ''}>SPRING</option>
            <option value="DATABASE" ${category == 'DATABASE' ? 'selected' : ''}>DATABASE</option>
        </select>
    </label>

    <button type="submit">Search</button>
</form>
<p>JSP view is working.</p>
<p>${message}</p>
<table border="1">
    <thead>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Category</th>
            <th>Minutes</th>
            <th>Memo</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="log" items="${logs}">
            <tr>
                <td>${log.id}</td>
                <td>${log.title}</td>
                <td>${log.category}</td>
                <td>${log.minutes}</td>
                <td>${log.memo}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>