<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Главная страница</title>
</head>
<body>
<h1>Главная страница</h1>
<form action="sort" method="post">
    <input type="text" name="numbers" placeholder="Введите числа" required>
    <br><br>
    <input type="radio" name="sortOrder" value="asc" checked> Возрастающая
    <input type="radio" name="sortOrder" value="desc"> Убывающая
    <br><br>
    <button type="submit">Сортировать</button>
</form>
</body>
</html>