<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <c:if test="${empty game.title}">
        <title>Add</title>
    </c:if>
    <c:if test="${!empty game.title}">
        <title>Edit</title>
    </c:if>
</head>
<body>
<c:if test="${empty game.title}">
    <c:url value="/add" var="var"/>
</c:if>
<c:if test="${!empty game.title}">
    <c:url value="/edit" var="var"/>
</c:if>
<form action="${var}" method="POST">
    <c:if test="${!empty game.title}">
        <input type="hidden" name="id" value="${game.id}">
    </c:if>
    <label for="title">Title</label>
    <input type="text" name="title" id="title">
    <label for="year">year</label>
    <input type="text" name="year" id="year">
    <label for="genre">genre</label>
    <input type="text" name="genre" id="genre">
    <label for="brand">brand</label>
    <input type="text" name="brand" id="brand">
    <label for="ageControl">ageControl</label>
    <input type="text" name="ageControl" id="ageControl">
    <label for="cost">cost</label>
    <input type="text" name="cost" id="cost">
    <label for="numberOfCopies">numberOfCopies</label>
    <input type="text" name="numberOfCopies" id="numberOfCopies">
    <c:if test="${empty game.title}">
        <input type="submit" value="Add new game">
    </c:if>
    <c:if test="${!empty game.title}">
        <input type="submit" value="Edit game">
    </c:if>
</form>
</body>
</html>