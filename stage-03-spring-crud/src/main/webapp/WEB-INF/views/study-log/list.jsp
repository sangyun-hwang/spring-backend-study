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