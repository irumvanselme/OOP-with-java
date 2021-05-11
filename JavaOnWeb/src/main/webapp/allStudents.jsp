<%--
  Created by IntelliJ IDEA.
  User: anselme-dev
  Date: 5/6/2021
  Time: 9:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All students</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css">
</head>
<body class="bg-light vh-100 pt-5">
    <div class="container">
        <div class="card card-body">
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
                        <th>Year</th>
                        <th>Class</th>
                        <th>Action</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>#</td>
                        <td>First name</td>
                        <td>Last name</td>
                        <td>Email</td>
                        <td>Year</td>
                        <td>Class</td>
                        <td>Action</td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
