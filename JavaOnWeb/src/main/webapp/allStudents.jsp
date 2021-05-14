<%--
  Created by IntelliJ IDEA.
  User: anselme-dev
  Date: 5/6/2021
  Time: 9:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>All students</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css">
</head>
<body class="bg-light vh-100 pt-5">
    <div class="container">
        <a href="index.jsp">Student Management system</a>
        <div class="card card-body mt-5">
            <div class="d-flex justify-content-between align-items-baseline">
                <h1 class="mb-5">All Students</h1>
                <div>
                    <a href="new-student">Create New</a>
                </div>
            </div>
            <div>
                <table class="table table-bordered">
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>First name</th>
                        <th>Last name</th>
                        <th>Email</th>
                        <th>Gender</th>
                        <th>Year</th>
                        <th>Class</th>
                        <th colspan="2">Action</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="student" items="${students}">
                        <tr>
                            <td>${student.id}</td>
                            <td><c:out value="${student.firstName}" /></td>
                            <td><c:out value="${student.lastName}" /></td>
                            <td><c:out value="${student.email}" /></td>
                            <td><c:out value="${student.gender}" /></td>
                            <td><c:out value="${student.year}" /></td>
                            <td><c:out value="${student.className}" /></td>
                            <td><a href="edit-student?id=${student.id}">Update</a></td>
                            <td><a href="students?action=DELETE&id=${student.id}" class="text-danger">Delete</a></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
