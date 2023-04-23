<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Admin</title>
</head>
<body>
    <h2>Add New Admin</h2>
    <form:form action="/admin/new" method="post" modelAttribute="admin">
        <table>
            <tr>
                <td><form:label path="name">Name:</form:label></td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td><form:label path="username">Username:</form:label></td>
                <td><form:input path="username" /></td>
            </tr>
            <tr>
                <td><form:label path="password">Password:</form:label></td>
                <td><form:input path="password" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Add" /></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
