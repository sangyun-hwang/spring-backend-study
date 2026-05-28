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
<c:if test="${not empty loginUser}">
    <p>${loginUser}님 로그인 중</p>
</c:if>
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
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
        <c:if test="${empty logs}">
            <tr>
                <td colspan="6">No study logs found.</td>
            </tr>
        </c:if>

        <c:forEach var="log" items="${logs}">
            <tr>
                <td>${log.id}</td>
                <td>${log.title}</td>
                <td>${log.category}</td>
                <td>${log.minutes}</td>
                <td>${log.memo}</td>
                <td>
                    <a href="/mvc/study-logs/${log.id}/edit">Edit</a>

                    <form method="post" action="/mvc/study-logs/${log.id}/delete" style="display:inline;">
                        <button type="submit">Delete</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<c:if test="${page > 1}">
    <a href="/mvc/study-logs?title=${title}&category=${category}&page=${page-1}&size=${size}">&lt;</a>
</c:if>
<a href="/mvc/study-logs?title=${title}&category=${category}&page=${page+1}&size=${size}">&gt;</a>
<br>
<form method="post" action="/mvc/logout" style="display:inline;">
    <button type="submit">Logout</button>
</form>
</body>
</html>
