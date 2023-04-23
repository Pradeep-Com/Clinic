<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Doctors</title>
</head>
<body>
    <h1>List of Doctors</h1>
    <table>
        <thead>
            <tr>
                <th>Name</th>
                <th>Specialization</th>
                <th>Address</th>
                <th>Phone</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${doctors}" var="doctor">
                <tr>
                    <td>${doctor.name}</td>
                    <td>${doctor.specialization}</td>
                    <td>${doctor.address}</td>
                    <td>${doctor.phone}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <br>
    <a href="${pageContext.request.contextPath}/doctor/new">Add New Doctor</a>
</body>
</html>
