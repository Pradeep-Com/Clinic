<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Doctor</title>
</head>
<body>
    <h1>Add New Doctor</h1>
    <form action="${pageContext.request.contextPath}/doctor/save" method="post">
        <label for="name">Name:</label>
        <input type="text" name="name" id="name" required><br>
        <label for="specialization">Specialization:</label>
        <input type="text" name="specialization" id="specialization" required><br>
        <label for="address">Address:</label>
        <input type="text" name="address" id="address" required><br>
        <label for="phone">Phone:</label>
        <input type="text" name="phone" id="phone" required><br>
        <input type="submit" value="Add Doctor">
    </form>
</body>
</html>
