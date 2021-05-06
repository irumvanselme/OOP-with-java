<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 5/6/2021
  Time: 9:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Student</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css">
</head>
<body class="bg-light vh-100 pt-5">
<div class="container">
    <div class="card card-body">
        <div class="d-flex justify-content-between align-items-baseline">
            <h1 class="mb-5">New Student</h1>
            <div>
                <a href="">View all students</a>
            </div>
        </div>
        <div class="form-group">
            <label for="first_name">First name</label>
            <input id="first_name" type="text" class="form-control bg-light">
        </div>
        <div class="mt-3">
            <label for="last_name">Last name</label>
            <input id="last_name" type="text" class="form-control bg-light">
        </div>
        <div class="mt-3">
            <label for="email">Email</label>
            <input id="email" type="email" class="form-control bg-light">
        </div>
        <div class="mt-3">
            <label for="year">Year</label>
            <select id="year" class="form-control bg-light">
                <option disabled selected> - select the year -</option>
                <option value="Year 1">Year 1</option>
                <option value="Year 2">Year 2</option>
                <option value="Year 3">Year 3</option>
            </select>
        </div>
        <div class="mt-3">
            <label for="class">Class</label>
            <select id="class" class="form-control bg-light">
                <option disabled selected> - select the class -</option>
                <option value="Class A">Class A</option>
                <option value="Class B">Class B</option>
                <option value="Class C">Class C</option>
            </select>
        </div>
        <div class="mt-5">
            <button class="btn btn-info w-100">
                CREATE STUDENT
            </button>
        </div>
    </div>
</div>
</body>
</html>
