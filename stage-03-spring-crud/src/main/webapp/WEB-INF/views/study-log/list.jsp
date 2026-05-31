<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Study Logs</title>
</head>
<body>
<h1>Study Logs</h1>

<p>
    <sec:authentication property="name"/>님 로그인 중
</p>

<p>totalCount: ${totalCount}</p>
<p>totalPages: ${totalPages}</p>
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

    <label>
        sorting
        <select name="sort">
            <option value="id" ${sort == 'id' ? 'selected' : ''}>id</option>
            <option value="minutes" ${sort == 'minutes' ? 'selected' : ''}>minutes</option>
            <option value="title" ${sort == 'title' ? 'selected' : ''}>title</option>
        </select>
    </label>

    <label>
        direction
        <select name="direction">
            <option value="ASC" ${direction == 'ASC' ? 'selected' : ''}>ASC</option>
            <option value="DESC" ${direction == 'DESC' ? 'selected' : ''}>DESC</option>
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

                    <sec:authorize access="hasRole('ADMIN')">
                        <form method="post" action="/mvc/study-logs/${log.id}/delete" style="display:inline;">
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
                            <button type="submit">Delete</button>
                        </form>
                    </sec:authorize>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<c:if test="${page > 1}">
    <a href="/mvc/study-logs?title=${title}&category=${category}&page=${page-1}&size=${size}&sort=${sort}&direction=${direction}">&lt;</a>
</c:if>
<c:forEach var="pageNumber" begin="${startPage}" end="${endPage}">
    <c:choose>
        <c:when test="${pageNumber == page}">
            <strong>${pageNumber}</strong>
        </c:when>
        <c:otherwise>
            <a href="/mvc/study-logs?title=${title}&category=${category}&page=${pageNumber}&size=${size}&sort=${sort}&direction=${direction}">
                ${pageNumber}
            </a>
        </c:otherwise>
    </c:choose>
</c:forEach>
<c:if test="${page < totalPages}">
    <a href="/mvc/study-logs?title=${title}&category=${category}&page=${page+1}&size=${size}&sort=${sort}&direction=${direction}">&gt;</a>
</c:if>
<br>
<form method="post" action="/mvc/logout" style="display:inline;">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
    <button type="submit">Logout</button>
</form>
</body>
</html>
