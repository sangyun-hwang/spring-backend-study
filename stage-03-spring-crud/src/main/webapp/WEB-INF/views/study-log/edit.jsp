<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Study Log</title>
</head>
<body>
<h1>Edit Study Log</h1>

<form method="post" action="/mvc/study-logs/${log.id}/edit">
    <label>
        Title
        <input type="text" name="title" value="${log.title}">
    </label>
    <br>

    <label>
        Category
        <select name="category">
            <option value="JAVA" ${log.category == 'JAVA' ? 'selected' : ''}>JAVA</option>
            <option value="SPRING" ${log.category == 'SPRING' ? 'selected' : ''}>SPRING</option>
            <option value="DATABASE" ${log.category == 'DATABASE' ? 'selected' : ''}>DATABASE</option>
        </select>
    </label>
    <br>

    <label>
        Minutes
        <input type="number" name="minutes" value="${log.minutes}">
    </label>
    <br>

    <label>
        Memo
        <textarea name="memo">${log.memo}</textarea>
    </label>
    <br>

    <button type="submit">Update</button>
</form>

<a href="/mvc/study-logs">Back to list</a>
</body>
</html>