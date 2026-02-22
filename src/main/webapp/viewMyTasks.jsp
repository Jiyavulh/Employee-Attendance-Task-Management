<%@ page import="java.util.List"%>
<%@ page import="com.eatm.entity.Task"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Tasks</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #141e30, #243b55);
        margin: 0;
        padding: 30px;
    }

    h2 {
        text-align: center;
        color: white;
        margin-bottom: 30px;
    }

    .container {
        width: 80%;
        margin: auto;
    }

    .card {
        background: white;
        padding: 20px;
        margin: 15px 0;
        border-radius: 10px;
        box-shadow: 0 8px 20px rgba(0,0,0,0.2);
    }

    .card h3 {
        margin: 0 0 10px;
        color: #333;
    }

    .card p {
        margin: 5px 0;
        color: #555;
    }

    .back-btn {
        display: block;
        width: 220px;
        margin: 30px auto;
        text-align: center;
        text-decoration: none;
        background: #243b55;
        color: white;
        padding: 12px;
        border-radius: 6px;
        font-weight: bold;
        transition: 0.3s;
    }

    .back-btn:hover {
        background: #141e30;
    }

    .no-task {
        text-align: center;
        color: white;
        font-size: 18px;
        margin-top: 30px;
    }
</style>

</head>
<body>

<h2>My Assigned Tasks</h2>

<div class="container">

<%
List<Task> list = (List<Task>) request.getAttribute("taskList");

if (list != null && !list.isEmpty()) {
    for (Task task : list) {
%>

<div class="card">
    <h3>Task ID: <%= task.getTaskId() %></h3>
    <p><strong>Task Name:</strong> <%= task.getTaskName() %></p>
    <p><strong>Duration:</strong> <%= task.getDuration() %> days</p>
    <p><strong>Status:</strong> <%= task.getStatus() %></p>
</div>

<%
    }
} else {
%>
<div class="no-task">No tasks assigned</div>
<%
}
%>

<a class="back-btn" href="developer.jsp">Back to Dashboard</a>

</div>

</body>
</html>