<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Room</title>
</head>
<body>
    <h2>Add New Room</h2>
    <form:form method="post" action="/room/add">
        <table>
            <tr>
                <td>Room Number:</td>
                <td><form:input path="roomNumber" /></td>
            </tr>
            <tr>
                <td>Room Type:</td>
                <td><form:input path="roomType" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Save" /></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
