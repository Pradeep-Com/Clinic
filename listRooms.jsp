<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Rooms</title>
</head>
<body>
    <h2>List of Rooms</h2>
    <table>
        <tr>
            <th>Room Number</th>
            <th>Room Type</th>
        </tr>
        <c:forEach var="room" items="${rooms}">
            <tr>
                <td>${room.roomNumber}</td>
                <td>${room.roomType}</td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <a href="/room/new">Add New Room</a>
</body>
</html>
