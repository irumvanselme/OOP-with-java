<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 5/14/2021
  Time: 11:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit a Student</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body class="bg-light vh-100 pt-3">
<div class="container">
    <a href="index.jsp">Student Management system</a>
    <div class="card card-body mt-3">
        <div class="d-flex justify-content-between align-items-baseline">
            <h1 class="mb-5">Edit a Student #${student.id}</h1>
            <div>
                <a href="all-students">View all students</a>
                <a href="new-student" class="ml-4">Create New</a>
            </div>
        </div>
        <form action="edit-student" method="post">
            <input type="hidden" name="id" value="${student.id}">
            <div class="form-group">
                <label for="first_name">First name</label>
                <input id="first_name" name="first_name" type="text" class="form-control bg-light"
                       value="${student.firstName}" required>
            </div>
            <div class="mt-1">
                <label for="last_name">Last name</label>
                <input id="last_name" name="last_name" type="text" class="form-control bg-light"
                       value="${student.lastName}" required>
            </div>
            <div class="mt-1">
                <label for="email">Email</label>
                <input id="email" type="email" name="email" class="form-control bg-light" value="${student.email}"
                       required>
            </div>
            <div class="mt-1">
                <label>Gender</label>
                <div class="d-flex">
                    <div class="form-check">
                        <input class="form-check-input" type="radio" value="Male" name="gender" id="defaultCheck1" <c:if test="${student.gender==\"Male\"}">checked="checked"</c:if>/>
                        <label class="form-check-label" for="defaultCheck1">
                            Male
                        </label>
                    </div>
                    <div class="form-check ml-5">
                        <input class="form-check-input" type="radio" value="Female" name="gender" id="defaultCheck2"
                               <c:if test="${student.gender==\"Female\"}">checked="checked"</c:if>
                        >
                        <label class="form-check-label" for="defaultCheck2">
                            Female
                        </label>
                    </div>
                </div>
            </div>
            <div class="mt-2">
                <label for="year">Year</label>
                <select id="year" class="form-control bg-light" required name="year"
                        value="${student.firstName == "Male"}">
                    <option disabled selected> - select the year -</option>
                    <option value="Year 1" <c:if test="${student.year==\"Year 1\"}">selected="selected"</c:if>>Year 1</option>
                    <option value="Year 2" <c:if test="${student.year==\"Year 2\"}">selected="selected"</c:if>>Year 2</option>
                    <option value="Year 3" <c:if test="${student.year==\"Year 3\"}">selected="selected"</c:if>>Year 3</option>
                </select>
            </div>
            <div class="mt-2">
                <label for="class">Class</label>
                <select id="class" class="form-control bg-light" required name="class">
                    <option disabled selected> - select the class -</option>
                    <option value="Class A" <c:if test="${student.className==\"Class A\"}">selected="selected"</c:if>>Class A</option>
                    <option value="Class B" <c:if test="${student.className==\"Class B\"}">selected="selected"</c:if>>Class B</option>
                    <option value="Class C" <c:if test="${student.className==\"Class C\"}">selected="selected"</c:if>>Class C</option>
                </select>
            </div>
            <div class="mt-5">
                <button class="btn btn-info w-100" type="submit">
                    EDIT YOUR STUDENT
                </button>
            </div>
        </form>
    </div>
</div>
</body>
</html>
