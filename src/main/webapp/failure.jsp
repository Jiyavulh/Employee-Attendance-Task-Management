<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Operation Failed</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #ff416c, #ff4b2b);
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

    h2 {
        color: #c62828;
        margin-bottom: 25px;
    }

    a {
        text-decoration: none;
        background: #c62828;
        color: white;
        padding: 10px 20px;
        border-radius: 6px;
        font-weight: bold;
        display: inline-block;
        transition: 0.3s;
    }

    a:hover {
        background: #8e0000;
    }
</style>

</head>
<body>

<div class="container">
    <h2>Operation Failed</h2>
    <a href="login.jsp">Try Again</a>
</div>

</body>
</html>