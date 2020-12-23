<%--
  Created by IntelliJ IDEA.
  User: alexy
  Date: 29.09.2020
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>GAMES</title>
    <link href="<c:url value="/res/style.css"/>" rel="stylesheet" type="text/css"/>
</head>
<body>

<h2>Games</h2>
<table class="table table-dark">
    <thead>
    <tr>
        <th scope="col">id</th>
        <th scope="col">title</th>
        <th scope="col">year</th>
        <th scope="col">genre</th>
        <th scope="col">brand</th>
        <th scope="col">ageControl</th>
        <th scope="col">cost</th>
        <th scope="col">numberOfCopies</th>
        <th scope="col">action</th>
    </tr>
    </thead>
    <c:forEach var="game" items="${gameList}">
        <tr>
            <td>${game.id}</td>
            <td>${game.title}</td>
            <td>${game.year}</td>
            <td>${game.genre}</td>
            <td>${game.brand}</td>
            <td>${game.ageControl}</td>
            <td>${game.cost}</td>
            <td>${game.numberOfCopies}</td>
            <td>
                <a href="/edit/${game.id}">edit</a>
                <a href="/delete/${game.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<h2>You can push "add" to add product:</h2>
<c:url value="/add" var="add"/>
<a href="${add}">Add new game</a>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

</body>
</html>
