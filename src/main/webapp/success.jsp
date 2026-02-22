<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Operation Successful</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #56ab2f, #a8e063);
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
        width: 320px;
        text-align: center;
    }

    h1 {
        color: #2e7d32;
        margin-bottom: 20px;
    }

    a {
        text-decoration: none;
        background: #2e7d32;
        color: white;
        padding: 10px 20px;
        border-radius: 6px;
        font-weight: bold;
        display: inline-block;
        transition: 0.3s;
    }

    a:hover {
        background: #1b5e20;
    }
</style>

</head>
<body>

<div class="container">
    <h1>Operation Done!</h1>
    <a href="manager.jsp">Go to Dashboard</a>
</div>

</body>
</html>