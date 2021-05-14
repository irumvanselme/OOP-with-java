<%--
  Created by IntelliJ IDEA.
  User: anselme-dev
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
<body class="bg-light vh-100 pt-3">
<div class="container">
    <a href="index.jsp">Student Management system</a>
    <div class="card card-body mt-3">
        <div class="d-flex justify-content-between align-items-baseline">
            <h1 class="mb-5">New Student</h1>
            <div>
                <a href="all-students">View all students</a>
            </div>
        </div>
        <form action="students" method="post">
            <div class="form-group">
                <label for="first_name">First name</label>
                <input id="first_name" name="first_name" type="text" class="form-control bg-light" required>
            </div>
            <div class="mt-1">
                <label for="last_name">Last name</label>
                <input id="last_name" name="last_name" type="text" class="form-control bg-light" required>
            </div>
            <div class="mt-1">
                <label for="email">Email</label>
                <input id="email" type="email" name="email" class="form-control bg-light" required>
            </div>
            <div class="mt-1">
                <label>Gender</label>
                <div class="d-flex">
                    <div class="form-check">
                        <input class="form-check-input" type="radio" value="Male" name="gender" id="defaultCheck1">
                        <label class="form-check-label" for="defaultCheck1">
                            Male
                        </label>
                    </div>
                    <div class="form-check ml-5">
                        <input class="form-check-input" type="radio" value="Female" name="gender" id="defaultCheck2">
                        <label class="form-check-label" for="defaultCheck2">
                            Female
                        </label>
                    </div>
                </div>
            </div>
            <div class="mt-2">
                <label for="year">Year</label>
                <select id="year" class="form-control bg-light" required name="year">
                    <option disabled selected> - select the year -</option>
                    <option value="Year 1">Year 1</option>
                    <option value="Year 2">Year 2</option>
                    <option value="Year 3">Year 3</option>
                </select>
            </div>
            <div class="mt-2">
                <label for="class">Class</label>
                <select id="class" class="form-control bg-light" required name="class">
                    <option disabled selected> - select the class -</option>
                    <option value="Class A">Class A</option>
                    <option value="Class B">Class B</option>
                    <option value="Class C">Class C</option>
                </select>
            </div>
            <div class="mt-5">
                <button class="btn btn-info w-100" type="submit">
                    CREATE STUDENT
                </button>
            </div>
        </form>
    </div>
</div>
</body>
</html>
