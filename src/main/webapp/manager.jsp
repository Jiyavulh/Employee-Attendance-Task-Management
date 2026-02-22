<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manager Dashboard</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #232526, #414345);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        margin: 0;
    }

    .container {
        background: white;
        padding: 40px;
        border-radius: 12px;
        box-shadow: 0 10px 25px rgba(0,0,0,0.2);
        width: 340px;
        text-align: center;
    }

    h2 {
        margin-bottom: 25px;
        color: #333;
    }

    .btn {
        display: block;
        text-decoration: none;
        background: #232526;
        color: white;
        padding: 12px;
        margin: 12px 0;
        border-radius: 6px;
        font-weight: bold;
        transition: 0.3s;
    }

    .btn:hover {
        background: #000000;
    }

    .logout {
        background: #e53935;
    }

    .logout:hover {
        background: #c62828;
    }
</style>

</head>
<body>

<div class="container">
    <h2>Manager Dashboard</h2>

    <a class="btn" href="addDeveloper.jsp">Add Developer</a>
    <a class="btn" href="createTask.jsp">Create Task</a>
    <a class="btn" href="assignTask.jsp">Assign Task</a>
    <a class="btn" href="viewDeveloperWithTask">View All Developers</a>
    <a class="btn" href="deleteDeveloper.jsp">Delete Developer</a>
    <a class="btn logout" href="logout.jsp">Logout</a>
</div>

</body>
</html>