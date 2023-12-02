<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 02.12.2023
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Результат сортировки</title>
</head>
<body>
<h1>Результат сортировки</h1>
<ul>
  <c:forEach var="number" items="${numbers}">
    <li>${number}</li>
  </c:forEach>
</ul>
<a href="index">Вернуться</a>
</body>
</html>