<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin List</title>
</head>
<body>
    <h2>Admin List</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Username</th>
            <th>Password</th>
        </tr>
        <c:forEach var="admin" items="${admins}">
            <tr>
                <td>${admin.id}</td>
                <td>${admin.name}</td>
                <td>${admin.username}</td>
                <td>${admin.password}</td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <a href="/admin/new/form">Add New Admin</a>
</body>
</html>
